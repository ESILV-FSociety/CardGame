import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import fr.esilv.fsociety.cardgame.api.Game;
import fr.esilv.fsociety.cardgame.api.races.Korrigan;
import org.junit.runner.RunWith;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

@RunWith(Cucumber.class)

public class MyStepdefsKorrigan {
    private Game game;
    private Korrigan cardKorrigan;

    @Given("^I have a korrigan card in my hand$")
    public void iHaveAKorriganCardInMyHand() throws Throwable {
        Game game = new Game();
        Korrigan cardKorrigan = new Korrigan();
        game.getCurrentPlayer().getBoard().addCardToHand(cardKorrigan);
    }

    @When("^I choose to play the korrigan card$")
    public void iChooseToPlayTheKorriganCard() throws Throwable {
        game.getCurrentPlayer().getBoard().getHand()[1]--;
    }

    @Then("^The card korrigan is added to my kingdom, its power is activate$")
    public void theCardKorriganIsAddedToMyKingdomItsPowerIsActivate() throws Throwable {
        game.getCurrentPlayer().getBoard().getKingdom()[1]++;
        cardKorrigan.activatePower(game);
    }

    @And("^I have (\\d+) more cards in my hand$")
    public void iHaveMoreCardsInMyHand(int arg0) throws Throwable {
        assertEquals(game.getCurrentPlayer().getBoard().getHand().length, is(arg0));
    }

    @And("^My opponent has (\\d+) cards in his hand$")
    public void myOpponentHasCardsInHisHand(int arg0) throws Throwable {
        assertEquals(game.getOpponentPlayer().getBoard().getHand().length, is(arg0));
    }
}

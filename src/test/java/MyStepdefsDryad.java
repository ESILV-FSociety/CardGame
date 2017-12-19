import cucumber.api.PendingException;
import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import fr.esilv.fsociety.cardgame.api.*;
import fr.esilv.fsociety.cardgame.api.races.Dryad;
import org.junit.runner.RunWith;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

@RunWith(Cucumber.class)

public class MyStepdefsDryad {

    private Game game;
    private Dryad cardDryad;

    @Given("^a dryad card in my hand$")
    public void aDryadCardInMyHand() throws Throwable {
        Game game = new Game();
        Dryad cardDryad = new Dryad();
        game.getCurrentPlayer().getBoard().addCardToHand(cardDryad);
    }

    @When("^I choose to play the dryad card$")
    public void iChooseToPlayTheDryadCard() throws Throwable {
        game.getCurrentPlayer().getBoard().getHand()[4]--;
    }

    @Then("^the card is added to my kingdom, its power is activate$")
    public void theCardIsAddedToMyKingdomItsPowerIsActivate() throws Throwable {
        game.getCurrentPlayer().getBoard().getKingdom()[4]++;
        cardDryad.activatePower(game);
    }

    @And("^I have (\\d+) more card in my kingdom$")
    public void iHaveMoreCardInMyKingdom(int arg0) throws Throwable {
        assertEquals(game.getCurrentPlayer().getBoard().getKingdom().length, is (arg0));
    }
}

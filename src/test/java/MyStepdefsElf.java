import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import fr.esilv.fsociety.cardgame.api.Card;
import fr.esilv.fsociety.cardgame.api.Game;
import fr.esilv.fsociety.cardgame.api.races.Elf;
import gherkin.lexer.El;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

public class MyStepdefsElf {

    private Game game;
    private Elf cardelf;

    @Given("^I have an elf card in my hand$")
    public void iHaveAnElfCardInMyHand() throws Throwable {
        Game game = new Game();
        Card cardelf = new Elf();
        game.getCurrentPlayer().getBoard().addCardToHand(cardelf);
    }

    @When("^I choose to play the elf card$")
    public void iChooseToPlayTheElfCard() throws Throwable {
        game.getCurrentPlayer().getBoard().getHand()[3]--;
    }

    @Then("^The card is added to my kingdom, its power is activate$")
    public void theCardIsAddedToMyKingdomItsPowerIsActivate() throws Throwable {
        game.getCurrentPlayer().getBoard().getKingdom()[3]++;
        cardelf.activatePowerBis(game);
    }

    @And("^play the power of one card on my kingdom$")
    public void playThePowerOfOneCardOnMyKingdom() throws Throwable {

    }
}

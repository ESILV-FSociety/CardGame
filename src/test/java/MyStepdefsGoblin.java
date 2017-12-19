import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import fr.esilv.fsociety.cardgame.api.Game;
import fr.esilv.fsociety.cardgame.api.races.Goblin;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

public class MyStepdefsGoblin {
    private Game game;
    private Goblin cardGoblin;

    @Given("^I have a goblin card in my hand$")
    public void iHaveAGoblinCardInMyHand() throws Throwable {
        Game game = new Game();
        Goblin cardGoblin = new Goblin();
        game.getCurrentPlayer().getBoard().addCardToHand(cardGoblin);
    }

    @When("^I choose to play the goblin card$")
    public void iChooseToPlayTheGoblinCard() throws Throwable {
        game.getCurrentPlayer().getBoard().getHand()[2]--;
    }

    @Then("^The card goblin is added to my kingdom, its power is activate$")
    public void theCardGoblinIsAddedToMyKingdomItsPowerIsActivate() throws Throwable {
        game.getCurrentPlayer().getBoard().getKingdom()[2]++;
        cardGoblin.activatePower(game);
    }

    @And("^I change my hand with the hand of my opponent$")
    public void iChangeMyHandWithTheHandOfMyOpponent() throws Throwable {
        int[] temp = game.getCurrentPlayer().getBoard().getHand();
        game.getCurrentPlayer().getBoard().setHand(game.getOpponentPlayer().getBoard().getHand());
        game.getOpponentPlayer().getBoard().setHand(temp) ;
    }
}

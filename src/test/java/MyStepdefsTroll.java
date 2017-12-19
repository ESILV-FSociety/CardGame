import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import fr.esilv.fsociety.cardgame.api.Game;
import fr.esilv.fsociety.cardgame.api.races.Goblin;
import fr.esilv.fsociety.cardgame.api.races.Troll;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

public class MyStepdefsTroll {
    private Game game;
    private Troll cardTroll;


    @Given("^I have a troll card in my hand$")
    public void iHaveATrollCardInMyHand() throws Throwable {
        Game game = new Game();
        Troll cardTroll = new Troll();
        game.getCurrentPlayer().getBoard().addCardToHand(cardTroll);
    }

    @When("^I choose to play the troll card$")
    public void iChooseToPlayTheTrollCard() throws Throwable {
        game.getCurrentPlayer().getBoard().getHand()[5]--;
    }

    @Then("^The card Gnome is added to my kingdom, its power is activate$")
    public void theCardGnomeIsAddedToMyKingdomItsPowerIsActivate() throws Throwable {
        game.getCurrentPlayer().getBoard().getKingdom()[5]++;
        cardTroll.activatePower(game);
    }

    @And("^I change my kingdom with the kingdom of my opponent$")
    public void iChangeMyKingdomWithTheKingdomOfMyOpponent() throws Throwable {
        int[] temp = game.getCurrentPlayer().getBoard().getKingdom();
        game.getCurrentPlayer().getBoard().setKingdom(game.getOpponentPlayer().getBoard().getKingdom());
        game.getOpponentPlayer().getBoard().setKingdom(temp);
    }
}

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fr.esilv.fsociety.cardgame.api.Game;
import fr.esilv.fsociety.cardgame.api.Human;
import fr.esilv.fsociety.cardgame.api.Player;
import fr.esilv.fsociety.cardgame.api.races.Gnome;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;



public class MyStepdefsGnome {

    private Game game;
    private Gnome cardGnome;

    @Given("^I have a gnome in my hand$")
    public void iHaveAGnomeInMyHand() throws Throwable {
        Game game = new Game();
        Gnome cardGnome = new Gnome();
        game.getCurrentPlayer().getBoard().addCardToHand(cardGnome);
    }

    @Then("^The number of cards in my hand is (\\d+)$")
    public void theNumberOfCardsInMyHandIs(int arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(game.getCurrentPlayer().getBoard().getHand().size(), is(arg0));
        throw new PendingException();
    }

    @When("^I choose the card gnome$")
    public void iChooseTheCardGnome() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        cardGnome.activatePower(game);
        throw new PendingException();
    }

    @Then("^The card mooves to the board$")
    public void theCardMoovesToTheBoard() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(game.getCurrentPlayer().getBoard().getHand().size(), is(0));
        throw new PendingException();
    }

    @And("^The power is activate and I have (\\d+) cards in my hand$")
    public void thePowerIsActivateAndIHaveCardsInMyHand(int arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(game.getCurrentPlayer().getBoard().getHand().size(), is(arg0));
        throw new PendingException();
    }
}

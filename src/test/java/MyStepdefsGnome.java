import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import fr.esilv.fsociety.cardgame.api.*;
import fr.esilv.fsociety.cardgame.api.races.Gnome;
import org.junit.runner.RunWith;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


@RunWith(Cucumber.class)

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
        assertEquals(game.getCurrentPlayer().getBoard().getHand().length, is(arg0));
    }


    @When("^I choose the card gnome and the power is activate$")
    public void iChooseTheCardGnomeAndThePowerIsActivate() throws Throwable {
        game.getCurrentPlayer().getBoard().emptyHand();
        cardGnome.activatePower(game);
    }

    @Then("^I have (\\d+) cards in my hand$")
    public void iHaveCardsInMyHand(int arg0) throws Throwable {
        assertEquals(game.getCurrentPlayer().getBoard().getHand().length, is(arg0));
    }
}

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fr.esilv.fsociety.cardgame.api.Game;
import fr.esilv.fsociety.cardgame.api.Human;
import fr.esilv.fsociety.cardgame.api.Player;
import fr.esilv.fsociety.cardgame.api.races.Dryad;
import fr.esilv.fsociety.cardgame.api.races.Gnome;
import fr.esilv.fsociety.cardgame.api.races.Korrigan;
import static org.junit.Assert.assertEquals;
import static sun.nio.cs.Surrogate.is;


public class MyStepdefsDryad {
    private Game game;
    private Dryad dry;



    @Given("^player have a gnome, a dryad and a korrigan in his hand$")
    public void iHave3cardInMyHand()  {
        Game game = new Game();
        Gnome gno = new Gnome();
        Dryad dry = new Dryad();
        Korrigan korr = new Korrigan();
        game.getCurrentPlayer().getBoard().addCardToHand(gno);
        game.getCurrentPlayer().getBoard().addCardToHand(korr);
        game.getCurrentPlayer().getBoard().addCardToHand(dry);
    }

    @Then("^player2 have 2 card in his hand$")
    public void hehave2cardInhishand(){
        Game game = new Game();
        Gnome gno = new Gnome();
        Dryad dry = new Dryad();
        game.getOpponnent().getBoard().addCardToHand(gno);
        game.getOpponnent().getBoard().addCardToHand(dry);

    }

    @Then("^The number of cards in my hand is (\\d+)$")
    public void theNumberOfCardsInMyHandIs()  {
        // Write code here that turns the phrase above into concrete actions
        //assertEquals(game.getCurrentPlayer().getBoard().getKingdom().size(), is(3));
        throw new PendingException();
    }

    @Then("^The number of cards in his hand is (\\d+)$")
    public void theNumberOfCardsHisMyHandIs()  {
        // Write code here that turns the phrase above into concrete actions
        //assertEquals(game.getCurrentPlayer().getBoard().getKingdom().size(), is (2));
        throw new PendingException();
    }

    @When("^I choose the card Dryad$")
    public void iChooseTheCardDrya()  {
        // Write code here that turns the phrase above into concrete actions
        dry.activatePower(game);
        throw new PendingException();
    }

    @And("^The card mooves opponent kingdom to me $")
    public void theCardMoovesToTheBoard()  {
        // Write code here that turns the phrase above into concrete actions
        //assertEquals(game.getCurrentPlayer().getBoard().getHand().size(), is(4));
        //assertEquals(game.getOpponnent().getBoard().getHand().size(), is(1));
        throw new PendingException();
    }


}

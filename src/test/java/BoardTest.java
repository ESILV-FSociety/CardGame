import fr.esilv.fsociety.cardgame.api.Card;
import fr.esilv.fsociety.cardgame.api.Game;
import fr.esilv.fsociety.cardgame.api.races.Goblin;
import org.junit.Test;

import static org.junit.Assert.*;

public class BoardTest {
    @Test
    //test of the method addCardToHand
    public void addCardToHand() throws Exception {
        Game game = new Game();
        game.StartPlayer();
        Card card = new Goblin();
        int n = game.getCurrentPlayer().getBoard().getHand().size();
        game.getCurrentPlayer().getBoard().addCardToHand(card);
        assertEquals(game.getCurrentPlayer().getBoard().getHand().size(),n + 1);

        assertEquals(card,game.getCurrentPlayer().getBoard().getHand().get(n));
    }

    @Test
    public void updateHand() throws Exception {
    }

}
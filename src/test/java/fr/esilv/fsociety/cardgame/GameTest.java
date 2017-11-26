
package fr.esilv.fsociety.cardgame;

import fr.esilv.fsociety.cardgame.api.Game;
import fr.esilv.fsociety.cardgame.api.Player;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {


    @Test
    public void emptyHands() throws Exception {
        Game game = new Game();
        game.startingPlayer();
        assertTrue(game.emptyHands());
        game.drawCard();
        assertFalse(game.emptyHands());
        game.changePlayer();
        assertFalse(game.emptyHands());
        game.drawCard();
        assertFalse(game.emptyHands());
    }

    @Test
    public void changePlayer() throws Exception {
        Game game = new Game();
        game.setCurrentPlayer(game.getP1());
        game.setOpponentPlayer(game.getP2());
        assertEquals(game.getCurrentPlayer().getString(),"AI");
        assertEquals(game.getOpponentPlayer().getString(),"Human");
        game.changePlayer();
        assertEquals(game.getCurrentPlayer().getString(),"Human");
        assertEquals(game.getOpponentPlayer().getString(),"AI");
    }

    @Test
    public void playersDraw5Cards() throws Exception {
        Game game = new Game();
        game.startingPlayer();
        game.playersDraw5Cards();
        int n1 = 0;
        int n2 = 0;
        for(int i = 0; i < 6; i++){
            n1 += game.getCurrentPlayer().getBoard().getHand()[i];
            n2 += game.getOpponentPlayer().getBoard().getHand()[i];
        }
        assertEquals(n1,5);
        assertEquals(n2,5);
    }

    @Test
    //Test that all the attributes are not null after initialized the game
    public void TestGameAttributes() throws Exception {
        Game game = new Game();
        assertNotNull(game);
        assertNotNull(game.getP1());
        assertNotNull(game.getP2());
        assertNotNull(game.getDealer());
    }
}
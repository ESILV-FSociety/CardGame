package fr.esilv.fsociety.cardgame;

import fr.esilv.fsociety.cardgame.api.Game;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {
    @Test
    public void isHuman() throws Exception {
    }

    @Test
    public void emptyHands() throws Exception {
        Game game = new Game();
        assertTrue(game.emptyHands());
        game.drawCard(game.getP1());
        assertFalse(game.emptyHands());
        game.drawCard(game.getP2());
        assertFalse(game.emptyHands());
    }

    @Test
    public void changePlayer() throws Exception {
        Game game = new Game();
        game.setCurrentPlayer(game.getP1());
        game.changePlayer();
        assertEquals(game.getCurrentPlayer(),game.getP2());
    }

    @Test
    public void playersDraw5Cards() throws Exception {
        Game game = new Game();
        game.playersDraw5Cards();
        assertEquals(game.getP1().getBoard().getHand().size(),5);
        assertEquals(game.getP2().getBoard().getHand().size(),5);
    }

    @Test
    public void drawCard() throws Exception {
    Game game = new Game();
    game.drawCard(game.getP2());
    game.drawCard(game.getP1());
    assertEquals(game.getP1().getBoard().getHand().size(),1);
    assertEquals(game.getP2().getBoard().getHand().size(),1);
    }

    @Test
    //Test that idPlayer is 1 or 0 (Human or AI)
    public void startingPlayer() throws Exception {
        Game game = new Game();
        game.startingPlayer();
        assertTrue(game.getCurrentPlayer().getIdPLayer() == 1 || game.getCurrentPlayer().getIdPLayer() == 0);
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
package fr.esilv.fsociety.cardgame.api.races;

import org.junit.Test;
import fr.esilv.fsociety.cardgame.api.Game;

import static org.junit.Assert.*;

public class GnomeTest {
    @Test
    public void activatePower() throws Exception {

        Game game = new Game();
        Gnome gob = new Gnome();
        game.startingPlayer();
        int SizeBeforeGnomePlayed = game.getCurrentPlayer().getBoard().getHand().size();// size n
        gob.activate(game);
        int SizeAfterGnomePlayed = game.getCurrentPlayer().getBoard().getHand().size();
        assertEquals(SizeBeforeGnomePlayed + 2, SizeAfterGnomePlayed);

    }


}
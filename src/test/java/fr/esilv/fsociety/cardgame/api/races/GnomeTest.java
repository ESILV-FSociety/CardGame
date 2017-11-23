package fr.esilv.fsociety.cardgame.api.races;

import org.junit.Test;
import fr.esilv.fsociety.cardgame.api.Game;
import org.junit.runner.RunWith;

import java.util.Currency;

import static org.junit.Assert.*;

public class GnomeTest {
    @Test
    public void activatePower() throws Exception {

        Game game = new Game();
        Gnome gob = new Gnome();
        game.startingPlayer();
        int SizeBeforeGnomePlayed = game.getCurrentPlayer().getBoard().getHand().size();// size n
        gob.activatePower(game);
        int SizeAfterGnomePlayed = game.getCurrentPlayer().getBoard().getHand().size();
        assertEquals(SizeBeforeGnomePlayed + 2, SizeAfterGnomePlayed);

    }


}
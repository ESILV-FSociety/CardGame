package fr.esilv.fsociety.cardgame.api.races;

import fr.esilv.fsociety.cardgame.api.Game;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static sun.nio.cs.Surrogate.is;

public class DryadTest {
    @Test
    public void activatePower() throws Exception {

        Game game = new Game();
        Gnome gno = new Gnome();
        Dryad dry = new Dryad();
        Korrigan korr = new Korrigan();
        game.startingPlayer();
        game.getCurrentPlayer().getBoard().addCardToHand(gno);
        game.getCurrentPlayer().getBoard().addCardToHand(dry);
        game.getCurrentPlayer().getBoard().addCardToHand(korr);
        game.getOpponnent().getBoard().addCardToHand(gno);
        game.getOpponnent().getBoard().addCardToHand(dry);
        //assertArrayEquals(game.getCurrentPlayer().getBoard().getKingdom().size(),3);
        //assertEquals(game.getOpponnent().getBoard().getKingdom().size(),is(2));
        dry.activatePower(game);
        //assertEquals(game.getCurrentPlayer().getBoard().getKingdom().size(),is(4));
        //assertEquals(game.getOpponnent().getBoard().getKingdom().size(),is(1));

    }
}

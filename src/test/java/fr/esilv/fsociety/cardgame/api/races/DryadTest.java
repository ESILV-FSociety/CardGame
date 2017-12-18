
package fr.esilv.fsociety.cardgame.api.races;
import fr.esilv.fsociety.cardgame.api.Game;
//import org.junit.Test;

        import static org.junit.Assert.assertEquals;

public class DryadTest {

    public void activatePowerBis throws Exception {

        Game game = new Game();
        game.startingPlayer();
        game.playersDraw5Cards();

        //Get the kingdom (of the two players) # BEFORE
        int [] arrayCurrentPlayer = game.getCurrentPlayer().getBoard().getKingdom().clone();
        int [] arrayOpponentPlayer = game.getOpponentPlayer().getBoard().getKingdom().clone();

        Dryad dr = new Dryad();

        //steal the card of the opponent and add it to our kingdom (at the end we return the index (that corresponds to the race))
        //arrayIndex[0] = dr.activatePowerBis(game);

        //Get the hand (of the two players) # AFTER
        int [] arrayCurrentPlayer2 = game.getCurrentPlayer().getBoard().getKingdom();
        int [] arrayOpponentPlayer2 = game.getOpponentPlayer().getBoard().getKingdom();

        //Then we compare the two
        assertEquals(arrayCurrentPlayer2.length, arrayCurrentPlayer.length+1);
        assertEquals(arrayOpponentPlayer2.length,arrayOpponentPlayer.length-1);
    }
}

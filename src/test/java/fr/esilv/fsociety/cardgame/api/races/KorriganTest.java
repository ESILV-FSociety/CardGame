package fr.esilv.fsociety.cardgame.api.races;

import fr.esilv.fsociety.cardgame.api.Game;
import fr.esilv.fsociety.cardgame.api.races.Korrigan;
import org.junit.Test;

import static org.junit.Assert.*;

public class KorriganTest {

    @Test
    public void activate() throws Exception {

        int [] arrayIndex = new int [2];
        Game game = new Game();
        game.startingPlayer();
        game.playersDraw5Cards();

        //Get the hand (of the two players) # BEFORE
        int [] arrayCurrentPlayer = game.getCurrentPlayer().getBoard().getHand().clone();
        int [] arrayOpponentPlayer = game.getOpponentPlayer().getBoard().getHand().clone();

        Korrigan kor = new Korrigan();

        //steal the card of the opponent and add it to our hand (at the end we return the index (that corresponds to the race))
        arrayIndex[0] = kor.stealCard(game);
        arrayIndex[1] = kor.stealCard(game);

        //Get the hand (of the two players) # AFTER
        int [] arrayCurrentPlayer2 = game.getCurrentPlayer().getBoard().getHand();
        int [] arrayOpponentPlayer2 = game.getOpponentPlayer().getBoard().getHand();

        //Then we compare the two
        for(int i = 0; i < arrayIndex.length; i++){
            assertEquals(arrayCurrentPlayer2[arrayIndex[i]],arrayCurrentPlayer[arrayIndex[i]]+1);
            assertEquals(arrayOpponentPlayer[arrayIndex[i]]-1,arrayOpponentPlayer2[arrayIndex[i]]);
        }
    }
}
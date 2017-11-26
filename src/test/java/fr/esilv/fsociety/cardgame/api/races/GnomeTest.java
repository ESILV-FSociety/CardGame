package fr.esilv.fsociety.cardgame.api.races;

import org.junit.Test;
import fr.esilv.fsociety.cardgame.api.Game;
import org.junit.runner.RunWith;

import java.util.Currency;

import static org.junit.Assert.*;

public class GnomeTest {
    @Test
    public void activatePowerBis() throws Exception {
        int [] arrayIndex = new int [2];
        Game game = new Game();
        game.startingPlayer();
        game.playersDraw5Cards();

        //Get the hand (of the two players) # BEFORE
        int [] arrayCurrentPlayer = game.getCurrentPlayer().getBoard().getHand().clone();

        Gnome gnome = new Gnome();

        //add two cards to our hand(at the end we will return the index (that corresponds to the race))

        arrayIndex[0] = gnome.activatePowerBis(game,game.getDealer().GetCard());
        arrayIndex[1] = gnome.activatePowerBis(game,game.getDealer().GetCard());

        //Get the hand of the currentPlayer # AFTER
        int [] arrayCurrentPlayer2 = game.getCurrentPlayer().getBoard().getHand();

        //Then we check if the 2 cards has been added at right indexes

        //If the two cards has been added at the same index
        if(arrayIndex[0] == arrayIndex[1]){
            assertEquals(arrayCurrentPlayer2[arrayIndex[0]],arrayCurrentPlayer[arrayIndex[0]]+2);
        }
        else{
            for(int i = 0; i < 2; i++){
                assertEquals(arrayCurrentPlayer2[arrayIndex[i]],arrayCurrentPlayer[arrayIndex[i]]+1);
            }
        }
    }
}
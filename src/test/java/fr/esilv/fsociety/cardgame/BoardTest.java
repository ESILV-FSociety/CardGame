package fr.esilv.fsociety.cardgame;

import fr.esilv.fsociety.cardgame.api.Card;
import fr.esilv.fsociety.cardgame.api.Game;
import fr.esilv.fsociety.cardgame.api.races.*;
import org.junit.Test;

import java.util.Hashtable;

import static org.junit.Assert.*;

public class BoardTest {
    @Test

    // Test that the card is added to the hand of the player
    public void addCardToHand() throws Exception {
        Game game = new Game();
        game.startingPlayer();

        Hashtable<Integer,Card> hash = new Hashtable<Integer,Card>() {{
            put(0,new Gnome());
            put(1,new Korrigan());
            put(2,new Goblin());
            put(3,new Elf());
            put(4,new Dryad());
            put(5,new Troll());
        }};

        //vérifie que le nombre a bien changé à l'indice voulu
        for(int i = 0; i < 6; i++){

            assertEquals(game.getCurrentPlayer().getBoard().getHand()[i],0);
            game.getCurrentPlayer().getBoard().addCardToHand(hash.get(i));
            assertEquals(game.getCurrentPlayer().getBoard().getHand()[i],1);
        }
    }
}
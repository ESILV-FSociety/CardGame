package fr.esilv.fsociety.cardgame;

import fr.esilv.fsociety.cardgame.api.Card;
import fr.esilv.fsociety.cardgame.api.Game;
import fr.esilv.fsociety.cardgame.races.Goblin;
import org.junit.Test;

import static org.junit.Assert.*;

public class BoardTest {
    @Test

    // Test that the card is added to the hand of the player
    public void addCardToHand() throws Exception {
        Game game = new Game();
        game.startingPlayer();
        Card card = new Goblin();
        int n = game.getCurrentPlayer().getBoard().getHand().size();
        game.getCurrentPlayer().getBoard().addCardToHand(card);
        assertEquals(card, game.getCurrentPlayer().getBoard().getHand().get(0));
        assertEquals(game.getCurrentPlayer().getBoard().getHand().size(),n+1);


    }
}
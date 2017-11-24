package fr.esilv.fsociety.cardgame;

import fr.esilv.fsociety.cardgame.api.AI;
import fr.esilv.fsociety.cardgame.api.Game;
import fr.esilv.fsociety.cardgame.api.Human;
import fr.esilv.fsociety.cardgame.api.Player;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {
    @Test
    public void TestHumanAttributes(){
        Human human = new Human();

        assertNotNull(human.getBoard());
        assertNotNull(human.getScore());
        assertEquals(human.getScore(),0);
    }
    @Test
    public void TestAIAttributes(){

        AI ai = new AI();

        assertNotNull(ai.getBoard());
        assertNotNull(ai.getScore());
        assertEquals(ai.getScore(),0);

    }

    @Test
    public void Testttt(){
        Game game = new Game();
        game.startingPlayer();
        System.out.println(game.getCurrentPlayer().getClass().getSimpleName());

    }

}
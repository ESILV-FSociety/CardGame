package fr.esilv.fsociety.cardgame;

import fr.esilv.fsociety.cardgame.api.AI;
import fr.esilv.fsociety.cardgame.api.Human;
import fr.esilv.fsociety.cardgame.api.Player;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {
    @Test
    public void TestHumanAttributes(){
        Human human = new Human();

        assertNotNull(human.getIdPLayer());
        assertNotNull(human.getName());
        assertNotNull(human.getBoard());
        assertNotNull(human.getScore());

        assertEquals(human.getName(), "Human");
        assertEquals(human.getIdPLayer(),1);
        assertEquals(human.getScore(),0);
    }
    @Test
    public void TestAIAttributes(){

        AI ai = new AI();

        assertNotNull(ai.getIdPLayer());
        assertNotNull(ai.getName());
        assertNotNull(ai.getBoard());
        assertNotNull(ai.getScore());

        assertEquals(ai.getName(), "AI");
        assertEquals(ai.getIdPLayer(),0);
        assertEquals(ai.getScore(),0);

    }


}
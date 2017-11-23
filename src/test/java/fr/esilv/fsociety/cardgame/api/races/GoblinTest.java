package fr.esilv.fsociety.cardgame.api.races;
import org.junit.Test;
import fr.esilv.fsociety.cardgame.api.Game;

import static org.junit.Assert.*;

public class GoblinTest {
    @Test
    public void activatePower() throws Exception {

        Game testGame = new Game();
        Goblin testGoblin = new Goblin();
        testGame.startingPlayer();
        String prevPlayer = testGame.getCurrentPlayer().getClass().getSimpleName();
        testGoblin.activate(testGame);
        String curPlayer = testGame.getCurrentPlayer().getClass().getSimpleName();
        assertEquals(curPlayer, prevPlayer);

    }


}
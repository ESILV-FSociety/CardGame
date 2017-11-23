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
        int prevPlayer = testGame.getCurrentPlayer().getIdPLayer();
        testGoblin.activate(testGame);
        int curPlayer = testGame.getCurrentPlayer().getIdPLayer();
        assertEquals(curPlayer, prevPlayer);s

    }


}
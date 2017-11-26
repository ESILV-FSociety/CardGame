package fr.esilv.fsociety.cardgame.api.races;
import org.junit.Test;
import fr.esilv.fsociety.cardgame.api.Game;

import static org.junit.Assert.*;

public class GoblinTest {
    @Test
    public void activatePowerBisGoblin() throws Exception {

        Game game = new Game();
        Goblin goblin = new Goblin();
        game.startingPlayer();

        int [] arrayCurrentPlayerBefore = game.getCurrentPlayer().getBoard().getHand().clone();
        int [] arrayOpponentPlayerBefore = game.getCurrentPlayer().getBoard().getHand().clone();
        goblin.activatePowerBis(game);
        int [] arrayCurrentPlayerAfter = game.getCurrentPlayer().getBoard().getHand().clone();
        int [] arrayOponentPlayerAfter = game.getCurrentPlayer().getBoard().getHand().clone();

        for(int i = 0; i < 6; i++){
            assertEquals(arrayCurrentPlayerBefore[i],arrayOponentPlayerAfter[i]);
            assertEquals(arrayOpponentPlayerBefore[i],arrayCurrentPlayerAfter[i]);
        }
    }


}
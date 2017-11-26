package fr.esilv.fsociety.cardgame.api.races;

import fr.esilv.fsociety.cardgame.api.Game;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrollTest {
    @Test
    public void activatePowerBis() throws Exception {

        Game game = new Game();
        Troll troll = new Troll();
        game.startingPlayer();

        int [] arrayCurrentPlayerBefore = game.getCurrentPlayer().getBoard().getKingdom().clone();
        int [] arrayOpponentPlayerBefore = game.getCurrentPlayer().getBoard().getKingdom().clone();
        troll.activatePowerBis(game);
        int [] arrayCurrentPlayerAfter = game.getCurrentPlayer().getBoard().getKingdom().clone();
        int [] arrayOponentPlayerAfter = game.getCurrentPlayer().getBoard().getKingdom().clone();

        for(int i = 0; i < 6; i++){
            assertEquals(arrayCurrentPlayerBefore[i],arrayOponentPlayerAfter[i]);
            assertEquals(arrayOpponentPlayerBefore[i],arrayCurrentPlayerAfter[i]);
        }
    }

}
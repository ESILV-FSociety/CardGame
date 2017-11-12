import fr.esilv.fsociety.cardgame.Controller.GameOverviewController;
import fr.esilv.fsociety.cardgame.api.Game;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    @Test
    //Test that idPlayer is 1 or 0
    public void startingPlayer() throws Exception {
        Game game = new Game();
        game.startingPlayer();
        assertTrue(game.getCurrentPlayer().getIdPLayer() == 1 || game.getCurrentPlayer().getIdPLayer() == 0);
    }

    @Test
    //Test that all the attributes are not null after initialized the game
    public void TestGameAttributes() throws Exception {
        Game game = new Game();
        assertNotNull(game);
        assertNotNull(game.getP1());
        assertNotNull(game.getP2());
        assertNotNull(game.getDealer());

    }

}
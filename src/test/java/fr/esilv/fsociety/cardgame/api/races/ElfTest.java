package fr.esilv.fsociety.cardgame.api.races;

import fr.esilv.fsociety.cardgame.api.Game;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElfTest {
    @Test
    public void activatePowerBis() throws Exception {
        Game game = new Game();
        game.startingPlayer();
        game.playersDraw5Cards();

        //Get the hand (of the two players) # BEFORE
        int [] arrayCurrentPlayer = game.getCurrentPlayer().getBoard().getHand().clone();

        Elf elf = new Elf();

        int n = elf.activatePowerBis(game);

        //uncompleted
    }

}
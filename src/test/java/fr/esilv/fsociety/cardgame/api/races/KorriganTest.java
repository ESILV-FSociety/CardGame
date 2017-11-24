package fr.esilv.fsociety.cardgame.api.races;

import fr.esilv.fsociety.cardgame.api.Game;
import fr.esilv.fsociety.cardgame.api.races.Korrigan;
import org.junit.Test;

import static org.junit.Assert.*;

public class KorriganTest {
    @Test
    public void activate() throws Exception {
        Game game = new Game();
        game.startingPlayer();
        game.playersDraw5Cards();
        int x0= game.getCurrentPlayer().getBoard().getHand()[0];
        int x1= game.getCurrentPlayer().getBoard().getHand()[1];
        int x2= game.getCurrentPlayer().getBoard().getHand()[2];
        int x3= game.getCurrentPlayer().getBoard().getHand()[3];
        int x4= game.getCurrentPlayer().getBoard().getHand()[4];
        int x5= game.getCurrentPlayer().getBoard().getHand()[5];

        //BON MATHIEU ECOUTE MOI BIEN, TOI MEME TU SAIS T'ES UN BG, DONC QUAND TU REVIENDRAS ICI TU SAURAS QUE TU DEVRAS CREER UNE FONCNTION QUI COMPTE LE NOMBRE TOTAL DE CARTE DANS LA MAIN, KISS BG

        Korrigan kor = new Korrigan();
        int [] array = kor.activate(game);
        //save the indexes where cards were added
        int n1 = game.getCurrentPlayer().getBoard().getHand()[array[0]];
        int n2 = game.getOpponentPlayer().getBoard().getHand()[array[1]];
        assertEquals(game.getCurrentPlayer().getBoard().getHand()[n1],n1 + 1);
        assertEquals(game.getCurrentPlayer().getBoard().getHand()[n1],n2 + 1);

        assertEquals(game.getOpponentPlayer().getBoard().getHand()[n1],n1 );


    }

}
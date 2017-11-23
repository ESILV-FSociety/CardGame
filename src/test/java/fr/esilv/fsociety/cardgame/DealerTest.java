package fr.esilv.fsociety.cardgame;

import fr.esilv.fsociety.cardgame.api.Card;
import fr.esilv.fsociety.cardgame.api.Dealer;
import org.junit.Test;
//import fr.esilv.fsociety.cardgame.api.Game;
//import java.util.ArrayList;

import static org.junit.Assert.*;

public class DealerTest {

    @Test
    public void getCard() throws Exception {
        Dealer dealer = new Dealer();
        Card card = dealer.GetCard();
        assertEquals(card,dealer.getDeck().get(0));

    }

    @Test
    public void TestDealerAttributes(){
        Dealer dealer = new Dealer();
        assertNotNull(dealer.getDeck());
        assertEquals(dealer.getDeck().size(),6);
    }

}
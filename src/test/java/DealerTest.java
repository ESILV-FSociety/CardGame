import fr.esilv.fsociety.cardgame.api.Card;
import fr.esilv.fsociety.cardgame.api.Dealer;
import fr.esilv.fsociety.cardgame.api.Game;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DealerTest {

    @Test
    public void getCard() throws Exception {
        Dealer dealer = new Dealer();
        Card card = dealer.GetCard();
        assertEquals(card,dealer.getDeck().get(0));

    }

}
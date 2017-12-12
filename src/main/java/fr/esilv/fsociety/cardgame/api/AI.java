package fr.esilv.fsociety.cardgame.api;
import fr.esilv.fsociety.cardgame.controller.GameOverviewController;
import java.util.ArrayList;
import java.util.Random;

public class AI extends Player{

    public AI(){
        super(0);
    }

    public int Choice(){
        Random random = new Random();
        int n = 0;
        int r = 0;
        while(n == 0){
            r = random.nextInt(this.getBoard().getHand().length);
            n = this.getBoard().getHand()[r];
        }
        return r;
        //return the index (so the card that the cumputer will play)

    }
}

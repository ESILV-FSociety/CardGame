package fr.esilv.fsociety.cardgame.api;

import java.util.ArrayList;

public class AI extends Player{

    public AI(){
        super(0);
    }

    public void chooseCardToPlay(){
        ArrayList<Card> list = this.getBoard().getHand();
        //int r = Math.random(list.size());
        Card card = this.getBoard().getHand().get(0);


    }

    public void retrieveCardFromDeck(){
        // call the dealer

    }
}

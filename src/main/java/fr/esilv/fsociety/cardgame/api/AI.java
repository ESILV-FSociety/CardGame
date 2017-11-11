package fr.esilv.fsociety.cardgame.api;

import java.util.ArrayList;

public class AI extends Player{

    public AI(){
        super(0);
    }

    public Card chooseCardToPlay(){ // draw a card for the AI
        ArrayList<Card> list = this.getBoard().getHand();
        //int r = Math.random();
        Card card = this.getBoard().getHand().get(0);
        return card;
    }

    public void retrieveCardFromDeck(){
        // call the dealer

    }
}

package fr.esilv.fsociety.cardgame.api;

import java.util.ArrayList;

public class AI extends Player{

    private String name;
    private Board board;

    public AI(){
        super(0);
        this.board = new Board();
        this.name = "Human";
    }

    public void chooseCardToPlay(){
        ArrayList<Card> list = this.board.getHand();
        //int r = Math.random(list.size());
        Card card = this.board.getHand().get(0);


    }

    public void retrieveCardFromDeck(){
        // call the dealer

    }
}

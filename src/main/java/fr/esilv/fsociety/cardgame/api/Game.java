package fr.esilv.fsociety.cardgame.api;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

import java.util.Random;

public class Game {

    private Player p1;
    private Player p2;

    private Player currentPlayer;
    private Player opponentPlayer;

    private Dealer dealer;

    public Game() {
        this.p1 = new AI();
        this.p2 = new Human();
        this.dealer = new Dealer();

        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("players.json"));
            JSONObject jsonObject = (JSONObject) obj;


            p1.setName((String) jsonObject.get("player 1"));
            p2.setName((String) jsonObject.get("player 2"));


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    // Modify the this.currentPlayer (Player that will start) // unit test => yes
    public void startingPlayer() {
        Random rand = new Random();
        int n = rand.nextInt(2);
        if (n == 0) {
            this.currentPlayer = this.p1;
            this.opponentPlayer = this.p2;
        }
        else {
            this.currentPlayer = this.p2;
            this.opponentPlayer = this.p1;
        }
    }

    public void setOpponentPlayer(Player opponentPlayer) {

        this.opponentPlayer = opponentPlayer;
    }

    public Player getCurrentPlayer() {

        return this.currentPlayer;
    }

    public Player getOpponentPlayer() { return this.opponentPlayer;}

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public Player getP1() {
        return p1;
    }

    public Player getP2() {
        return p2;
    }

    public void playersDraw5Cards(){
        for(int i = 0; i < 5; i++){
            this.getP1().getBoard().addCardToHand(this.dealer.GetCard());

            this.getP2().getBoard().addCardToHand((this.dealer.GetCard()));

        }
    }
    // method where the currentPlayer draw a card (the card is added to his hand)
   // public void drawCard() {
//        this.currentPlayer.getBoard().addCardToHand(dealer.GetCard());
//    }
    public void drawCard() {
        if((this.getDealer().getDeck().size()>0)){
            this.currentPlayer.getBoard().addCardToHand(dealer.GetCard());}
        else{
            System.out.println("Run out of cards");
        }
    }

    public boolean emptyHands(){
        return this.getCurrentPlayer().getBoard().emptyHand() && this.getOpponentPlayer().getBoard().emptyHand();
    }

    // returns the player that will play next
    public void changePlayer() {

        if(!this.getCurrentPlayer().getBoard().emptyHand()) {
            if (currentPlayer == p1) {
                currentPlayer = p2;
                opponentPlayer = p1;
            } else {
                currentPlayer = p1;
                opponentPlayer = p2;
            }
        }
        else{
           opponentPlayer = currentPlayer;
        }
    }

}

package fr.esilv.fsociety.cardgame.api;

import fr.esilv.fsociety.cardgame.controller.GameOverviewController;

import java.util.ArrayList;
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
    } // on start
    // method where the currentPlayer draw a card (the card is added to his hand)
    public void drawCard() {
        this.currentPlayer.getBoard().addCardToHand(dealer.GetCard());
    } // a every turn
    // method that return true for human, false otherwise
    public boolean isHuman(){
        return this.currentPlayer.getClass().toString() == "Human";
    }

    // returns the player that will play next
    public void changePlayer() {
        if (this.currentPlayer.getClass().getSimpleName() == "Human") this.currentPlayer = this.p2;
        else this.currentPlayer = p1;
    }

    //Steal a card in your hand's opponent
    public int stealCard(){

        Random random = new Random();
        int rand = random.nextInt(6);

        if(!this.opponentPlayer.getBoard().emptyHand()) {

            int n = this.opponentPlayer.getBoard().getHand()[rand];
            while (n == 0) {
                rand = random.nextInt(6);
                n = this.opponentPlayer.getBoard().getHand()[rand];
            }
            this.opponentPlayer.getBoard().getHand()[rand] -= 1;
            this.currentPlayer.getBoard().getHand()[rand] += 1;
        }

        return rand;







        }





}

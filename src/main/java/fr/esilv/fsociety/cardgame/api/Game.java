package fr.esilv.fsociety.cardgame.api;

import fr.esilv.fsociety.cardgame.controller.GameOverviewController;
import java.util.Random;

public class Game {

    // 2 players
    private Player p1;
    private Player p2;
    // 1 current player
    private Player currentPlayer;
    // 1 dealer
    private Dealer dealer;

    // Initialize the Game Objects
    public Game() {
        this.p1 = new AI();
        this.p2 = new Human();
        this.dealer = new Dealer();
    }

    // Connection between the Game and the GameOverviewController // unit test => no (no need)
  /*  private void ConnectToGameOverviewController() {
        this.gameoverviewcontroller.setGame(this);
    }*/

    // Modify the this.currentPlayer (Player that will start) // unit test => yes
    public void startingPlayer() {
        Random rand = new Random();
        int n = rand.nextInt(2);
        if (n == 0) this.currentPlayer = this.p1;
        else this.currentPlayer = this.p2;
    }

    // properties
    public Player getCurrentPlayer() {
        return currentPlayer;
    }

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
   /* public GameOverviewController getGameoverviewcontroller() {
        return gameoverviewcontroller;
    }*/
/*
    public Card PlayCard() {
        int n = this.getCurrentPlayer().getBoard().getHand().size();
        Random rand;
        int r = rand.nextInt(n);
        Card card r = this.getCurrentPlayer().getBoard().getHand().get(r);


    }
    */
    public void playersDraw5Cards(){
        for(int i = 0; i < 5; i++){
            this.getP1().getBoard().addCardToHand(this.dealer.GetCard());
            this.getP2().getBoard().addCardToHand((this.dealer.GetCard()));
        }
    } // on start
    // method where the currentPlayer draw a card (the card is added to his hand)
    public void drawCard(Player player) {
        player.getBoard().getHand().add(dealer.GetCard());
    } // a every turn
    // method that return true for human, false otherwise
    public boolean isHuman(){
        return this.currentPlayer.getIdPLayer() == 1;
    }
    // returns 1 if both hands are empty, 0 otherwise
    public boolean emptyHands() {
        return p1.getBoard().getHand().isEmpty() && p2.getBoard().getHand().isEmpty();
    }
    // returns the player that will play next
    public void changePlayer() {
        if (this.currentPlayer.getIdPLayer() == 0) this.currentPlayer = this.p2;
        else this.currentPlayer = p1;
    }




    public void onClick(Card c) {

    }

}
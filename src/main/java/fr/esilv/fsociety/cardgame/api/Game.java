package fr.esilv.fsociety.cardgame.api;

<<<<<<< Updated upstream
=======
import fr.esilv.fsociety.cardgame.Controller.GameOverviewController;
>>>>>>> Stashed changes
import java.util.Random;

public class Game {

    private Player p1;
    private Player p2;

    private Player currentPlayer;

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
        if (n == 0) this.currentPlayer = this.p1;
        else this.currentPlayer = this.p2;
    }

    public Player getCurrentPlayer() {
        return this.currentPlayer;
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
}
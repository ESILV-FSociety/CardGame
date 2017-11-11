package fr.esilv.fsociety.cardgame.api;
import fr.esilv.fsociety.cardgame.Controller.GameOverviewController;

import java.util.Random;

public class Game {

	// 2 players
	private Player p1;
	private Player p2;

	// 1 current player
	private Player currentPlayer;

	// 1 dealer
	private Dealer dealer;

	//define here the controllers
	private GameOverviewController gameoverviewcontroller;
	//GameOverviewController (for the GameOverview.fxml)
	//LoginController (for the LoginController.fxml)
	//MenuController (for the Menu.fxml)

	// Initialize the Game Object
	public Game() {
		this.p1 = new AI();
		this.p2 = new Human();
		this.dealer = new Dealer();
		this.gameoverviewcontroller = new GameOverviewController();
		ConnectToGameOverviewController();
	}

	// Connection between the Game and the GameOverviewController
	public void ConnectToGameOverviewController(){
		this.gameoverviewcontroller.setGame(this);
	}

	// Modify the this.currentPlayer (Player that will start)
	public void StartPlayer(){
		Random rand = new Random();
		int n = rand.nextInt(2);
		if(n == 0) this.currentPlayer = this.p1;
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

	public GameOverviewController getGameoverviewcontroller() {
		return gameoverviewcontroller;
	}

	public void start(Player p1, Player p2){

		// initialize windows: stage and scene and all the elements (it's here that we will call all the controllers)
		// display the login view
		//click on buttons, add some text (for the name)
		//switch to the GameOverview

		StartPlayer(); // choose the currentPlayer (on start only)

		while(!emptyHands()){  // while all hands are not empty

			//click on the deck
			PlayerDrawCard();// the current player draw a card
			// we place the card in the hand of the currentPlayer

			//
			// the player choose a card to play
			// the player finish his move choice

			// auto-placement of the card or the player can choose the position on the board
			// then activation of the power of the card

			// THEN the same for the next player ...

		}
	}


	/*Debut de la partie
	* un des 2 joueurs commences
	* initialiser kingdom
	* afficher kingdom	*
	* initialiser la main
	* afficher la main
	* currentPlayer choisi une carte
	* dans sa main et joue
	*
	*
	* */
	// returns 1 if both hands are empty, 0 otherwise
	public boolean emptyHands(){
		if ( p1.getBoard().getHand().isEmpty() && p2.getBoard().getHand().isEmpty()) return true;
		return false;
	}
	// method where the currentPlayer draw a card (the card is added to his hand)
	public void PlayerDrawCard(){
		this.currentPlayer.getBoard().getHand().add(dealer.GetCard());
	}
	public void DrawCard(){
		this.dealer.GetCard();
	}

	// returns the player that will play next
	public int changePlayer(){
		if (this.currentPlayer.getIdPLayer() == 0) return 1;
		else return 0;

	}





	/**
	 * The card c was clicked
	 * @param c
	 */
	public void onClick(Card c) {

	}

}
package fr.esilv.fsociety.cardgame.api;
import java.util.Random;
/**
 * Represents the 2 boards and more generally the game taking place
 */
public class Game {

	// 2 players
	private Player p1;
	private Player p2;

	// 1 current player
	private Player currentPlayer;

	// 1 dealer
	private Dealer dealer;

	//define here the controllers
	//BoardController (for the BoardOverview.fxml)
	//LoginController (for the LoginController.fxml)

	// at the beginning
	public Game() {
		this.p1 = new AI();
		this.p2 = new Human();
		this.dealer = new Dealer();
	}

	// returns the player that will start
	public Player StartPlayer(Player p1, Player p2){
		Random rand = new Random();
		int n = rand.nextInt(2);
		if(n == 0) return p1;
		else return p2;
	}

	// properties for the currentPlayer
	public Player getCurrentPlayer() {
		return currentPlayer;
	}
	public void setCurrentPlayer(Player currentPlayer) {
		this.currentPlayer = currentPlayer;
	}

	public void start(Player p1, Player p2){

		// initialize windows: stage and scene and all the elements (it's here that we will call all the controllers)
		// display the login view
		//click on buttons, add some text (for the name)
		//switch to the GameOverview

		this.currentPlayer = StartPlayer(p1,p2); // choose the currentPlayer (on start only)

		while(emptyHands() == false){  // while all hands are not empty

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
	// returns 1 if both hands are empty else otherwise
	public boolean emptyHands(){
		if ( p1.getBoard().getHand().isEmpty() && p2.getBoard().getHand().isEmpty()) return true;
		else return false;
	}
	// method where the currentPlayer draw a card (the card is added to his hand)
	public void PlayerDrawCard(){
		currentPlayer.getBoard().getHand().add(dealer.GetCard());
	}
	public void DrawCard(){
		this.dealer.GetCard();
	}

	public void changePlayer(){

	}

	/**
	 * The card c was clicked
	 * @param c
	 */
	public void onClick(Card c) {

	}

}
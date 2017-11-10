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

	// at the beginning
	public Game() {
		this.p1 = new AI();
		this.p2 = new Human();
		this.dealer = new Dealer();

	}

	// returns the player that wills start
	public Player StartPlayer(Player p1, Player p2){
		Random rand = new Random();
		int n = rand.nextInt(2);
		if(n == 0) return p1;
		else return p2;


	}

	//Porperties for the currentPlayer

	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	public void setCurrentPlayer(Player currentPlayer) {
		this.currentPlayer = currentPlayer;
	}

	public void start(Player p1, Player p2){

		// initialize windows: stage and scene and all the elements (it's here that we will call all the controllers)
		// display the login view
		// ... then display the GameOverview

		this.currentPlayer = StartPlayer(p1,p2);

		while(emptyHands() == false){  // while all hands

			// the player draw a card
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

	public void DrawCard(){
		this.dealer.GetCard();
	}

	/**
	 * The card c was clicked
	 * @param c
	 */
	public void onClick(Card c) {

	}

}
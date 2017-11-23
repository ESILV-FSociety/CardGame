package fr.esilv.fsociety.cardgame.api.races;
import fr.esilv.fsociety.cardgame.api.Card;
import fr.esilv.fsociety.cardgame.api.Game;

public class Goblin extends Card {

	public Goblin() {
		super("Goblin");
	}
	public void activatePower(){
		// switch your hand with you opponent

	}
//	public void activatePower(){
//		// switch your hand with you opponent
//
//	}

	public void activate(Game theGame) {
//
		theGame.changePlayer();
		theGame.changePlayer();
	}
}

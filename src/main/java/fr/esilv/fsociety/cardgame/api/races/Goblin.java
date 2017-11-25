package fr.esilv.fsociety.cardgame.api.races;
import fr.esilv.fsociety.cardgame.api.Card;
import fr.esilv.fsociety.cardgame.api.Game;

public class Goblin extends Card {

	public Goblin() {
		super("Goblin");
	}

	public void activatePower(Game game){
		// switch your hand with your opponent

	}

	public void activate(Game game) {
//
		game.changePlayer();
		game.changePlayer();
	}
}

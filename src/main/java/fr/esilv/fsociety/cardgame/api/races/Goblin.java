package fr.esilv.fsociety.cardgame.api.races;
import fr.esilv.fsociety.cardgame.api.Card;

public class Goblin extends Card {

	public Goblin() {
		super("Goblin");
	}

<<<<<<< Updated upstream:src/main/java/fr/esilv/fsociety/cardgame/races/Goblin.java
	public void activatePower(){
		// switch your hand with you opponent

	}
=======
//	public void activatePower(){
//		// switch your hand with you opponent
//
//	}

	@Override
	public void activate(Game theGame) {
		int prevPlayer = theGame.getCurrentPlayer().getIdPLayer();
		theGame.changePlayer();
		theGame.changePlayer();
	}

>>>>>>> Stashed changes:src/main/java/fr/esilv/fsociety/cardgame/api/races/Goblin.java
}

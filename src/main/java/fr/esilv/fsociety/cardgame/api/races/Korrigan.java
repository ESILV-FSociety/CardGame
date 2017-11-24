package fr.esilv.fsociety.cardgame.api.races;
import fr.esilv.fsociety.cardgame.api.Card;
import fr.esilv.fsociety.cardgame.api.Game;

public class Korrigan extends Card {

	public Korrigan() {
		super("Korrigan");
	}

	public void activatePower(){
		// draw 2 random cards within your opponent hand

	}


	public int [] activate(Game game) {
		System.out.println("Korrigan activated");
		int index1 = game.stealCard();
		int index2 = game.stealCard();
		int [] array = {index1,index2};
		return array;
	}

}

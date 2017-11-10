package fr.esilv.fsociety.cardgame.api.races;
import fr.esilv.fsociety.cardgame.api.Card;
import fr.esilv.fsociety.cardgame.api.Game;

public class Korrigan extends Card {

	public Korrigan() {
		super("Korrigan","CardGame\\src\\main\\java\\resources\\fr.esilv.fsociety.cardgame\\cards\\korrigan.png");
	}

	public void activatePower(){
		// draw 2 random cards within your opponent hand

	}

	@Override
	public void activate(Game theGame) {
		//TODO

	}

}

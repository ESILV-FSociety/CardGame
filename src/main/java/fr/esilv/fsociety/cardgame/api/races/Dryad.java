package fr.esilv.fsociety.cardgame.api.races;

import fr.esilv.fsociety.cardgame.api.Card;
import fr.esilv.fsociety.cardgame.api.Game;

public class Dryad extends Card {

	public Dryad() {
		super("Dryad","CardGame\\src\\main\\java\\resources\\fr.esilv.fsociety.cardgame\\cards\\dryad.png");
	}

	public void activatePower(){
		// stole a card in front of your opponent and add it in front of you without activating its power.

	}

	@Override
	public void activate(Game theGame) {
		//TODO

	}

}
package fr.esilv.fsociety.cardgame.api.races;

import fr.esilv.fsociety.cardgame.Controller.GameOverviewController;
import fr.esilv.fsociety.cardgame.api.Card;
import fr.esilv.fsociety.cardgame.api.Game;

public class Dryad extends Card {



	public Dryad() {
		super("Dryad","fr/esilv/fsociety/cardgame/Cards/dryad.png");
	}

	public void activatePower(){
		// stole a card in front of your opponent and add it in front of you without activating its power.

	}

	@Override
	public void activate(Game theGame) {
		//TODO

	}

}

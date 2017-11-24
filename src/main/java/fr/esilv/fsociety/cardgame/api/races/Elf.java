package fr.esilv.fsociety.cardgame.api.races;

import fr.esilv.fsociety.cardgame.api.Card;
import fr.esilv.fsociety.cardgame.api.Game;

import java.util.Random;

public class Elf extends Card {

	public Elf() {
		super("Elf");
	}



	public void activatePower(Game game) {
		// Generate a random number
		Random rnd = new Random();
		int randomCard = rnd.nextInt(6);
		game.getCurrentPlayer().getBoard().getKingdom()[randomCard]+= 1;
		Card card = game.getCurrentPlayer().getBoard().GetHastable().get(randomCard);
		card.activatePower(game);
	}

}

package fr.esilv.fsociety.cardgame.api.races;
import fr.esilv.fsociety.cardgame.api.Card;
import fr.esilv.fsociety.cardgame.api.Game;

import java.util.Random;

public class Korrigan extends Card {

	private int[] testArray;

	public Korrigan() { super(1, "Korrigan");	}

	// Korrigan : draw 2 random cards within your opponent hand

	@Override
	public void activatePower(Game game) {
		for(int i = 0; i < 2; i++) {
			activatePowerBis(game);
		}
	}

	public int activatePowerBis(Game game) {

		// take a random number between 0 and 6(excluded)
		Random random = new Random();
		int rand = random.nextInt(6);

		//check if the value at the index "rand" is empty
		int n = game.getOpponentPlayer().getBoard().getHand()[rand];
		//if it is
		while (n == 0) {
			rand = random.nextInt(6);
			n = game.getOpponentPlayer().getBoard().getHand()[rand];
		}
		// remove one card from the opponent hand at the correct index
		game.getOpponentPlayer().getBoard().getHand()[rand] -= 1;
		// add one card to the currentplayer hand at the correct index
		game.getCurrentPlayer().getBoard().getHand()[rand] += 1;

		return rand;
	}
}

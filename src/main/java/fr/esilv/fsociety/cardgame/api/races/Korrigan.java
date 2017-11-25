package fr.esilv.fsociety.cardgame.api.races;
import fr.esilv.fsociety.cardgame.api.Card;
import fr.esilv.fsociety.cardgame.api.Game;

import java.util.Random;

public class Korrigan extends Card {

	private int[] testArray;

	public Korrigan() { super("Korrigan");	}

	public void activatePower(Game game) {
		stealCard(game);
		stealCard(game);
	}

	public int stealCard(Game game) {

		Random random = new Random();
		int rand = random.nextInt(6);

		int n = game.getOpponentPlayer().getBoard().getHand()[rand];
		while (n == 0) {
			rand = random.nextInt(6);
			n = game.getOpponentPlayer().getBoard().getHand()[rand];
		}
		game.getOpponentPlayer().getBoard().getHand()[rand] -= 1;
		game.getCurrentPlayer().getBoard().getHand()[rand] += 1;

		return rand;

	}
}

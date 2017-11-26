package fr.esilv.fsociety.cardgame.api.races;

import fr.esilv.fsociety.cardgame.api.Card;
import fr.esilv.fsociety.cardgame.api.Game;

import java.util.Random;

public class Elf extends Card {

	public Elf() {
		super("Elf");
	}

	// Elf : copy and use the power of one of the card in front of you

	public void activatePower(Game game) {
		activatePowerBis(game);
	}
	public int activatePowerBis(Game game){
		// Generate a random number
		Random random = new Random();
		int rand= random.nextInt(6);

		// We need to copy a card that we have in our kingdom (<==> an index where the value is not equal to 0)
		int n = game.getCurrentPlayer().getBoard().getHand()[rand];
		while(n == 0){
			rand = random.nextInt(6);
			n = game.getCurrentPlayer().getBoard().getHand()[rand];
		}
		game.getCurrentPlayer().getBoard().getKingdom()[rand]+= 1;
		Card card = game.getCurrentPlayer().getBoard().GetHastable().get(rand);
		card.activatePower(game);

		return rand;

		//tester que la carte a été ajouté au royaume
	}

}

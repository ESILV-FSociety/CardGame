package fr.esilv.fsociety.cardgame.api.races;

import fr.esilv.fsociety.cardgame.api.Card;
import fr.esilv.fsociety.cardgame.api.Game;

import java.util.ArrayList;
import java.util.Random;

public class Elf extends Card {

	public Elf() {
		super(3, "Elf");
	}

	// Elf : copy and use the power of one of the card in front of you

	public void activatePower(Game game) {
		activatePowerBis(game);
	}



		public Card activatePowerBis(Game game){

			// We need to copy a card that we have in our kingdom (<==> an index where the value is not equal to 0)
			int[] kingdom = game.getCurrentPlayer().getBoard().getKingdom();
			ArrayList<Integer> onlyExistantCard = new ArrayList<>();
			for(int i = 1; i < kingdom.length; i++)
			{
				if (kingdom[i] != 0)
				{
					onlyExistantCard.add(kingdom[i]);
				}
			}

			// Generate a random number

			Random random = new Random();
			Card card = null;
			// add the new card in the kingdom
			if ( onlyExistantCard.size() != 0 )
			{
				int rand = random.nextInt(onlyExistantCard.size());
				game.getCurrentPlayer().getBoard().getKingdom()[rand]+= 1;
				card = Card.CARD_MAP.get(rand);
				card.activatePower(game);
			}

			// else nothing appends, the card is played with no consequences

			return card;
	}

}

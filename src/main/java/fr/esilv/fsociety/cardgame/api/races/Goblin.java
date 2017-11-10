package fr.esilv.fsociety.cardgame.api.races;

import fr.esilv.fsociety.cardgame.api.Card;
import fr.esilv.fsociety.cardgame.api.Game;
import fr.esilv.fsociety.cardgame.api.Dealer;

public class Goblin extends Card {

	public Goblin() {
		super("Goblin", "file:goblin.png");
		
	}

	@Override
	public void activate(Game theGame) {
		//TODO
		System.out.println("Goblin activé");
		Dealer deck = new Dealer();
		deck.dealCard();
		deck.dealCard();
		
	}

}

package fr.esilv.fsociety.cardgame.api.races;

import fr.esilv.fsociety.cardgame.api.Card;
import fr.esilv.fsociety.cardgame.api.Game;

public class Goblin extends Card {

	public Goblin() {
		super("Goblin", "file:goblin.png");
		
	}

	@Override
	public void activate(Game theGame) {
		//TODO
		System.out.println("Goblin activ�");
		
	}

}

package fr.esilv.fsociety.cardgame.api.races;

import fr.esilv.fsociety.cardgame.api.Card;
import fr.esilv.fsociety.cardgame.api.Game;

public class Elf extends Card {

	public Elf() {
		super("Elf","CardGame\\src\\main\\java\\resources\\fr.esilv.fsociety.cardgame\\cards\\elf.png");
	}

	public void activatePower(){
		// copy and use the power of one of the card in front of you

	}

	@Override
	public void activate(Game theGame) {
		//TODO

	}

}

package fr.esilv.fsociety.cardgame.api.races;
import fr.esilv.fsociety.cardgame.api.Card;
import fr.esilv.fsociety.cardgame.api.Game;
import fr.esilv.fsociety.cardgame.api.Player;

import java.util.ArrayList;

public class Troll extends Card {

	public Troll() {
		super("Troll");
	}

	public void activatePower(Game game){
		/*
		int [] tempKingdom  =  new int [6];
		System.out.println("Troll activated");
		tempKingdom = game.getCurrentPlayer().getBoard().getKingdom();
		game.getCurrentPlayer().getBoard().setKingdom(game..getBoard().getKingdom());
		j2.getBoard().setKingdom(tempKingdom);
*/
		// swap the cards in front of you with the cards in front of your opponent
	}

}

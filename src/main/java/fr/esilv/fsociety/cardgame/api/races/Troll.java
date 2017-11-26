package fr.esilv.fsociety.cardgame.api.races;
import fr.esilv.fsociety.cardgame.api.Card;
import fr.esilv.fsociety.cardgame.api.Game;
import fr.esilv.fsociety.cardgame.api.Player;

import java.util.ArrayList;

public class Troll extends Card {

	// swap the cards in front of you with the cards in front of your opponent
	public Troll() {
		super("Troll");
	}

	public void activatePower(Game game){
		activatePowerBis(game);
	}

	public void activatePowerBis(Game game) {

		int [] tempArray = game.getCurrentPlayer().getBoard().getKingdom().clone();
		game.getCurrentPlayer().getBoard().setKingdom(game.getOpponentPlayer().getBoard().getKingdom());
		game.getOpponentPlayer().getBoard().setKingdom(tempArray);

	}
}

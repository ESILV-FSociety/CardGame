package fr.esilv.fsociety.cardgame.api.races;
import fr.esilv.fsociety.cardgame.api.Card;
import fr.esilv.fsociety.cardgame.api.Game;

public class Goblin extends Card {

	public Goblin() {
		super("Goblin");
	}

	public void activatePower(Game game){
		activatePowerBis(game);
	}

	public void activatePowerBis(Game game) {
		int [] tempArray = game.getCurrentPlayer().getBoard().getHand().clone();
		game.getCurrentPlayer().getBoard().setHand(game.getOpponentPlayer().getBoard().getHand());
		game.getOpponentPlayer().getBoard().setHand(tempArray);
	}
}

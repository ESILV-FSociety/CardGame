package fr.esilv.fsociety.cardgame.api.races;
import fr.esilv.fsociety.cardgame.api.Card;
import fr.esilv.fsociety.cardgame.api.Game;

public class Gnome extends Card {

	public Gnome() {
		super(0, "Gnome");
	}

	//Gnome : draw 2 cards

	@Override
	public void activatePower(Game game) {

		for(int i = 0; i < 2; i++){
			Card card = game.getDealer().GetCard();
			activatePowerBis(game,card);
		}
	}

	public int activatePowerBis(Game game,Card card){
		return game.getCurrentPlayer().getBoard().addCardToHand(card);
	}
}

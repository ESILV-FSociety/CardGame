package fr.esilv.fsociety.cardgame.races;
import fr.esilv.fsociety.cardgame.api.Card;
import fr.esilv.fsociety.cardgame.api.Game;
import fr.esilv.fsociety.cardgame.api.Dealer;

public class Gnome extends Card {

	public Gnome() {
		super("Gnome");
	}

	public void activatePower(Game game) {

		//System.out.println("Gnome activated");
		Card FirstCardPic=game.getDealer().GetCard();
		game.getCurrentPlayer().getBoard().addCardToHand(FirstCardPic);
		//System.out.println(FirstCardPic.toString());
		Card SecondCardPic=game.getDealer().GetCard();
		game.getCurrentPlayer().getBoard().addCardToHand(FirstCardPic);
		//System.out.println(SecondCardPic.toString());

	}

}

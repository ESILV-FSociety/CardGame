package fr.esilv.fsociety.cardgame.api.races;
import fr.esilv.fsociety.cardgame.api.Card;
import fr.esilv.fsociety.cardgame.api.Game;

public class Gnome extends Card {

	public Gnome() {
		super("Gnome");
	}

	@Override
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

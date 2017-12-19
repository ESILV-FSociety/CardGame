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

		if(game.getDealer().getCards()>=2)
		{
			for(int i = 0; i < 2; i++){
				Card card = game.getDealer().GetCard();
				activatePowerBis(game,card);
				System.out.print("Gnome power : draw 2 cards");
			}
		}
		else{
			if(game.getDealer().getCards()==1)
			{
				Card card = game.getDealer().GetCard();
				activatePowerBis(game,card);
				System.out.print("Gnome power : draw only 1 card cause deck is out of card");
			}
			else{
				System.out.print("Gnome power : can't draw card cause deck is out of card");
			}
		}

	}

	public int activatePowerBis(Game game,Card card){
		return game.getCurrentPlayer().getBoard().addCardToHand(card);
	}
}

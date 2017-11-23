package fr.esilv.fsociety.cardgame.api.races;
import fr.esilv.fsociety.cardgame.api.Card;
import fr.esilv.fsociety.cardgame.api.Player;

import java.util.ArrayList;

public class Troll extends Card {

	public Troll() {
		super("Troll");
	}

	/*public void activatePower(Player j1, Player j2){
		ArrayList<Card> tempKingdom  =  new ArrayList<>();
		System.out.println("Troll activated");
		tempKingdom = j1.getBoard().getKingdom();
		j1.getBoard().setKingdom(j2.getBoard().getKingdom());
		j2.getBoard().setKingdom(tempKingdom);

		// swap the cards in front of you with the cards in front of your opponent
	}
*/
}

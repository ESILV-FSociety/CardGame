package fr.esilv.fsociety.cardgame.api;



import fr.esilv.fsociety.cardgame.api.races.*;

import java.util.ArrayList;
import java.util.Collections;

public class Dealer {

	private ArrayList<Card> Deck;

	public Dealer() {
		Deck = new ArrayList<Card>();
		Deck.add(new Goblin());
		Deck.add(new Dryad());
		Deck.add(new Gnome());
		Deck.add(new Goblin());
		Deck.add(new Troll());
		Deck.add(new Korrigan());
	}

	public void MixDeck(){
		Collections.shuffle(this.Deck);
	}

	public ArrayList<Card> getDeck() {
		return Deck;
	}

	public Card GetCard(){
		this.MixDeck();
		return this.Deck.get(0);
	}
}
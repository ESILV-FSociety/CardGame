package fr.esilv.fsociety.cardgame.api;
import fr.esilv.fsociety.cardgame.api.races.*;

import java.util.ArrayList;
import java.util.Collections;

public class Dealer {

	private ArrayList<Card> Deck; // will contain all the different races

	// add the different races to the ArrayList
	public Dealer() {
		Deck = new ArrayList<Card>();
		Deck.add(new Goblin());
		Deck.add(new Dryad());
		Deck.add(new Gnome());
		Deck.add(new Goblin());
		Deck.add(new Troll());
		Deck.add(new Korrigan());
	}

	//Method that allows to mix the deck
	public void MixDeck(){
		Collections.shuffle(this.Deck);
	}

	public ArrayList<Card> getDeck() {
		return Deck;
	}

	//get card from the deck
	public Card GetCard(){
		this.MixDeck();
		return this.Deck.get(0);
	}
}
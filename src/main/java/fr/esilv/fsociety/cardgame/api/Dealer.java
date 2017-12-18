package fr.esilv.fsociety.cardgame.api;



import fr.esilv.fsociety.cardgame.api.races.*;
import fr.esilv.fsociety.cardgame.api.Card;

import java.util.ArrayList;
import java.util.Collections;

public class Dealer {


	private ArrayList<Card> Deck;
	private int cards;
	private boolean lock;

	public Dealer() {
		Deck = new ArrayList<Card>();
		for(int i=0; i<5;i++)
		{
			Deck.add(new Goblin());
			Deck.add(new Dryad());
			Deck.add(new Gnome());
			Deck.add(new Elf());
			Deck.add(new Troll());
			Deck.add(new Korrigan());
		}
		cards=30;
		lock=false;

	}

	public boolean isLock() {
		return lock;
	}

	public void setLock(boolean lock) {
		this.lock = lock;
	}

	public int getCards() {
		return cards;
	}

	public void setCards(int cards) {
		this.cards = cards;
	}

	public void DecreaseCards(int cardsleft)
	{
		this.cards=cards-cardsleft;
	}

	public void MixDeck(){
		Collections.shuffle(this.Deck);
	}

	public ArrayList<Card> getDeck() {
		return Deck;
	}

	public Card GetCard(){
		this.MixDeck();
		Card cardDrew=this.Deck.get(0);
		this.Deck.remove(cardDrew);
		cards=cards-1;
		return cardDrew;
	}
}
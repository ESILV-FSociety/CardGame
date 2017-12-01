package fr.esilv.fsociety.cardgame.api;

import java.util.HashMap;
import java.util.Map;

import fr.esilv.fsociety.cardgame.api.races.Dryad;
import fr.esilv.fsociety.cardgame.api.races.Elf;
import fr.esilv.fsociety.cardgame.api.races.Gnome;
import fr.esilv.fsociety.cardgame.api.races.Goblin;
import fr.esilv.fsociety.cardgame.api.races.Korrigan;
import fr.esilv.fsociety.cardgame.api.races.Troll;

/*
* put all the pictures in a folder (to be defined)
* each Card object created will take a name and the url of the file
*/

public abstract class Card {
	
	public static final Map<Integer, Card> CARD_MAP = new HashMap<Integer,Card>(){{
        put(0, new Gnome());
        put(1, new Korrigan());
        put(2, new Goblin());
        put(3, new Elf());
        put(4, new Dryad());
        put(5, new Troll());
    }};
	
	private String name; // name of the card
	public final int id;
	
	public Card(int id, String name) {
		this.name = name;
		this.id = id;
	}
	

	public String getName() {
		return name;
	}

	public abstract void activatePower(Game game);
}
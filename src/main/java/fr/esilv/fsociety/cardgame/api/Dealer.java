package fr.esilv.fsociety.cardgame.api;

import java.util.Random;

import fr.esilv.fsociety.cardgame.api.races.Dryad;
import fr.esilv.fsociety.cardgame.api.races.Elf;
import fr.esilv.fsociety.cardgame.api.races.Gnome;
import fr.esilv.fsociety.cardgame.api.races.Goblin;
import fr.esilv.fsociety.cardgame.api.races.Korrigan;
import fr.esilv.fsociety.cardgame.api.races.Troll;

/**
 * Represents a card dealer for the players
 */
public class Dealer {
	

	
	public Card dealCard() {
		
		Goblin gob= new Goblin();
		Dryad dry= new Dryad();
		Elf elf= new Elf();
		Gnome gno = new Gnome();
		Korrigan kor = new Korrigan();
		Troll tro = new Troll();
		Card[] deck = {gob,dry,elf,gno,kor,tro};
		Random rand = new Random(); 
		int nombreAleatoire = rand.nextInt(6);
		System.out.println("Card drew");
		return deck[nombreAleatoire];
		
		
		
	}
}
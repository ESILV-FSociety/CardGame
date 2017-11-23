package fr.esilv.fsociety.cardgame.api;

/*
* put all the pictures in a folder (to be defined)
* each Card object created will take a name and the url of the file
*/

public abstract class Card {
	private String name; // name of the card
<<<<<<< Updated upstream
=======
	private String img; //location of the card (folder to be defined)
>>>>>>> Stashed changes

	public Card(String name) {
		this.name = name;

	}
	public String getName() {
		return name;
	}



}
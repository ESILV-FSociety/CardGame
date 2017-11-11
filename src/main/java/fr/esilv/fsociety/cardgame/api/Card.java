package fr.esilv.fsociety.cardgame.api;

/*
* put all the pictures in a folder (to be defined)
* each Card object created will take a name and the url of the file
*/

public abstract class Card {
	private String name; // name of the card
	private String img; //location of the card (folder to be defined

	public Card(String name, String img) {
		this.name = name;
		this.img = img;
	}

	public String getName() {
		return name;
	}

	public String getImg() {
		return img;
	}

	/**
	 * Activates this Card's effect on the game
	 * @param theGame
	 */
	public abstract void activate(Game theGame);

	//TODO show function


}
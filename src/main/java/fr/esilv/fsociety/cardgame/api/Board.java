package fr.esilv.fsociety.cardgame.api;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javafx.scene.image.ImageView;

public class Board {

    private ArrayList<Card> hand;
    private ArrayList<Card> kingdom;

    public Board() {
        this.hand = new ArrayList<Card>();
        this.kingdom = new ArrayList<Card>();
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public ArrayList<Card> getKingdom() {
        return kingdom;
    }

    public void setKingdom(ArrayList<Card> kingdom) {
        this.kingdom = kingdom;
    }

    public void addCardToHand(Card card){
        this.getHand().add(card);
    }


    // for this code below, we will see later
    /*
	public ImageView[] handToImageViews() {
		return this.toImageView(hand);
	}
	
	public ImageView[] kingdomToImageViews() {
		return this.toImageView(kingdom);
	}
	
	private ImageView[] toImageView(List<Card> l) {
		LinkedList<ImageView> list = new LinkedList();
		
		for(Card c:l)
			list.add(c.toImageView());
		
		return list.toArray(new ImageView[0]);		
	}
	*/

    
    //TODO show function
}
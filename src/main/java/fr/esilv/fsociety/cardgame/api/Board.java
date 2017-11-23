package fr.esilv.fsociety.cardgame.api;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javafx.scene.image.ImageView;

public class Board {

    private int[] hand;
    private int[] kingdom;

    public Board() {
        this.hand = new int[6];
        this.kingdom = new int[6];
    }

    public int[] getHand() {
        return hand;
    }

    public void setHand(int[] hand) {
        this.hand = hand;
    }

    public int[] getKingdom() {
        return kingdom;
    }

    public void setKingdom(int[] kingdom) {
        this.kingdom = kingdom;
    }

    public void addCardToHand(Card card){
        switch(card.getName()){
            case "Gnome":
                this.hand[0] += 1;
                break;
            case "Korrigan":
                this.hand[1] += 1;
                break;
            case "Goblin":
                this.hand[2] += 1;
                break;
            case "Elf":
                this.hand[3] += 1;
                break;
            case "Dryad":
                this.hand[4] += 1;
                break;
            case "Troll":
                this.hand[5] += 1;
                break;
            default:
                break;
        }
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
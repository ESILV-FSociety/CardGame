package fr.esilv.fsociety.cardgame.api;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;

import fr.esilv.fsociety.cardgame.api.races.*;
import javafx.scene.image.ImageView;

import static javax.swing.UIManager.put;

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
    public int numOfCardInHand()
    {
        int numofCard=0;
        for(int i=0; i<this.getHand().length;i++)
        {
            numofCard+=this.hand[i];
        }
        return numofCard;
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

    public int addCardToHand(Card card){
        this.hand[card.id] += 1;
        return card.id;
    }

    public boolean emptyHand() {
        int n = 0;
        for (int i = 0; i < this.getHand().length; i++) {
            if (!emptyRacesOnIndex(i)) return false;
        }
        return true;
    }

    public boolean emptyRacesOnIndex(int index){
        return this.hand[index] == 0;
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
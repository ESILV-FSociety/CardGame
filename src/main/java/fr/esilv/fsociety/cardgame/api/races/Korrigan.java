package fr.esilv.fsociety.cardgame.api.races;

import fr.esilv.fsociety.cardgame.api.Card;
import fr.esilv.fsociety.cardgame.api.Game;

import java.util.Random;

public class Korrigan extends Card {

    private int[] testArray;

    public Korrigan() {
        super(1, "Korrigan");
    }

    // Korrigan : draw 2 random cards within your opponent hand

    @Override
    public void activatePower(Game game) {
        if(game.getOpponentPlayer().getBoard().numOfCardInHand()>2)
        {
            activatePowerBis(game);
            activatePowerBis(game);
        }
        else{
            if(game.getOpponentPlayer().getBoard().numOfCardInHand()==0)
            {
                System.out.print("Opponent's hand run out of cards");
            }
            else
            {
                if(game.getOpponentPlayer().getBoard().numOfCardInHand()==1)
                {
                    activatePowerBis(game);
                    System.out.print("Opponent's hand had only one card");
                }

            }
        }
    }
    public int activatePowerBis(Game game) {
        Random random = new Random();
        int n [] = game.getOpponentPlayer().getBoard().getHand();
        Boolean empty = true;
        int rand= random.nextInt(n.length);
        for (int i = 0;  i<n.length; i++)
        {
            if (game.getOpponentPlayer().getBoard().getHand()[i] != 0){

                empty = false;
            }
        }
        if (empty == true){
            rand = -1;
        }
        else{

            while( game.getOpponentPlayer().getBoard().getHand()[rand] == 0){
                rand = random.nextInt(n.length);
            }
            game.getOpponentPlayer().getBoard().getHand()[rand]-= 1;
            game.getCurrentPlayer().getBoard().getHand()[rand]+= 1;

        }
        return rand;
    }
}


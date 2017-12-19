package fr.esilv.fsociety.cardgame.api.races;

import cucumber.deps.com.thoughtworks.xstream.mapper.Mapper;
import fr.esilv.fsociety.cardgame.api.Card;
import fr.esilv.fsociety.cardgame.api.Game;

import java.util.List;
import java.util.Random;

public class Dryad extends Card {


	public Dryad() {
		super(4, "Dryad");
	}

    @Override
    public void activatePower(Game game) {
      activatePowerBis(game);

    }

	public int activatePowerBis(Game game){
		// stole a card in front of your opponent and add it in front of you without activating its power.


        Random random = new Random();

        // We need to copy a card that we have in our kingdom (<==> an index where the value is not equal to 0)
        int n [] = game.getOpponentPlayer().getBoard().getKingdom();

        Boolean empty = true;
        int rand= random.nextInt(n.length);

        for (int i = 0;  i<n.length; i++)
        {
            if (game.getOpponentPlayer().getBoard().getKingdom()[i] != 0){

                empty = false;



            }
        }
        if (empty == true){
            rand = -1;
        }
        else{

            while( game.getOpponentPlayer().getBoard().getKingdom()[rand] == 0){
                rand = random.nextInt(n.length);
            }
            game.getOpponentPlayer().getBoard().getKingdom()[rand]-= 1;
            game.getCurrentPlayer().getBoard().getKingdom()[rand]+= 1;

        }


        return rand;
	}



}

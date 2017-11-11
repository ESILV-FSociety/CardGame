package fr.esilv.fsociety.cardgame.Controller;

import fr.esilv.fsociety.cardgame.api.Card;
import fr.esilv.fsociety.cardgame.api.Game;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class GameOverviewController {

    private Game game;
    private String humanName; // new name of the player
    private ArrayList<Card> humanKingdomCards; // each cards on the kingdom will be contain in the list
    private ArrayList<Card> aiKingdomCards; // same here

    @FXML
    private GridPane HumanKingdom;

    @FXML
    private HBox HumanHand;

    @FXML
    private Text AiName;

    @FXML
    private Text AiScore;

    @FXML
    private ImageView DeckImageView;

    @FXML
    private Text HumanScore;

    @FXML
    private Text HumanName;

    @FXML
    private HBox AiHand;

    @FXML
    private GridPane AiKingdom;

    @FXML
    private void ClickOnDeck(MouseEvent event) { // only used

        this.game.drawCard(this.game.getP2());
        updateDisplayHands();

    }
    //this.game.start(); to be called after entering the name (by the login view)


    public void DisplaySth(){
        Image image = new Image("CardGame\\src\\main\\java\\resources\\fr.esilv.fsociety.cardgame\\cardPictures\\goblin.png");
        HumanKingdom.getChildren().add(new ImageView(image));
    }

    public void initialize(){
        updateDisplayHands();
        updateDisplayKingdoms();
        updateDisplayScore();
        updateDisplayName();
    }

    public void updateDisplayScore(){
        AiScore.setText(String.valueOf(this.game.getP1().getScore()));
        HumanScore.setText(String.valueOf(this.game.getP2().getScore()));
    }

    public void updateDisplayName(){ // one time ONLY
        AiScore.setText(this.game.getP1().getName());
        HumanName.setText(this.game.getP2().getName());
    }

    public void updateDisplayHands(){

        ArrayList<Card> list = this.game.getCurrentPlayer().getBoard().getHand();
        int s = list.size();
        for(int i = 0; i < s; i++){
            Image img = new Image(list.get(i).getImg());
        }
    }

    public void updateDisplayKingdoms(){

    }

    public void start(){
        //initialize the game
        Game game = new Game();
        // random current player on start
        game.startingPlayer(); // set the currentPlayer => 2 cases : if human else AI
        //each player draw 5 cards
        game.playersDraw5Cards();
        //initialize boards (human + AI)
        initialize();

        if(game.isHuman()){
            // wait on deck clicked
           // this.gameoverviewcontroller.

        }
        else {
            //draw a card
          //  game.drawCard();
            //put a random card of the hand in the kingdom

           // this.gameoverviewcontroller.

        }
        //size of hand before :
        //int n = game.getCurrentPlayer().getBoard().getHand().size();
        //System.out.println("size : " + n);
        //draw a card and add it to his hand

        // size of the hand after drawing a card
        //n = game.getCurrentPlayer().getBoard().getHand().size();
        //System.out.println("size : " + n);

    }







    //connect this controller class and the game class
    public void setGame(Game game){
        this.game = game;
    }

}

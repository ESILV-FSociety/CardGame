package fr.esilv.fsociety.cardgame.controller;

import com.sun.javafx.font.freetype.HBGlyphLayout;
import fr.esilv.fsociety.cardgame.Launcher;
import fr.esilv.fsociety.cardgame.api.Card;
import fr.esilv.fsociety.cardgame.api.Game;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

import java.awt.*;
import java.util.ArrayList;
import java.util.Hashtable;


public class GameOverviewController {

    private static final Hashtable<Integer,String> hash_image_path = new Hashtable<Integer,String>(){{
        put(0,"images/gnome.png");
        put(1,"images/korrigan.png");
        put(2,"images/goblin.png");
        put(3,"images/elf.png");
        put(4,"images/dryad.png");
        put(5,"images/troll.png");
    }};



    Launcher application;

    private Game game;

    private String humanName; // new name of the player

@FXML
private GridPane BoardsPanel;

    // Player

    @FXML
    private HBox HumanKingdom;
    @FXML
    private HBox HumanHand;
    @FXML
    private Text HumanScore;
    @FXML
    private Text HumanName;
    @FXML
    private ImageView DeckCardHuman;

    // Computer

    @FXML
    private Text AiName;
    @FXML
    private Text AiScore;
    @FXML
    private HBox AiHand;
    @FXML
    private HBox AiKingdom;
    @FXML
    private ImageView DeckCardAI;

    //Deck

    @FXML
    private ImageView DeckImageView;
    @FXML
    private GridPane DeckPanel;

    //Human Hand

    @FXML
    private Text hhncard1;
    @FXML
    private Text hhncard2;
    @FXML
    private Text hhncard3;
    @FXML
    private Text hhncard4;
    @FXML
    private Text hhncard5;
    @FXML
    private Text hhncard6;


    @FXML
    private ImageView hhcard1;
    @FXML
    private ImageView hhcard2;
    @FXML
    private ImageView hhcard3;
    @FXML
    private ImageView hhcard4;
    @FXML
    private ImageView hhcard5;
    @FXML
    private ImageView hhcard6;

    private Hashtable<Integer,ImageView> hash_hhcard;
    private Hashtable<Integer,Text> hash_hhncard;

    @FXML
     void ClickOnDeck(MouseEvent event) { // only used

        this.game.drawCard();
        updateDisplayHand();
    }
    @FXML
    private void ClickOnHand(MouseEvent event){

    }

    public GameOverviewController(Launcher application){
        this.application = application;
    }

    //this.game.start(); to be called after entering the name (by the login view)

    public void initialize() {

        //initialize the hashtable taht will contain match the ImageViews (HumanHand)
        this.hash_hhcard = new Hashtable<Integer,ImageView>(){{
            put(0,hhcard1);
            put(1,hhcard2);
            put(2,hhcard3);
            put(3,hhcard4);
            put(4,hhcard5);
            put(5,hhcard6);
        }};

        //initialize the hashtable that will contain the number of the Card
        this.hash_hhncard = new Hashtable<Integer,Text>(){{
            put(0,hhncard1);
            put(1,hhncard2);
            put(2,hhncard3);
            put(3,hhncard4);
            put(4,hhncard5);
            put(5,hhncard6);
        }};

        //optional
        BoardsPanel.setGridLinesVisible(true);
        DeckPanel.setGridLinesVisible(true);

        this.game = new Game();
        this.humanName = "Max";

        initializeDeck();
        updateDisplayScores();

        game.startingPlayer();
        game.playersDraw5Cards();
        updateDisplayDeck();
        updateDisplayHand();
        updateDisplayKingdoms();


    }

    private void initElements(){

    }

    private void initializeDeck(){
       DeckImageView.fitWidthProperty().bind(DeckPanel.widthProperty());
    }
    private void updateDisplayScores() {
        AiScore.setText(String.valueOf(this.game.getP1().getScore()));
        HumanScore.setText(String.valueOf(this.game.getP2().getScore()));
    }
    private void updateDisplayHand() {

        int [] list = this.game.getCurrentPlayer().getBoard().getHand();
        String[] list_url = new String [6];

        //retrieve all the url
        for (int i = 0; i < list.length; i++) {
            if(list[i] != 0){


            list_url[i] = getClass().getClassLoader().getResource(hash_image_path.get(i)).toString();

            int n = this.game.getCurrentPlayer().getBoard().getHand()[i];
            this.hash_hhncard.get(i).setText(String.valueOf(n));
            this.hash_hhcard.get(i).setImage(new Image(list_url[i]));
            }
            else{
                hash_hhncard.get(i).setText("0");
                String image_URL = getClass().getClassLoader().getResource("images/empty.png").toString();
                this.hash_hhcard.get(i).setImage(new Image(image_URL));
            }
        }
    }

    private void updateDisplayDeck(){
        String image_URL = getClass().getClassLoader().getResource("images/deck.png").toString();
        DeckImageView.setImage(new Image(image_URL));
    }
    private void updateDisplayKingdoms() {

    }

    public void start() {
        //initialize the game
        Game game = new Game();
        // random current player on start
        game.startingPlayer(); // set the currentPlayer => 2 cases : if human else AI
        //each player draw 5 cards
        game.playersDraw5Cards();
        //initialize boards (human + AI)

    }
}/* initialize();

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


*/
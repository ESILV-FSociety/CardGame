package fr.esilv.fsociety.cardgame.controller;

import fr.esilv.fsociety.cardgame.Launcher;
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
import java.util.Hashtable;


public class GameOverviewController {

    private static final Hashtable<Integer,String> hash_image_path = new Hashtable<Integer,String>(){{
        put(0,"images/dryad.png");
        put(1,"images/elf.png");
        put(2,"images/gnome.png");
        put(3,"images/goblin.png");
        put(4,"images/korrigan.png");
        put(5,"images/troll.png");
    }};





    private Game game;

    private String humanName; // new name of the player

@FXML
private GridPane BoardsPanel;

    // Player

    @FXML
    private GridPane HumanKingdom;
    @FXML
    private GridPane HumanHand;
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
    private GridPane AiKingdom;
    @FXML
    private ImageView DeckCardAI;

    //Deck

    @FXML
    private ImageView DeckImageView;
    @FXML
    private GridPane DeckPanel;

    //Human Kingdom

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

    private Hashtable<Integer,ImageView> hash_hhcard = new Hashtable<Integer,ImageView>(){{
        put(0,hhcard1 = new ImageView());
        put(1,hhcard2 = new ImageView());
        put(2,hhcard3 = new ImageView());
        put(3,hhcard4 = new ImageView());
        put(4,hhcard5 = new ImageView());
        put(5,hhcard6 = new ImageView());
    }};

    @FXML
    private void ClickOnDeck(MouseEvent event) { // only used

        this.game.drawCard();
        //updateDisplayHand();
    }
    @FXML
    private void ClickOnHand(MouseEvent event){

    }

    Launcher application;



    public GameOverviewController(Launcher application){
        this.application = application;
    }

    //this.game.start(); to be called after entering the name (by the login view)

    public void initialize() {

        BoardsPanel.setGridLinesVisible(true);
        DeckPanel.setGridLinesVisible(true);
        initializeDeck();
  //      initializeImageViews();
        this.game = new Game();
        this.humanName = "Max";
        updateDisplayScores();
        game.startingPlayer();
        game.playersDraw5Cards();
        updateDisplayDeck();
        updateDisplayHand();
        updateDisplayKingdoms();
    }

    private void initializeDeck(){
       DeckImageView.fitWidthProperty().bind(DeckPanel.widthProperty());
    }


    // OK works
    private void updateDisplayScores() {
        AiScore.setText(String.valueOf(this.game.getP1().getScore()));
        HumanScore.setText(String.valueOf(this.game.getP2().getScore()));
    }

    // OK works

    // OK (to be reviewed later) but works

    private void updateDisplayHand() {

       int [] list = this.game.getCurrentPlayer().getBoard().getHand();
        String[] list_url = new String [6];

        //retrieve all the url
        for (int i = 0; i < list.length; i++) {
            if(list[i] != 0){

            list_url[i] = getClass().getClassLoader().getResource(hash_image_path.get(i)).toString();
            hash_hhcard.get(i).setImage(new Image(list_url[i]));
            }
        }
    }


    private void updateDisplayDeck(){
        String image_URL = getClass().getClassLoader().getResource("images/deck.png").toString();
        DeckImageView.setImage(new Image(image_URL));
        //DeckImageView.fitWidthProperty().bind(DeckPanel.widthProperty());
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
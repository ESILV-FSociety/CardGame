package fr.esilv.fsociety.cardgame.Controller;

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



    private static final Hashtable<String,String> hash = new Hashtable<String,String>(){{
        put("Dryad","images/dryad.png");
        put("Elf","images/elf.png");
        put("Gnome","images/gnome.png");
        put("Goblin","images/goblin.png");
        put("Korrigan","images/korrigan.png");
        put("Troll","images/troll.png");
    }};

    private Game game;
    private String humanName; // new name of the player



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


    @FXML
    private void ClickOnDeck(MouseEvent event) { // only used

        this.game.drawCard(this.game.getCurrentPlayer());
        updateDisplayHand();
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

        initializeDeck();
        initializeImageViews();
        this.game = new Game();
        this.humanName = "Max";
        updateDisplayName(humanName);
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
private void initializeImageViews(){


    hhcard1.fitWidthProperty().bind(HumanHand.widthProperty());
    hhcard2.fitWidthProperty().bind(HumanHand.widthProperty());
    hhcard3.fitWidthProperty().bind(HumanHand.widthProperty());
    hhcard4.fitWidthProperty().bind(HumanHand.widthProperty());
    hhcard5.fitWidthProperty().bind(HumanHand.widthProperty());
    hhcard6.fitWidthProperty().bind(HumanHand.widthProperty());
}

    // OK works
    private void updateDisplayScores() {
        AiScore.setText(String.valueOf(this.game.getP1().getScore()));
        HumanScore.setText(String.valueOf(this.game.getP2().getScore()));
    }

    // OK works
    private void updateDisplayName(String name) { // one time ONLY
        this.game.getP2().setName(name);
        AiScore.setText(this.game.getP1().getName());
        HumanName.setText(this.game.getP2().getName());
    }
    // OK (to be reviewed later) but works
    private void updateDisplayHand() {

        ArrayList<Card> list = this.game.getCurrentPlayer().getBoard().getHand();
        ArrayList<String> list_url = new ArrayList<String>();

        //retrieve all the url
        for (int i = 0; i < list.size(); i++) {
            String image_URL = getClass().getClassLoader().getResource(hash.get(list.get(i).getName())).toString();
            list_url.add(image_URL);
        }
        if(list_url.size() >= 1) {
            hhcard1.setImage(new Image(list_url.get(0)));
            if(list_url.size() >= 2){
                hhcard2.setImage(new Image(list_url.get(1)));
                if(list_url.size() >= 3){
                    hhcard3.setImage(new Image(list_url.get(2)));
                    if(list_url.size() >= 4){
                        hhcard4.setImage(new Image(list_url.get(3)));
                        if(list_url.size() >= 5){
                            hhcard5.setImage(new Image(list_url.get(4)));
                            if(list_url.size() == 6){
                                hhcard6.setImage(new Image(list_url.get(5)));
                            }
                        }
                    }
                }
            }
        }
        initializeImageViews();
    }

    private void updateDisplayDeck(){
        String image_URL = getClass().getClassLoader().getResource("images/deck.png").toString();
        DeckImageView.setImage(new Image(image_URL));
        DeckImageView.fitWidthProperty().bind(DeckPanel.widthProperty());
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
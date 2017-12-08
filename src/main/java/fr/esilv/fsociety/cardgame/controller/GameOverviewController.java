package fr.esilv.fsociety.cardgame.controller;

import java.util.Hashtable;

import fr.esilv.fsociety.cardgame.Launcher;
import fr.esilv.fsociety.cardgame.api.Card;
import fr.esilv.fsociety.cardgame.api.Game;
import fr.esilv.fsociety.cardgame.api.Human;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;


public class GameOverviewController {

    private static final Hashtable<Integer, String> hash_image_path = new Hashtable<Integer, String>() {{
        put(0, "images/gnome.png");
        put(1, "images/korrigan.png");
        put(2, "images/goblin.png");
        put(3, "images/elf.png");
        put(4, "images/dryad.png");
        put(5, "images/troll.png");
    }};

    Launcher application;
    private Game game;
    private String humanName; // new name of the player

    //for the player
    private Hashtable<Integer, ImageView> hash_hhcard;
    private Hashtable<Integer, Text> hash_hhncard;
    private Hashtable<Integer, ImageView> hash_hkcard;
    private Hashtable<Integer, Text> hash_hkncard;

    //for the AI
    private Hashtable<Integer, ImageView> hash_ahcard;
    private Hashtable<Integer, Text> hash_ahncard;
    private Hashtable<Integer, ImageView> hash_akcard;
    private Hashtable<Integer, Text> hash_akncard;

    @FXML
    private GridPane BoardsPanel;
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
    @FXML
    private ImageView DeckImageView;
    @FXML
    private GridPane DeckPanel;

    //AI hand cards number

    @FXML
    private Text ahncard1;
    @FXML
    private Text ahncard2;
    @FXML
    private Text ahncard3;
    @FXML
    private Text ahncard4;
    @FXML
    private Text ahncard5;
    @FXML
    private Text ahncard6;

    //AI hand cards

    @FXML
    private ImageView ahcard1;
    @FXML
    private ImageView ahcard2;
    @FXML
    private ImageView ahcard3;
    @FXML
    private ImageView ahcard4;
    @FXML
    private ImageView ahcard5;
    @FXML
    private ImageView ahcard6;

    // AI kingdom cards
    @FXML
    private ImageView akcard1;
    @FXML
    private ImageView akcard2;
    @FXML
    private ImageView akcard3;
    @FXML
    private ImageView akcard4;
    @FXML
    private ImageView akcard5;
    @FXML
    private ImageView akcard6;

    // AI kingdom cards numbers

    @FXML
    private Text akncard1;
    @FXML
    private Text akncard2;
    @FXML
    private Text akncard3;
    @FXML
    private Text akncard4;
    @FXML
    private Text akncard5;
    @FXML
    private Text akncard6;


    // human hand number cards
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

    //human hand cards
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

    //human kingdom numbers cards
    @FXML
    private Text hkncard1;
    @FXML
    private Text hkncard2;
    @FXML
    private Text hkncard3;
    @FXML
    private Text hkncard4;
    @FXML
    private Text hkncard5;
    @FXML
    private Text hkncard6;

    //human kingdom cards
    @FXML
    private ImageView hkcard1;
    @FXML
    private ImageView hkcard2;
    @FXML
    private ImageView hkcard3;
    @FXML
    private ImageView hkcard4;
    @FXML
    private ImageView hkcard5;
    @FXML
    private ImageView hkcard6;

    @FXML
    void ClickOnDeck(MouseEvent event) { // only used

        this.game.drawCard();
        updateDisplayHand();
    }

    @FXML
    private void ClickOnHand(MouseEvent event) {

    }

    public GameOverviewController(Launcher application) {
        this.application = application;
        
    }

    //this.game.start(); to be called after entering the name (by the login view)

    public void initialize() {

        // for the player
        this.hash_hhcard = new Hashtable<Integer, ImageView>() {{
            put(0, hhcard1);
            put(1, hhcard2);
            put(2, hhcard3);
            put(3, hhcard4);
            put(4, hhcard5);
            put(5, hhcard6);
        }};

        this.hash_hhncard = new Hashtable<Integer, Text>() {{
            put(0, hhncard1);
            put(1, hhncard2);
            put(2, hhncard3);
            put(3, hhncard4);
            put(4, hhncard5);
            put(5, hhncard6);
        }};

        this.hash_hkcard = new Hashtable<Integer, ImageView>() {{
            put(0, hkcard1);
            put(1, hkcard2);
            put(2, hkcard3);
            put(3, hkcard4);
            put(4, hkcard5);
            put(5, hkcard6);
        }};

        this.hash_hkncard = new Hashtable<Integer, Text>() {{
            put(0, hkncard1);
            put(1, hkncard2);
            put(2, hkncard3);
            put(3, hkncard4);
            put(4, hkncard5);
            put(5, hkncard6);
        }};

        // for the AI

        this.hash_ahcard = new Hashtable<Integer, ImageView>() {{
            put(0, ahcard1);
            put(1, ahcard2);
            put(2, ahcard3);
            put(3, ahcard4);
            put(4, ahcard5);
            put(5, ahcard6);
        }};

        this.hash_ahncard = new Hashtable<Integer, Text>() {{
            put(0, ahncard1);
            put(1, ahncard2);
            put(2, ahncard3);
            put(3, ahncard4);
            put(4, ahncard5);
            put(5, ahncard6);
        }};


        this.hash_akcard = new Hashtable<Integer, ImageView>() {{
            put(0, akcard1);
            put(1, akcard2);
            put(2, akcard3);
            put(3, akcard4);
            put(4, akcard5);
            put(5, akcard6);
        }};

        this.hash_akncard = new Hashtable<Integer, Text>() {{
            put(0, akncard1);
            put(1, akncard2);
            put(2, akncard3);
            put(3, akncard4);
            put(4, akncard5);
            put(5, akncard6);
        }};

        initializeComponents();
        this.game = new Game();
        this.humanName = "Max";

        game.startingPlayer();
        game.playersDraw5Cards();

        updateDisplayScores();

        for(int i = 0; i < 2; i++) {

            updateDisplayDeck();
            updateDisplayHand();
            updateDisplayKingdoms();
            game.changePlayer();
            System.out.println(game.getCurrentPlayer().getClass().toString());
        }
    }

    private void initializeComponents(){
        initializeDeck();
        initHumanHand();
        initHumanKingdom();
        initAIHand();
        initAIKingdom();

    }
    private void initializeDeck() {
        DeckImageView.fitWidthProperty().bind(HumanHand.heightProperty());
    }

    private void initAIHand() {
        for (int i = 0; i < hash_ahcard.size(); i++) {
            hash_ahcard.get(i).fitHeightProperty().bind(AiHand.heightProperty());
        }
        AiHand.spacingProperty().setValue(15);//to be modified
    }

    private void initAIKingdom(){
        for(int i = 0 ; i < hash_akcard.size(); i++){
            hash_akcard.get(i).fitHeightProperty().bind(AiHand.heightProperty());
        }
        AiKingdom.spacingProperty().setValue(15);
    }

    private void initHumanHand() {
        for (int i = 0; i < hash_hhcard.size(); i++) {
            hash_hhcard.get(i).fitHeightProperty().bind(HumanHand.heightProperty());
        }
        HumanHand.spacingProperty().setValue(15);//to be modified
    }

    private void initHumanKingdom(){
        for(int i = 0; i < hash_hkcard.size(); i++){
            hash_hkcard.get(i).fitHeightProperty().bind(HumanHand.heightProperty());
            hash_hkcard.get(i).fitWidthProperty().bind(HumanHand.widthProperty());
        }
        HumanKingdom.spacingProperty().setValue(15);
    }



    private void updateDisplayScores() {
        AiScore.setText(String.valueOf(this.game.getP1().getScore()));
        HumanScore.setText(String.valueOf(this.game.getP2().getScore()));
    }

    private void updateDisplayHand() {

        int[] list = this.game.getCurrentPlayer().getBoard().getHand();
        String[] list_url = new String[6];

        //retrieve all the url
        for (int i = 0; i < list.length; i++) {
            if (list[i] != 0) {

	            list_url[i] = getClass().getClassLoader().getResource(hash_image_path.get(i)).toString();
	
	            int n1 = this.game.getCurrentPlayer().getBoard().getHand()[i];
	            this.hash_hhncard.get(i).setText(String.valueOf(n1));
	            this.hash_hhcard.get(i).setImage(new Image(list_url[i]));
	            this.hash_hhcard.get(i).setPickOnBounds(true);
	            final int cardId = i;
	            this.hash_hhcard.get(i).setOnMouseClicked(event -> { // c'est pas l'endroit
	            	this.cardClicked(cardId);
	            });
            }else{
                hash_hhncard.get(i).setText("0");
                String image_URL = getClass().getClassLoader().getResource("images/empty.png").toString();
                this.hash_hhcard.get(i).setImage(new Image(image_URL));
            }
        }
    }
    
    private void cardClicked(int cardId) {
    	System.out.println("Clicked on card id "+cardId);
    	//adding the card to the kingdom
    	if(this.game.getCurrentPlayer().getBoard().emptyRacesOnIndex(cardId))
    		return;
    	
    	this.game.getCurrentPlayer().getBoard().getHand()[cardId] -= 1;
    	this.game.getCurrentPlayer().getBoard().getKingdom()[cardId] += 1;
    	
    	this.updateDisplayKingdoms();
    	this.updateDisplayHand();
    	
    	
    	Card.CARD_MAP.get(cardId).activatePower(game);
    	
    }

    private void updateDisplayDeck() {
        String image_URL = getClass().getClassLoader().getResource("images/deck.png").toString();
        DeckImageView.setImage(new Image(image_URL));
    }

    private void updateDisplayKingdoms() { // adapt the code to work with Human or AI
    	int [] list = this.game.getCurrentPlayer().getBoard().getKingdom();
    	String [] listURL = new String [6];
    	//retrieve the url
        for (int i = 0; i < list.length; i++) {
            if (list[i] != 0) {

                listURL[i] = getClass().getClassLoader().getResource(hash_image_path.get(i)).toString();

                int n = this.game.getCurrentPlayer().getBoard().getKingdom()[i];
                this.hash_hkncard.get(i).setText(String.valueOf(n));
                this.hash_hkcard.get(i).setImage(new Image(listURL[i]));
            }else{
                hash_hkncard.get(i).setText("0");
                String image_URL = getClass().getClassLoader().getResource("images/empty.png").toString();
                this.hash_hkcard.get(i).setImage(new Image(image_URL));
            }
        }
    }

    public void start() {
        //initialization
        Game game = new Game();
        game.startingPlayer();
        game.playersDraw5Cards();
        // while !endGame (no more cards)
            //choose a random player
            //the player draw a card
            //the player play a card
            //change player
            //all the methods to update ...
        //at the end : open a message to say sth like "You Win / Lose with a score of ...




    }
}
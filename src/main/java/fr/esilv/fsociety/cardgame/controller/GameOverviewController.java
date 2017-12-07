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
    private Hashtable<Integer, ImageView> hash_hhcard;
    private Hashtable<Integer, Text> hash_hhncard;

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


        //initialize the hashtable taht will contain match the ImageViews (HumanHand)
        this.hash_hhcard = new Hashtable<Integer, ImageView>() {{
            put(0, hhcard1);
            put(1, hhcard2);
            put(2, hhcard3);
            put(3, hhcard4);
            put(4, hhcard5);
            put(5, hhcard6);
        }};

        initHumanHand();

        //initialize the hashtable that will contain the number of the Card
        this.hash_hhncard = new Hashtable<Integer, Text>() {{
            put(0, hhncard1);
            put(1, hhncard2);
            put(2, hhncard3);
            put(3, hhncard4);
            put(4, hhncard5);
            put(5, hhncard6);
        }};


        BoardsPanel.setGridLinesVisible(true);
     //   DeckPanel.setGridLinesVisible(true);

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

    private void initializeDeck() {

        //DeckImageView.fitHeightProperty().bind(DeckPanel.heightProperty());
       // DeckImageView.fitWidthProperty().bind(DeckPanel.widthProperty());
        DeckImageView.fitWidthProperty().bind(HumanHand.heightProperty());
        hhcard1.fitHeightProperty().bind(HumanHand.heightProperty());
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
	
	            int n = this.game.getCurrentPlayer().getBoard().getHand()[i];
	            this.hash_hhncard.get(i).setText(String.valueOf(n));
	            this.hash_hhcard.get(i).setImage(new Image(list_url[i]));
	            this.hash_hhcard.get(i).setPickOnBounds(true);
	            final int cardId = i;
	            this.hash_hhcard.get(i).setOnMouseClicked(event -> {
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
    	//ajout de la carte au kingdom
        //
    	
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

    private void updateDisplayKingdoms() {
    	//TODO
    }

    private void updateDisplayKingdomPlayer(){

    }

    private void initHumanHand(){
        for(int i = 0; i < hash_hhcard.size(); i++){
            hash_hhcard.get(i).fitHeightProperty().bind(HumanHand.heightProperty());
        }
    }

    public void start() {
        //initialize the game
        Game game = new Game();
        // random current player on start
        game.startingPlayer(); // set the currentPlayer => 2 cases : if human else AI
        //each player draw 5 cards
        game.playersDraw5Cards();
        //initialize boards (human + AI)

        //TO-D0
        // Game loop

    }
}
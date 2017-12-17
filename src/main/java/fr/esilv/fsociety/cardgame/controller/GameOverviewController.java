package fr.esilv.fsociety.cardgame.controller;

import java.util.Hashtable;

import fr.esilv.fsociety.cardgame.Launcher;
import fr.esilv.fsociety.cardgame.api.*;
import gherkin.lexer.Hu;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import java.lang.Thread;

import static sun.audio.AudioPlayer.player;


public class GameOverviewController extends Thread{

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
    private boolean AiPlay;
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

    private int threadSleep;
    private int maxCardInDeck;
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
    private Text TextInfo;

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
    private Text name1;
    @FXML
    private Text name2;



    @FXML
    void ClickOnDeck(MouseEvent event) throws InterruptedException { // only used
        TextInfo.setText("Player " + game.getCurrentPlayer().getName() + " drew a card");

        this.game.drawCard();
        updateDisplayHand();

    }

    @FXML
    void startToPlay(MouseEvent event) throws InterruptedException {
        initGame();
    }


    public GameOverviewController(Launcher application) {
        this.application = application;

    }

    //this.game.start(); to be called after entering the name (by the login view)

    public void initialize() throws InterruptedException {

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
        threadSleep = 500;
        maxCardInDeck = 30;

    }

    private void initializeComponents() {

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
            String imageUrl = getClass().getClassLoader().getResource("images/empty.png").toString();
            hash_ahcard.get(i).setImage(new Image(imageUrl));
            hash_ahcard.get(i).fitHeightProperty().bind(AiHand.heightProperty());
            hash_ahncard.get(i).setText("0");
        }
        AiHand.spacingProperty().setValue(15);//to be modified
    }

    private void initAIKingdom() {
        for (int i = 0; i < hash_akcard.size(); i++) {
            String imageUrl = getClass().getClassLoader().getResource("images/empty.png").toString();
            hash_akcard.get(i).setImage(new Image(imageUrl));
            hash_akcard.get(i).fitHeightProperty().bind(AiKingdom.heightProperty());
            hash_akncard.get(i).setText("0");
        }
        AiKingdom.spacingProperty().setValue(15);
    }

    private void initHumanHand() {
        for (int i = 0; i < hash_hhcard.size(); i++) {
            String imageUrl = getClass().getClassLoader().getResource("images/empty.png").toString();
            hash_hhcard.get(i).setImage(new Image(imageUrl));
            hash_hhcard.get(i).fitHeightProperty().bind(HumanHand.heightProperty());
        }
        HumanHand.spacingProperty().setValue(15);
    }

    private void initHumanKingdom() {
        for (int i = 0; i < hash_hkcard.size(); i++) {
            String imageUrl = getClass().getClassLoader().getResource("images/empty.png").toString();
            hash_hkcard.get(i).setImage(new Image(imageUrl));
            hash_hkcard.get(i).fitHeightProperty().bind(HumanKingdom.heightProperty());

        }
        HumanKingdom.spacingProperty().setValue(15);
    }


    private void initGame() throws InterruptedException { // OK
        //creating the game
        AiPlay = false;
        this.game = new Game();

        game.startingPlayer();
        game.playersDraw5Cards();
        name1.setText(this.game.getCurrentPlayer().getName());
        name2.setText(this.game.getOpponentPlayer().getName());

        updateDisplayScores();
        updateDisplayDeck();

        int i = 0;
        while (i < 2) {
            updateBoard();
            game.changePlayer();
            i++;
        }
        TextInfo.setText("Player : " + game.getCurrentPlayer().getName() + " begin !");
        //after updating the two boards, if the first player to play is the AI => AiPlay = true
        if (this.game.getCurrentPlayer() instanceof AI){
            AiPlay = true;

            AiMove();
            AiPlay = false;
        }
    }

    public void whoIsThePlayer() {
        System.out.println("turn of the player => " + this.game.getCurrentPlayer());
    }

    private void ShowCard(){
        for(int i = 0; i < this.game.getP2().getBoard().getHand().length; i++){
            this.hash_hhcard.get(i).setOnMouseDragOver(event-> {
                try {

                }catch (Exception e){

                }
            });
        }
    }



    private void cardClicked(int cardId) throws InterruptedException {
        System.out.println(game.getCurrentPlayer().getName() + " clicked on index " + cardId + " corresponding to " + hash_image_path.get(cardId));

        this.game.getCurrentPlayer().getBoard().getHand()[cardId] -= 1;
        this.game.getCurrentPlayer().getBoard().getKingdom()[cardId] += 1;
        String str = TextInfo.getText();
        TextInfo.setText(str + " => card at id " + cardId + " played ");
        updateBoard();
        this.sleep(threadSleep);





        Card.CARD_MAP.get(cardId).activatePower(game);
        str = TextInfo.getText();
        TextInfo.setText(str + " => power activated");

        updateBoards();
        this.sleep(threadSleep);

        this.game.changePlayer();
        TextInfo.setText("Turn of the " + game.getCurrentPlayer().getName());
        this.sleep(threadSleep);


        if (this.game.getCurrentPlayer() instanceof AI ) {
            AiMove();
        }
    }

    public void AiMove() throws InterruptedException {
        game.drawCard(); // player draw a card
        AI ai = (AI) game.getCurrentPlayer(); // cast from Player to => AI in order to call the Choice method
        int move = ai.Choice(); // get the index the computer will play
        AiPlay = false;
        this.cardClicked(move);
    }


    private void updateBoards(){
        updateDisplayHand();
        updateDisplayKingdom();
        game.changePlayer();
        updateDisplayHand();
        updateDisplayKingdom();
        game.changePlayer();
    }
    private void updateBoard() {
        updateDisplayHand();
        updateDisplayKingdom();
    }

    private void updateDisplayScores() {

        AiScore.setText(String.valueOf(this.game.getP1().getScore()));
        HumanScore.setText(String.valueOf(this.game.getP2().getScore()));
    }

    private void updateDisplayDeck() {
        String image_URL = getClass().getClassLoader().getResource("images/deck.png").toString();
        DeckImageView.setImage(new Image(image_URL));
    }

    private void updateDisplayHand() {

        int[] list = this.game.getCurrentPlayer().getBoard().getHand();
        String[] list_url = new String[6];

        //retrieve all the url
        for (int i = 0; i < list.length; i++) {

            list_url[i] = getClass().getClassLoader().getResource(hash_image_path.get(i)).toString();

            int n = this.game.getCurrentPlayer().getBoard().getHand()[i];

            if (n != 0) {
                if (this.game.getCurrentPlayer() instanceof Human) {

                    this.hash_hhncard.get(i).setText(String.valueOf(n));
                    this.hash_hhcard.get(i).setImage(new Image(list_url[i]));
                    this.hash_hhcard.get(i).setPickOnBounds(true);
                    final int cardId = i;
                    this.hash_hhcard.get(i).setOnMouseClicked(event -> {
                        try {
                            this.cardClicked(cardId);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    });
                } else { // if instanceOf "AI"
                    this.hash_ahncard.get(i).setText(String.valueOf(n)); // set the number
                    this.hash_ahcard.get(i).setImage(new Image(list_url[i])); // set the Image
                }
            } else { // n == 0
                String imageUrl = getClass().getClassLoader().getResource("images/empty.png").toString();

                if (this.game.getCurrentPlayer() instanceof Human) {
                    hash_hhncard.get(i).setText("0");
                    this.hash_hhcard.get(i).setImage(new Image(imageUrl));
                } else {
                    hash_ahncard.get(i).setText("0");
                    this.hash_ahcard.get(i).setImage(new Image(imageUrl));
                }
            }
        }
    }

    private void updateDisplayKingdom() { // adapt the code to work with Human or AI
        int[] list = this.game.getCurrentPlayer().getBoard().getKingdom();
        String[] listURL = new String[6];
        //retrieve the url
        for (int i = 0; i < list.length; i++) {

            listURL[i] = getClass().getClassLoader().getResource(hash_image_path.get(i)).toString();

            int n = this.game.getCurrentPlayer().getBoard().getKingdom()[i];

            if (n != 0) {

                if (this.game.getCurrentPlayer() instanceof Human) {

                    this.hash_hkncard.get(i).setText(String.valueOf(n));
                    this.hash_hkcard.get(i).setImage(new Image(listURL[i]));
                } else { // "AI"
                    this.hash_akncard.get(i).setText(String.valueOf(n));
                    this.hash_akcard.get(i).setImage((new Image(listURL[i])));
                }

            } else {
                String image_URL = getClass().getClassLoader().getResource("images/empty.png").toString();

                if (this.game.getCurrentPlayer() instanceof Human) {
                    hash_hkncard.get(i).setText("0");
                    this.hash_hkcard.get(i).setImage(new Image(image_URL));
                } else {
                    hash_akncard.get(i).setText(("0"));
                    this.hash_akcard.get(i).setImage((new Image(image_URL)));
                }
            }
        }
    }




}
package fr.esilv.fsociety.cardgame.Controller;

import fr.esilv.fsociety.cardgame.api.Game;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;



public class GameOverviewController {

    private Game game;

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
private void ClickOnDeck(MouseEvent event) {



}

    //Test method that will be deleted in the future
    //Test de display of a picture
    //Add directly an image to a GridPane without adding imageView (could be useful)
    public void DisplaySth(){
        Image image = new Image("CardGame\\src\\main\\java\\resources\\fr.esilv.fsociety.cardgame\\cardPictures\\goblin.png");
        HumanKingdom.getChildren().add(new ImageView(image));
    }

    //CONNECT this controller class with the game class
    public void setGame(Game game){
        this.game = game;
    }

}

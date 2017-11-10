package fr.esilv.fsociety.cardgame;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;



public class GameOverviewController {

    @FXML
    private GridPane TestGrid;

    //Test method that will be deleted in the future
    //Test de display of a picture
    //Add directly an image to a GridPane without adding imageView (could be useful)
    public void DisplaySth(){
        Image image = new Image("CardGame\\src\\main\\java\\resources\\fr.esilv.fsociety.cardgame\\cardPictures\\goblin.png");
        TestGrid.getChildren().add(new ImageView(image));
    }
}

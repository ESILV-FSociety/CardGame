package fr.esilv.fsociety.cardgame;
import fr.esilv.fsociety.cardgame.api.Card;
import fr.esilv.fsociety.cardgame.api.Game;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Path;
import javafx.stage.Stage;
import sun.plugin.javascript.navig.AnchorArray;

import java.io.File;
import java.util.ArrayList;


public class Launcher extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {


        try {
            // problem with the path ...

            System.out.println(new File(".").getCanonicalPath());
            FXMLLoader loader = new FXMLLoader(Launcher.class.getResource("/GameOverview.fxml"));
            Parent root = loader.load();
            primaryStage.setTitle("Game");
            primaryStage.setScene(new Scene(root, 1200, 800));
            primaryStage.show();
        } catch (Exception e) {
            System.out.println(e);
        }
/*        try {
            //initialize the game
            Game game = new Game();
            // random current player on start
            game.startingPlayer();
            //size of hand before :
            int n = game.getCurrentPlayer().getBoard().getHand().size();
            System.out.println("size : " + n);
            //draw a card and add it to his hand
            game.drawCard();
            // size of the hand after drawing a card
            n = game.getCurrentPlayer().getBoard().getHand().size();
            System.out.println("size : " + n);
            for (int i = 0; i < n; i++) {
                System.out.println(game.getCurrentPlayer().getBoard().getHand().get(i).getName());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        */
    }


    public static void main(String[] args) {
        launch(args);
    }
}
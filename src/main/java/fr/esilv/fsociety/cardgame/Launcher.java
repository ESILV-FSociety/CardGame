package fr.esilv.fsociety.cardgame;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Launcher extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {

    try {
        AnchorPane root = (AnchorPane) FXMLLoader.load(Launcher.class.getResource("/fr/esilv/fsociety/cardgame/GameOverview.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Awesome Game");
        primaryStage.show();
    }catch(Exception e){
        e.printStackTrace();
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
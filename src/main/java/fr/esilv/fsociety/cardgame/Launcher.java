package fr.esilv.fsociety.cardgame;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Launcher extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {

    try {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fr.esilv.fsociety.cardgame/GameOverview.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 1200, 800));
        primaryStage.show();
    }catch(Exception e){
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
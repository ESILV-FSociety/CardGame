package fr.esilv.fsociety.cardgame;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Launcher extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {

        startMenu(primaryStage);
    }


    public void startMenu(Stage primaryStage) throws Exception {
        try {
            AnchorPane root =  FXMLLoader.load(Launcher.class.getResource("/GameOverview.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Awesome Game");
            primaryStage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
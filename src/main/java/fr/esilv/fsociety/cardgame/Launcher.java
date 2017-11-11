package fr.esilv.fsociety.cardgame;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Path;
import javafx.stage.Stage;

import java.io.File;


public class Launcher extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            // problem with the path ...

            //System.out.println(new File(".").getCanonicalPath());
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/main/java/resources/fr.esilv.fsociety.cardgame/GameOverview.fxml"));
            Parent root = loader.load();
            primaryStage.setTitle("Game");
            primaryStage.setScene(new Scene(root, 1200, 800));
            primaryStage.show();
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
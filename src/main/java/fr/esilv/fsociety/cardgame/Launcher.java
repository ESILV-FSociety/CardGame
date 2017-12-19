package fr.esilv.fsociety.cardgame;
import fr.esilv.fsociety.cardgame.controller.GameOverviewController;
import fr.esilv.fsociety.cardgame.controller.MenuController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;


import static org.apache.log4j.helpers.Loader.getResource;

public class Launcher extends Application{
    Stage Menu;
    Stage Game;


    @Override
    public void start(Stage primaryStage) throws Exception {
        startMenu();
    }

    public void startMenu() throws Exception {
        final URL url = getResource("MenuOverview.fxml");
        final FXMLLoader fxmlLoader = new FXMLLoader(url);
        MenuController controller = new MenuController(this);
        fxmlLoader.setController(controller);
        Parent root = fxmlLoader.load();
        Menu = new Stage();
        Menu.setTitle("Menu");
        Menu.setScene(new Scene(root));
        Menu.show();
        controller.init();
//        System.out.println("ca marche");
    }

    public void startGame() throws Exception{
        final URL url = getResource("GameOverview.fxml");
        final FXMLLoader fxmlLoader = new FXMLLoader(url);
        GameOverviewController controller = new GameOverviewController(this);
        fxmlLoader.setController(controller);
        Parent root = fxmlLoader.load();
        Menu.hide();
        Game = new Stage();
        Game.setTitle("Game");
        Scene scene = new Scene(root,1000,800);
        Game.setScene(scene);
        Game.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
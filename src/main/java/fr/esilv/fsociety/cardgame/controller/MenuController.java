package fr.esilv.fsociety.cardgame.Controller;

import fr.esilv.fsociety.cardgame.Launcher;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MenuController extends Stage {

    Launcher application;

    @FXML
    private Button btn;

   public MenuController(Launcher application){
       this.application = application;
   }

   public void init(){
       btn.setOnAction(event -> {
           try {
               application.startGame();
           } catch (Exception e) {
               e.printStackTrace();
           }
       });
   }



}

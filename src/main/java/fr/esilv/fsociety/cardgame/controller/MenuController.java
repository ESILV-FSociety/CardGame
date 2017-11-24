package fr.esilv.fsociety.cardgame.controller;

import fr.esilv.fsociety.cardgame.Launcher;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Menucontroller extends Stage {

    Launcher application;

    @FXML
    private Button btn;

   public Menucontroller(Launcher application){
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

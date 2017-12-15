package fr.esilv.fsociety.cardgame.controller;

import fr.esilv.fsociety.cardgame.Launcher;
import fr.esilv.fsociety.cardgame.api.Player;
import gherkin.deps.com.google.gson.stream.JsonReader;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.json.simple.JSONObject;

import java.io.FileWriter;

public class MenuController extends Stage {

    Launcher application;

    @FXML
    private Button btn;
    @FXML
    private TextField p1;
    @FXML
    private TextField p2;

   public MenuController(Launcher application){
       this.application = application;
   }

   public void init(){


       btn.setOnAction(event -> {
           try {
               JSONObject obj = new JSONObject();
               if((p1.getText() != null && p1.getText() != null)){
                   obj.put("player 1", p1.getText().toString());
                   obj.put("player 2", p2.getText().toString());

               }
               else{
                   obj.put("player 1", "player 1");
                   obj.put("player 2", "player 2");
               }
               try (FileWriter file = new FileWriter("players.json")) {
                   file.write(obj.toJSONString());
                   file.flush();
               }



               application.startGame();
           } catch (Exception e) {
               e.printStackTrace();
           }
       });
   }



}

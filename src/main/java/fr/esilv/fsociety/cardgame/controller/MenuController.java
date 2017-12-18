package fr.esilv.fsociety.cardgame.controller;

import fr.esilv.fsociety.cardgame.Launcher;
import fr.esilv.fsociety.cardgame.api.Player;
import gherkin.deps.com.google.gson.stream.JsonReader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.json.simple.JSONObject;

import javax.swing.*;
import java.io.FileWriter;

public class MenuController extends Stage {

    Launcher application;

    @FXML
    private Button btn;
    @FXML
    private Button btn2;
    @FXML
    private TextField p1;
    @FXML
    private TextField p2;
    @FXML
    private CheckBox ai;


   public MenuController(Launcher application){
       this.application = application;
   }

   public void init(){

        btn2.setOnAction((ActionEvent event) -> {

            try {
                JSONObject obj = new JSONObject();
                    obj.put("player 1", "The Challenger");
                    obj.put("player 2", "AI");

                try (FileWriter file = new FileWriter("players.json")) {
                    file.write(obj.toJSONString());
                    file.flush();
                }
                hide();
                application.startGame();

            }catch (Exception e) {
                e.printStackTrace();
            }
        });
       btn.setOnAction((ActionEvent event) -> {
           try {
               JSONObject obj = new JSONObject();

                   if ((p1.getText() != null && p1.getText() != null)) {
                       obj.put("player 1", p1.getText().toString());
                       obj.put("player 2", p2.getText().toString());

                   } else {
                       obj.put("player 1", "player 1");
                       obj.put("player 2", "player 2");
                   }






               try (FileWriter file = new FileWriter("players.json")) {
                   file.write(obj.toJSONString());
                   file.flush();
               }
               hide();
               application.startGame();

           } catch (Exception e) {
               e.printStackTrace();
           }
       });
   }



}

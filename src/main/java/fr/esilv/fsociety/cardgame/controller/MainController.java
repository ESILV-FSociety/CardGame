package fr.esilv.fsociety.cardgame.controller;

import fr.esilv.fsociety.cardgame.api.Card;
import fr.esilv.fsociety.cardgame.api.Game;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MainController extends Application {

	private static MainController ins; // singleton
	public static  MainController getInstance() {
		return ins;
	}
	
	public MainController() {
		System.out.println("");
		ins = this;
		
	}

	
	private Game theGame; //the game reference
	
	@FXML
	private Pane root;
	
	@FXML
	private HBox bottomHand;
	
	@FXML
	private HBox bottomKingdom;
/*
	@FXML
	public void initialize() {
		theGame = new Game(); // New Game !
        
		this.root.setPrefSize(800, 600);
		
		this.bottomHand.setSpacing(8);
		this.bottomKingdom.setSpacing(8);
        
        this.refreshGraphic(this.bottomHand, this.bottomKingdom, Game.BOTTOM_PLAYER);
        System.out.print(this.bottomHand.getChildren().size());
	}
	*/
	  
   
    /*
    private void refreshGraphic(HBox hand, HBox kingdom, int pl) {
    	hand.getChildren().clear();
    	kingdom.getChildren().clear();
    	
    	Board b = this.theGame.getPlayer(pl).getBoard();
    	
    	hand.getChildren().addAll(b.handToImageViews());
    	kingdom.getChildren().addAll(b.kingdomToImageViews());    	
    }
    */
    
    public void onClick(Card c) {
    	//this.theGame.onClick(c);
    }

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
	}
    

}

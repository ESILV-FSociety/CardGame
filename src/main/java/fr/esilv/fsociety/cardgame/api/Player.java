package fr.esilv.fsociety.cardgame.api;

import java.util.List;
/* BEFORE
public class Player {

    private Board board;

    public Player(Board board) {
    	this.board = board;
    }

    public Player(List<Card> hand, List<Card> kingdom, int pos) {
    	this(new Board(hand, kingdom, pos));
    }

    public Board getBoard() {
    	return this.board;
    }


    public int getScore() {
    	return 0;
    }
}
*/
// AFTER



public class Player {

    private int idPLayer;
    private String name;
    private Board board;
    private int score;

    public Player(int idPLayer) {
        this.idPLayer = idPLayer;
        this.board = new Board();
        this.name = "";
        this.score = 0;
    }

    public int getIdPLayer() {
        return idPLayer;
    }

    public void setIdPLayer(int idPLayer) {
        this.idPLayer = idPLayer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        score = score;
    }

    public Board getBoard() {
        return board;
    }

    /**
     * Calculate the score
     * @return
     */


    // Methods
    // draw card
    // use card
}


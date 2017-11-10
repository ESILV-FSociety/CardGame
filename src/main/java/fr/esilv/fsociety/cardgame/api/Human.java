package fr.esilv.fsociety.cardgame.api;

public class Human extends Player {

    private int idPLayer;
    private String name;
    private Board board;
    private int Score;

    public Human(int idPLayer) {
        super(idPLayer);
        this.board = new Board();
        this.name = "Human"; // ask the name to the player later
    }

    public int getIdPLayer() {
        return idPLayer;
    }

    public Board getBoard() {
        return board;
    }

    public void setScore(int score) {
        Score = score;
    }

    public int getScore() {
        return 0;
    }
}
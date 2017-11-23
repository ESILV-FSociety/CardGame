package fr.esilv.fsociety.cardgame.api;

public abstract class Player {

    //idPlayer of AI is 0
    //idPlayer of the Human is 1

    private int idPLayer;
    private Board board;
    private int score;
    private String name;

    public Player(int idPLayer) {
        this.idPLayer = idPLayer;

        if(this.idPLayer == 0) this.name = "AI";
        else this.name = "Human";

        this.board = new Board();
        this.score = 0;
    }

    public int getIdPLayer() {
        return idPLayer;
    }

    public void setIdPLayer(int idPLayer) {
        this.idPLayer = idPLayer;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
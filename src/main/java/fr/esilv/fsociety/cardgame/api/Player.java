package fr.esilv.fsociety.cardgame.api;

public abstract class Player {

    //idPlayer of AI is 0
    //idPlayer of the Human is 1


    private Board board;
    private int score;

    public Player(int idPLayer) {

        this.board = new Board();
        this.score = 0;
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
}
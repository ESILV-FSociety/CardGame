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


    public String getString() {
        return this.getClass().getSimpleName();
    }

    public boolean isHuman(){
        return this instanceof Human;
    }

    public void updateScore(){
        int [] list = this.getBoard().getKingdom();
        int n = 0;

        for(int i = 0; i < list.length; i++){
            if(list[i] > 1) {
                n++;
            }
            else break;;
            if(n == list.length){
                score += 1;
               // for(int)
            }
        }
    }
}
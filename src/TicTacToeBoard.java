import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.scene.control.Button;
import javafx.stage.Popup;

public class TicTacToeBoard {
    int [][] board;
    int victor;
    boolean player = true;
    boolean winner = false;
    private final BooleanProperty endGame = new SimpleBooleanProperty();


    public TicTacToeBoard(int[][] board) {
        this.board = board;
    }
    public void makeMove( Button button, int[][] board, int i, int j){
        if(player){
            button.setText("X");
            board[i][j] = 1;
            button.setDisable(true);
            player=!player;
        }
        else {
            button.setText("O");
            board[i][j] = 2;
            button.setDisable(true);
            player=!player;
        }

    }
    public void winnerCheck(int [][] board){
        setGameEnded(winner);
        //First Row
        if(board[0][0] == 2 && board[0][1] == 2 && board[0][2] == 2){
            System.out.println("Winner is O");
            winner = true;
            victor = 2;
            setGameEnded(winner);

        }
        //Second Row
        if(board[1][0] == 2 && board[1][1] == 2 && board[1][2] == 2){
            System.out.println("Winner is O");
            winner = true;
            victor = 2;
            setGameEnded(winner);
        }
        //Third Row
        if(board[2][0] == 2 && board[2][1] == 2 && board[2][2] == 2){
            System.out.println("Winner is O");
            winner = true;
            victor = 2;
            setGameEnded(winner);
        }
        //First Column
        if(board[0][0] == 2 && board[1][0] == 2 && board[2][0] == 2){
            System.out.println("Winner is O");
            winner = true;
            victor = 2;
            setGameEnded(winner);
        }
        //Second Row
        if(board[0][1] == 2 && board[1][1] == 2 && board[2][1] == 2){
            System.out.println("Winner is O");
            winner = true;
            victor = 2;
            setGameEnded(winner);
        }
        //Third Row
        if(board[0][2] == 2 && board[1][2] == 2 && board[2][2] == 2){
            System.out.println("Winner is O");
            winner = true;
            victor = 2;
            setGameEnded(winner);
        }
        //Diagonal 0,0 to 2,2
        if(board[0][0] == 2 && board[1][1] == 2 && board[2][2] == 2){
            System.out.println("Winner is O");
            winner = true;
            victor = 2;
            setGameEnded(winner);
        }
        //Diagonal 0,2 to 2,0
        if(board[0][2] == 2 && board[1][1] == 2 && board[2][0] == 2){
            System.out.println("Winner is O");
            winner = true;
            victor = 2;
            setGameEnded(winner);
        }
            //X
        //First Row
        if(board[0][0] == 1 && board[0][1] == 1 && board[0][2] == 1){
            System.out.println("Winner is X");
            winner = true;
            victor = 1;
            setGameEnded(winner);
        }
        //Second Row
        if(board[1][0] == 1 && board[1][1] == 1 && board[1][2] == 1){
            System.out.println("Winner is X");
            winner = true;
            setGameEnded(winner);
            victor = 1;
        }
        //Third Row
        if(board[2][0] == 1 && board[2][1] == 1 && board[2][2] == 1){
            System.out.println("Winner is X");
            winner = true;
            victor = 1;
            setGameEnded(winner);
        }
        //First Column
        if(board[0][0] == 1 && board[1][0] == 1 && board[2][0] == 1){
            System.out.println("Winner is X");
            winner = true;
            victor = 1;
            setGameEnded(winner);
        }
        //Second Column
        if(board[0][1] == 1 && board[1][1] == 1 && board[2][1] == 1){
            System.out.println("Winner is X");
            winner = true;
            victor = 1;
            setGameEnded(winner);
        }
        //Third Column
        if(board[0][2] == 1 && board[1][2] == 1 && board[2][2] == 1){
            System.out.println("Winner is X");
            winner = true;
            victor = 1;
            setGameEnded(winner);
        }
        //Diagonal 0,0 to 2,2
        if(board[0][0] == 1 && board[1][1] == 1 && board[2][2] == 1){
            System.out.println("Winner is X");
            winner = true;
            victor = 1;
            setGameEnded(winner);
        }
        //Diagonal 0,2 to 2,0
        if(board[0][2] == 1 && board[1][1] == 1 && board[2][0] == 1){
            System.out.println("Winner is X");
            winner = true;
            victor = 1;
            setGameEnded(winner);
        }
        if(!winner && isBoardFull()){
            winner=true;
            victor= 0;
        }
    }


    public BooleanProperty endGameProperty() {
        return endGame ;
    }

    public final boolean isEndGame() {
        return endGameProperty().get();
    }

    public final void setGameEnded(boolean endGame) {
        endGameProperty().set(endGame);
    }
    public boolean isBoardFull(){
        boolean full =false;
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j <board.length; j++) {
                if(board[i][j]>0){
                    count++;
                }
            }
        }
        //number of moves made in a game
        if(count==9){
            full= true;
        }
        return full;
    }
}

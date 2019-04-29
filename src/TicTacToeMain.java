import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TicTacToeMain extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        boolean player = true;
        boolean winner = false;
        int [][] board = new int[3][3];
        TicTacToeBoard tttb = new TicTacToeBoard(board);


        Button button = new Button("  ");
        button.setOnAction( event ->{
            tttb.makeMove(button,board,0,0 );
            tttb.winnerCheck(board);
        });
        Button button1 = new Button("  ");
        button1.setOnAction( event ->{
            tttb.makeMove(button1,board,0,1);
            tttb.winnerCheck(board);
        });
        Button button2 = new Button("  ");
        button2.setOnAction( event ->{
            tttb.makeMove(button2,board,0,2 );
            tttb.winnerCheck(board);
        });
        Button button3 = new Button("  ");
        button3.setOnAction( event ->{
            tttb.makeMove(button3,board,1,0 );
            tttb.winnerCheck(board);
        });
        Button button4 = new Button("  ");
        button4.setOnAction( event ->{
            tttb.makeMove(button4,board,1,1 );
            tttb.winnerCheck(board);
        });
        Button button5 = new Button("  ");
        button5.setOnAction( event ->{
            tttb.makeMove(button5,board,1,2 );
            tttb.winnerCheck(board);
        });
        Button button6 = new Button("  ");
        button6.setOnAction( event ->{
            tttb.makeMove(button6,board,2,0 );
            tttb.winnerCheck(board);
        });
        Button button7 = new Button("  ");
        button7.setOnAction( event ->{
            tttb.makeMove(button7,board,2,1);
            tttb.winnerCheck(board);
        });
        Button button8 = new Button("  ");
        button8.setOnAction( event ->{
            tttb.makeMove(button8,board,2,2 );
            tttb.winnerCheck(board);
        });

        tttb.endGameProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue) {
                Label label = new Label("It was a draw");
                if (tttb.victor == 1) {
                    label.setText("Winner is X");
                }
                if (tttb.victor == 2) {
                    label.setText("Winner is O");
                }
                Pane pane = new Pane(label);
                Scene winScene = new Scene(pane);
                primaryStage.setScene(winScene);
                primaryStage.show();
            }
        });


        GridPane gridPane = new GridPane();
        gridPane.addRow(0,button,button1,button2);
        gridPane.addRow(1,button3,button4,button5);
        gridPane.addRow(2,button6,button7,button8);
        gridPane.setAlignment(Pos.CENTER);


        Scene scene = new Scene(gridPane);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}

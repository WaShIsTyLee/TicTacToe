package Controller;

import Model.Board;
import Model.Player;

import static Model.Board.*;
import static View.ViewOfGame.*;

public class MainController {



    public static void startApp() {
        Player player1 = new Player('❌');
        Player player2 = new Player('⭕');
        Board board = new Board();

        int valid3 = 0;
        printWelcome();
        askname(player1, player2);
        board.fillBoard();

        do {
            board.boardFilledByPlayer(askCol(player1), askRow(player1), player1);
            board.showBoard();
            board.boardFilledByPlayer(askCol(player2), askRow(player2), player2);
            board.showBoard();
            valid3++;

        } while (valid3 < 3);

        board.hayGanador(player1);
        board.hayGanador(player2);


    }
}

package Model;

public class Board {


    private boolean round = true;
    private static char[][] board = new char[3][3];
    private static char clean = '-';

    public Board() {
    }

    public char getClean() {
        return clean;
    }

    public void setClean(char clean) {
        this.clean = clean;
    }

    public void fillBoard() {

        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board.length; j++) {
                board[i][j] = clean;

                System.out.print(board[i][j] + " ");

            }
            System.out.println();

        }
    }

    public void showBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void boardFilledByPlayer(int col, int row, Player player) {

        if (board[col][row] == clean) ;
        board[col][row] = player.getMark();
    }




    public void hayGanador(Player player) {
        boolean ganador = false;
        // Verificar filas y columnas
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player.getMark() && board[i][1] == player.getMark() && board[i][2] == player.getMark()) ||
                    (board[0][i] == player.getMark() && board[1][i] == player.getMark() && board[2][i] == player.getMark())) {
                ganador = true;
            }
        }

        // Verificar diagonales
        if (!ganador) {
            ganador = (board[0][0] == player.getMark() && board[1][1] == player.getMark() && board[2][2] == player.getMark()) ||
                    (board[0][2] == player.getMark() && board[1][1] == player.getMark() && board[2][0] == player.getMark());
        }

        if (ganador) {
            System.out.println("El ganador es " + player.getName());
        } else {
            System.out.println(player.getName()+"No ha ganado");
        }
    }
}


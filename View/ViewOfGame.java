package View;

import Model.Board;
import Model.Player;

import java.util.Scanner;

public class ViewOfGame {
    public static void printWelcome() {
        System.out.println("Bienvenido al Tic Tac Toe de Juan Jesus");
        System.out.println("Reglas: Por turnos elegiras en que casilla colacaras tu simbolo, el primero en unir 3 simbolos gana");

    }

    public static void askname(Player player1, Player player2) {
        System.out.println("Deme el nombre del jugador 1");
        player1.setName(keyboardString());
        System.out.println("Deme el nombre del jugador 2");
        player2.setName(keyboardString());


    }


    public static int askRow(Player player) {
        int row = 0;
        System.out.println( player.getName() + " por favor deme la columna donde colocará su ficha [1, 2 o 3]");
        row = keyboardInt();

        return row-1;

    }

    public static int askCol(Player player) {
        int col = 0;
        System.out.println( player.getName() + " por favor deme la fila donde colocará su ficha [1, 2 o 3]");
        col = keyboardInt();

        return col-1;
    }


    public static String keyboardString() {

        Scanner teclado = new Scanner(System.in);
        String keyboard = teclado.nextLine();
        return keyboard;
    }

    public static int keyboardInt() {

        Scanner teclado = new Scanner(System.in);
        int keyboard = teclado.nextInt();
        return keyboard;
    }




}









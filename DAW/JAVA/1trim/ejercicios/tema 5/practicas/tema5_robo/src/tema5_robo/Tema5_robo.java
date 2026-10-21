package tema5_robo;

import java.util.Scanner;

public class Tema5_robo {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
     // posiciones iniciales
        int samX = 0, samY = 0;
        int exitX = 7, exitY = 7;
        char[][] board = new char[8][8];

        // llenar tablero con '.'
        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
                board[x][y] = '.';
            }
        }

        // colocar práctica en celda vacía
        int posX, posY;
        do {
            posX = (int) (Math.random() * 8);
            posY = (int) (Math.random() * 8);
        } while (posX == samX && posY == samY);
        board[posX][posY] = 'P';

        // booleans
        boolean cogerPractica = false;
        boolean won = false;

        while (true) {
            // limpiar tablero
            for (int x = 0; x < board.length; x++) {
                for (int y = 0; y < board[x].length; y++) {
                    board[x][y] = '.';
                }
            }

            // colocar elementos
            board[samX][samY] = 'S';
            if (!cogerPractica) board[posX][posY] = 'P';
            board[exitX][exitY] = 'E';

            // mostrar tablero
            for (int x = 0; x < board.length; x++) {
                for (int y = 0; y < board[x].length; y++) {
                    System.out.print(board[x][y] + " ");
                }
                System.out.println();
            }

            // recoger práctica
            if (samX == posX && samY == posY && !cogerPractica) {
                cogerPractica = true;
                System.out.println("Has recogido la práctica 📄");
            }

            // victoria
            if (samX == exitX && samY == exitY && cogerPractica && !won) {
                System.out.println("¡Has escapado con la práctica! 🎉");
                won = true; // mensaje solo una vez
            }

            // pedir movimiento
            System.out.println("*******Movimiento (WASD)*********");
            char move = consola.next().toUpperCase().charAt(0);

            if (move == 'W' && samX > 0) {
                samX--;
            } else if (move == 'S' && samX < 7) {
                samX++;
            } else if (move == 'A' && samY > 0) {
                samY--;
            } else if (move == 'D' && samY < 7) {
                samY++;
            } else {
                System.out.println("Movimiento no es válido");
            }
        }
    }
}
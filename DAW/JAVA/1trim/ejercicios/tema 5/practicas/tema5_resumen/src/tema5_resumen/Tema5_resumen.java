package tema5_resumen;

import java.util.Scanner;

public class Tema5_resumen {

    public static void main(String[] args) {

        /**
         * SUPER RESUMEN PARA EXAMEN – TEMA MATRICES (2D ARRAYS)
         *
         * Contiene: ✔ Declaración ✔ Creación ✔ Acceso ✔ Recorridos ✔ Búsqueda ✔
         * Máximo, mínimo ✔ Matrices aleatorias ✔ Matriz identidad ✔ Suma de
         * matrices ✔ Transponer matrices ✔ Ejercicios típicos de examen
         *
         * TODO con explicaciones detalladas en comentarios.
         */
        Scanner consola = new Scanner(System.in);

        // ============================================================
        // 1️⃣ DECLARACIÓN Y CREACIÓN DE MATRICES
        // ============================================================
        // Matriz con valores iniciales
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Matriz vacía de 3x4 (3 filas, 4 columnas)
        int[][] tabla = new int[3][4]; // Todo empieza en 0

        // Tamaño: filas = .length, columnas = .length
        System.out.println("Filas: " + tabla.length);
        System.out.println("Columnas: " + tabla[0].length);

        // ============================================================
        // 2️⃣ ACCESO Y MODIFICACIÓN DE ELEMENTOS
        // ============================================================
        System.out.println("Elemento [0][0]: " + matriz[0][0]);
        matriz[1][2] = 99; // Modificar celda
        System.out.println("Nuevo valor en [1][2]: " + matriz[1][2]);

        // ============================================================
        // 3️⃣ RECORRIDOS DE MATRICES
        // ============================================================
        System.out.println("--- For clásico filas / columnas-- - ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }


        // ============================================================
        // 4️⃣ RELLENAR MATRIZ DESDE USUARIO
        // ============================================================
        int[][] userMat = new int[2][3];
        System.out.println("Introduce 6 valores para una matriz 2x3:");
        for (int i = 0; i < userMat.length; i++) {
            for (int j = 0; j < userMat[i].length; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                userMat[i][j] = consola.nextInt();
            }
        }

        // ============================================================
        // 5️⃣ MATRIZ ALEATORIA
        // ============================================================
        int[][] ale = new int[4][5];
        System.out.println("Matriz aleatoria 4x5(1–9):");
        for (int i = 0; i < ale.length; i++) {
            for (int j = 0; j < ale[i].length; j++) {
                ale[i][j] = (int) (Math.random() * 9) + 1;
                System.out.print(ale[i][j] + " ");
            }
            System.out.println();
        }

        // ============================================================
        // 6️⃣ BUSCAR UN NÚMERO EN UNA MATRIZ
        // ============================================================
        System.out.println("Número a buscar en la matriz aleatoria:");
        int buscado = consola.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < ale.length; i++) {
            for (int j = 0; j < ale[i].length; j++) {
                if (ale[i][j] == buscado) {
                    System.out.println("Encontrado en [" + i + "][" + j + "]");
                    encontrado = true;
                }
            }
        }
        if (!encontrado) {
            System.out.println("No encontrado");
        }

        // ============================================================
        // 7️⃣ BUSCAR MAYOR Y MENOR
        // ============================================================
        int mayor = ale[0][0];
        int menor = ale[0][0];

        for (int[] fila : ale) {
            for (int v : fila) {
                if (v > mayor) {
                    mayor = v;
                }
                if (v < menor) {
                    menor = v;
                }
            }
        }

        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);

        // ============================================================
        // 8️⃣ MATRIZ IDENTIDAD
        // ============================================================
        int[][] identidad = new int[4][4];
        System.out.println("Matriz identidad 4x4:");
        for (int i = 0; i < identidad.length; i++) {
            for (int j = 0; j < identidad[i].length; j++) {
                if (i == j) {
                    identidad[i][j] = 1;
                }
                System.out.print(identidad[i][j] + " ");
            }
            System.out.println();
        }

        // ============================================================
        // 9️⃣ SUMA DE MATRICES
        // ============================================================
        int[][] A = {{1, 2, 3}, {4, 5, 6}};
        int[][] B = {{7, 8, 9}, {1, 2, 3}};
        int[][] S = new int[2][3];

        System.out.println("Suma de matrices A + B:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                S[i][j] = A[i][j] + B[i][j];
                System.out.print(S[i][j] + " ");
            }
            System.out.println();
        }

        // ============================================================
        // 1️⃣0️⃣ TRANSPONER MATRIZ
        // ============================================================
        int[][] T = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                T[j][i] = matriz[i][j];
            }
        }

        System.out.println("Matriz transpuesta :");
        for (int[] fila : T) {
            for (int v : fila) {
                System.out.print(v + " ");
            }
            System.out.println();
        }

        // ============================================================
        // 1️⃣1️⃣ EJERCICIO TÍPICO: MOSTRAR FILA Y COLUMNA INDICADAS
        // ============================================================
        System.out.println("Introduce fila (0–2): ");
        int f = consola.nextInt();

        System.out.println("Introduce columna (0–2): ");
        int c = consola.nextInt();

        System.out.println("Valor en matriz[" + f + "][" + c + "]: " + matriz[f][c]);
    }
}

// ==================== EJERCICIOS EXTRA AÑADIDOS ====================
// (Copiados del código enviado por el usuario y añadidos al resumen)
class Ejercicios_Matrices_Completos {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        // Ejercicio 60
        int[][] matriz = new int[5][5];
        int cont = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int k = 0; k < matriz[i].length; k++) {
                cont++;
                matriz[i][k] = cont;
            }
        }

        // Ejercicio 61
        int[][] matriz2 = new int[10][10];
        for (int i = 0; i < matriz2.length; i++) {
            for (int k = 0; k < matriz2[i].length; k++) {
                matriz2[i][k] = (i + 1) * (k + 1);
            }
        }

        // Ejercicio 62
        System.out.println("Tamaño filas:");
        int n = consola.nextInt();
        System.out.println("Tamaño columnas:");
        int m = consola.nextInt();

        int[][] matriz3 = new int[n][m];
        for (int i = 0; i < matriz3.length; i++) {
            for (int k = 0; k < matriz3[i].length; k++) {
                System.out.print("Elemento [" + i + "][" + k + "]: ");
                matriz3[i][k] = consola.nextInt();
            }
        }

        int mayor = 0, menor = 0, cero = 0;
        for (int i = 0; i < matriz3.length; i++) {
            for (int k = 0; k < matriz3[i].length; k++) {
                if (matriz3[i][k] > 0) {
                    mayor++;
                } else if (matriz3[i][k] < 0) {
                    menor++;
                } else {
                    cero++;
                }
            }
        }

        // Ejercicio 63
        int[][] matriz4 = {
            {3, 4, 9},
            {4, 2, 7},
            {1, 2, 5}
        };

        int maximo = matriz4[0][0];
        for (int i = 0; i < matriz4.length; i++) {
            for (int k = 0; k < matriz4[i].length; k++) {
                if (matriz4[i][k] > maximo) {
                    maximo = matriz4[i][k];
                }
            }
        }

        // Ejercicio 64
        System.out.print("Tamaño matriz cuadrada M: ");
        int M = consola.nextInt();
        int[][] matriz5 = new int[M][M];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                matriz5[i][j] = consola.nextInt();
            }
        }

        int mayor5 = matriz5[0][0];
        int suma5 = 0;
        for (int i = 0; i < M; i++) {
            int v = matriz5[i][i];
            suma5 += v;
            if (v > mayor5) {
                mayor5 = v;
            }
        }

        // Ejercicio 65
        int[][] matriz6 = {
            {1, 2, 3},
            {2, 5, 6},
            {3, 6, 9}
        };

        boolean simetrica = true;
        for (int i = 0; i < matriz6.length; i++) {
            for (int j = 0; j < matriz6.length; j++) {
                if (matriz6[i][j] != matriz6[j][i]) {
                    simetrica = false;
                }
            }
        }

        // Ejercicio 66 (Piedra Papel Tijeras en matriz)
        int[][] matrizResultado = {
            {0, -1, 1},
            {1, 0, -1},
            {-1, 1, 0}
        };

        String[] opciones = {"Piedra", "Papel", "Tijeras"};

        // Ejercicio Minion formateo
        int[][] minion = {{2, 3, 12}, {11, 11, 1}, {5, 15, 4}};
        String[][] minion2 = new String[minion.length][minion[0].length];
        for (int i = 0; i < minion.length; i++) {
            for (int j = 0; j < minion[i].length; j++) {
                int num = minion[i][j];
                if (num < 10) {
                    minion2[i][j] = "0" + num;
                } else {
                    minion2[i][j] = "" + num;
                }
            }
        }

// ==================== EJERCICIO ROBO AÑADIDO ====================
// Juego de movimiento en matriz 8x8 con recogida de objeto y salida.
        int samX = 0, samY = 0;
        int exitX = 7, exitY = 7;
        char[][] board = new char[8][8];

        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
                board[x][y] = '.';
            }
        }

        int posX, posY;
        do {
            posX = (int) (Math.random() * 8);
            posY = (int) (Math.random() * 8);
        } while (posX == samX && posY == samY);
        board[posX][posY] = 'P';

        boolean cogerPractica = false;
        boolean won = false;

        while (true) {
            for (int x = 0; x < board.length; x++) {
                for (int y = 0; y < board[x].length; y++) {
                    board[x][y] = '.';
                }
            }

            board[samX][samY] = 'S';
            if (!cogerPractica) {
                board[posX][posY] = 'P';
            }
            board[exitX][exitY] = 'E';

            for (int x = 0; x < board.length; x++) {
                for (int y = 0; y < board[x].length; y++) {
                    System.out.print(board[x][y] + " ");
                }
                System.out.println();
            }

            if (samX == posX && samY == posY && !cogerPractica) {
                cogerPractica = true;
                System.out.println("Has recogido la práctica 📄");
            }

            if (samX == exitX && samY == exitY && cogerPractica && !won) {
                System.out.println("¡Has escapado con la práctica! 🎉");
                won = true;
            }

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

// EJEMPLO – Explicación del profesor (matrices básicas)
// Archivo: Tema5_matrices.java
        // Matriz 5x3 rellena de 1
        int [][] hipo0;
        hipo0 = new int[5][3];
        for (int i = 0; i < hipo0.length; i++) {
            System.out.println("");
            for (int k = 0; k < hipo0[i].length; k++) {
                hipo0[i][k] = 1;
                System.out.print(hipo0[i][k] + "  ");
            }
        }
        System.out.println(hipo0);

        System.out.println("*******ejemplo1******");

        // Ejemplo 1: Matriz 3x3 con validación de números positivos
        int[][] matriz0 = new int[3][3];
        System.out.println("Dame los valores para una matriz 3x3 solo numeros positivos ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int valor0;
                do {
                    System.out.print("Elemento [" + i + "][" + j + "]: ");
                    valor0 = consola.nextInt();
                    if (valor0 < 0) {
                        System.out.println("No se permiten numeros negativos intenta de nuevo");
                    }
                } while (valor0 < 0);
                matriz0[i][j] = valor0;
            }
        }

        System.out.println("Matriz introducida:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz0[i][j] + "	");
            }
            System.out.println();
        }

        // Pedir número positivo para matriz identidad
        int n0;
        do {
            System.out.print("Dame un num positivo para crear una matriz identidad NxN: ");
            n = consola.nextInt();
            if (n <= 0) {
                System.out.println("Debe ser un numero positivo. Intenta de nuevo.");
            }
        } while (n <= 0);

        int[][] identidad = new int[n][n];
        for (int i = 0; i < n; i++) {
            identidad[i][i] = 1;
        }

        System.out.println("Matriz identidad de tamaño " + n + "x " + n + ":");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(identidad[i][j] + "	");
            }
            System.out.println();
        }

        System.out.println("*******ejemplo2******");

        // Ejemplo 2: Matriz de booleanos con luces aleatorias
        boolean[][] luces = new boolean[8][8];
        for (int i = 0; i < luces.length; i++) {
            for (int k = 0; k < luces[i].length; k++) {
                int ale = (int) (Math.random() * 2);
                luces[i][k] = ale == 1;
            }
        }

        System.out.println("si hay false pinto un  .  /  si hay true pinto un  *");
        for (int i = 0; i < luces.length; i++) {
            for (int k = 0; k < luces[i].length; k++) {
                if (luces[i][k]) {
                    System.out.print("* ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}

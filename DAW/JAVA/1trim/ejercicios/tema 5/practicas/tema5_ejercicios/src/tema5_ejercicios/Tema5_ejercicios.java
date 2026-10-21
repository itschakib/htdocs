package tema5_ejercicios;

import java.util.Scanner;

public class Tema5_ejercicios {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("*******ejercicio60********");
        int[][] matriz = new int[5][5];
        int contenador = 0;
        for (int i = 0; i > matriz.length; i++) {
            for (int k = 0; k < matriz[i].length; k++) {
                contenador++;
                matriz[i][k] = contenador;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int k = 0; k < matriz[i].length; k++) {
                System.out.print(matriz[i][k] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("*******ejercicio61********");
        int[][] matriz2 = new int[10][10];
        for (int i = 0; i < matriz2.length; i++) {
            for (int k = 0; k < matriz2[i].length; k++) {
                matriz2[i][k] = (i + 1) * (k + 1);
            }
        }
        //monstramos los datos 
        System.out.println("MATRIZ DE LAS TABLAS ");
        for (int i = 0; i < matriz2.length; i++) {
            for (int k = 0; k < matriz2[i].length; k++) {
                System.out.print(matriz2[i][k] + "\t");
            }
            System.out.println();
        }

        System.out.println("*******ejercicio62********");

//entramos el tamaño del matriz
        System.out.println("dame tamano de filas por matriz");
        int n = consola.nextInt();
        System.out.println("dame tamano de colomnas por matriz");
        int m = consola.nextInt();

        int[][] matriz3 = new int[n][m];
        //  entramos los valores
        for (int i = 0; i < matriz3.length; i++) {
            for (int k = 0; k < matriz3[i].length; k++) {
                System.out.print("Elemnto [" + i + "][" + k + "] :");
                matriz3[i][k] = consola.nextInt();
            }
        }
//contanedor 
        int mayor = 0;
        int menor = 0;
        int cero = 0;

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
        System.out.println("resultados: ");
        System.out.println("Mayores : " + mayor);
        System.out.println("Menores : " + menor);
        System.out.println("cero : " + cero);

        System.out.println("*******ejercicio63********");
        int[][] matriz4 = {
            {3, 4, 9},
            {4, 2, 7},
            {1, 2, 5}
        };
        //encontrar el valor mayor 
        int maximo = matriz4[0][0];
        for (int i = 0; i < matriz4.length; i++) {
            for (int k = 0; k < matriz4[i].length; k++) {
                if (matriz4[i][k] > maximo) {
                    maximo = matriz4[i][k];
                }
            }
        }
        System.out.println("El valor maximo es :" + maximo);
        //monstrar la posicion del 1 mayor
        boolean encontrado = false;
        for (int i = 0; i < matriz4.length; i++) {
            for (int k = 0; k < matriz4[i].length; k++) {
                if (matriz4[i][k] == maximo && !encontrado) {
                    System.out.println("Primer aparicion en " + i + ", " + k);
                    encontrado = true;
                }
            }
        }
        //monstrar las posicion de todos las posiciones
        for (int i = 0; i < matriz4.length; i++) {
            for (int k = 0; k < matriz4[i].length; k++) {
                if (matriz4[i][k] == maximo) {
                    System.out.println("Aparicion en " + i + ", " + k);
                }
            }
        }

        System.out.println("*******ejercicio64********");

        System.out.print("Dame el tamano de la matriz (M): ");
        int M = consola.nextInt();
        int[][] matriz5 = new int[M][M];

        System.out.println("Introduce los elementos de la matriz:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz5[i][j] = consola.nextInt();
            }
        }

        // 3. Procesar la diagonal principal
        int mayor5 = matriz5[0][0];
        int suma5 = 0;

        for (int i = 0; i < M; i++) {
            int valor5 = matriz5[i][i];  // elemento de la diagonal principal
            suma5 += valor5;
            if (valor5 > mayor5) {
                mayor5 = valor5;
            }
        }

        double media5 = (double) suma5 / M;

        System.out.println("\nResultados:");
        System.out.println("Mayor elemento de la diagonal principal: " + mayor5);
        System.out.println("Media de los valores de la diagonal principal: " + media5);

        System.out.println("*******ejercicio65********");
        int[][] matriz6 = {
            {1, 2, 3},
            {2, 5, 6},
            {3, 6, 9}
        };

        int M2 = matriz6.length;
        boolean simetrica6 = true;

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                if (matriz6[i][j] != matriz6[j][i]) {
                    simetrica6 = false;
                }
            }
        }

        if (simetrica6) {
            System.out.println("La matriz es simétrica perfecta.");
        } else {
            System.out.println("La matriz NO es simétrica perfecta.");
        }

        System.out.println("*******ejercicio66********");
        // 0 = Empate, 1 = gana fila, -1 = gana columna
        int[][] matrizResultado = {
            {0, -1, 1}, // Piedra vs Piedra/Papel/Tijeras
            {1, 0, -1}, // Papel vs Piedra/Papel/Tijeras
            {-1, 1, 0} // Tijeras vs Piedra/Papel/Tijeras
        };

        String[] opciones = {"Piedra", "Papel", "Tijeras"};

        // Pedir elecciones a los jugadores
        System.out.println("Jugador 1, elige: 0-Piedra, 1-Papel, 2-Tijeras");
        int jugador1 = consola.nextInt();

        System.out.println("Jugador 2, elige: 0-Piedra, 1-Papel, 2-Tijeras");
        int jugador2 = consola.nextInt();

        System.out.println("Jugador 1 eligió: " + opciones[jugador1]);
        System.out.println("Jugador 2 eligió: " + opciones[jugador2]);

        // Determinar el resultado usando la matriz
        int resultado = matrizResultado[jugador1][jugador2];

        if (resultado == 0) {
            System.out.println("Empate");
        } else if (resultado == 1) {
            System.out.println("Gana el Jugador 1");
        } else {
            System.out.println("Gana el Jugador 2");
        }

        System.out.println("******ejemplo*******");
        int[][] minion = {{2, 3, 12},
        {11, 11, 1},
        {5, 15, 4}};
        String[][] minion2 = new String[minion.length][minion[0].length];
        for (int i = 0; i < minion.length; i++) {
            for (int k = 0; k < minion[i].length; k++) {
                /*
                if (minion[i][k]>= 0 && minion[i][k] < 10) {
                    res += "0";
                }
                res += minion[i][k];
            }
                 */
                int num = minion[i][k];
                if (num < 10) {
                    minion2[i][k] = "0" + num;
                } else {
                    minion2[i][k] = "" + num;
                }
            }
        }
        for (int i = 0; i < minion2.length; i++) {
            for (int k = 0; k < minion2[i].length; k++) {
                System.out.print(minion2[i][k] + " ");
            }
            System.out.println();
        }
    }
}


package tema5_matrices;

import java.util.Scanner;

public class Tema5_matrices {

    public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);
        
        int[][] hipo = new int[5][3];
        for (int i = 0; i < hipo.length; i++) {
            System.out.println("");
            for (int k = 0; k < hipo[i].length; k++) {
                hipo[i][k] = 1;
                System.out.print(hipo[i][k]);
                System.out.print("  ");
            }
        }

        System.out.println("*******ejemplo1******");
//1 matriz 3*3
//A_rellenado con  los numeros que meta el usuariuo +
//b_IMPIDE QUE EL USUARIO META numeros negativos(vuelve a pedir en caso de fallo)
//2_pide un numero positivo (vuelve a pedir si no)
//crea una matriz NxN que sea matriz indentidad 
// ej:      3   x    3              4      x      4
//           1     0    1           1      0      0      0
//           0    1    0          0      1       0      0
//           0    0    1           0     0       1      0
//                                   0     0      0       1

//crear y rellenar una matriz 3 x 3 crear y rellenar una matriz 3 x 3
        int[][] matriz = new int[3][3];
        System.out.println("\n Dame  los valores para una matriz 3x3 solo numeros positivos ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int valor;
                do {
                    System.out.print("Elemento [" + i + "][" + j + "]: ");
                    valor = consola.nextInt();
                    if (valor < 0) {
                        System.out.println("No se permiten numeros negativos intenta de nuevo");
                    }
                } while (valor < 0);
                matriz[i][j] = valor;
            }
        }

// Mostrar la matriz introducida
        System.out.println("\n Matriz introducida:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

//pedir un numero positivo N
        int n;
        do {
            System.out.print("\nDame un num  positivo para crear una matriz identidad NxN: ");
            n = consola.nextInt();
            if (n <= 0) {
                System.out.println("Debe ser un numero positivo. Intenta de nuevo.");
            }
        } while (n <= 0);

//crear la matriz identidad n x n
        int[][] identidad = new int[n][n];
        for (int i = 0; i < n; i++) {
            identidad[i][i] = 1;
        }

// Mostrar la matriz identidad
        System.out.println("\nMatriz identidad de tamaño " + n + "x" + n + ":");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(identidad[i][j] + "\t");
            }
            System.out.println();
        }
         
        System.out.println("*******ejemplo2******");
        boolean[][] luces = new boolean[8][8];
        for (int i = 0; i < luces.length; i++) {
            for (int k = 0; k < luces[i].length; k++) {
                int ale = (int) (Math.random() * 2);
                luces[i][k] = false;
                if (ale == 1) {
                    luces[i][k] = true;
                }
            }
        }

        System.out.println("si hay flse pinto un  .  /  si hay true pinto un  *");
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

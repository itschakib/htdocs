package excepcion0;

import java.util.InputMismatchException;
import java.util.Scanner;

public class excepcion0 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] lista;
        int suma = 0;

        try {
            System.out.print("Introduce tamaño (positivo): ");
            int tam = entrada.nextInt();

            if (tam <= 0) {
                throw new IllegalArgumentException("El tamaño debe ser positivo");
            }

            lista = new int[tam];

            // Rellenar array con valores aleatorios (0,1,2)
            for (int i = 0; i < lista.length; i++) {
                lista[i] = (int)(Math.random() * 3);
            }

            // Calcular suma con control de división por 0
            for (int i = 1; i < lista.length; i++) {
                try {
                    suma += lista[i] / lista[i - 1];
                } catch (ArithmeticException e) {
                    System.out.println("División por 0 en posición " + (i - 1));
                }
            }

            System.out.println("Suma: " + suma);

        } catch (InputMismatchException e) {
            System.out.println("Error: debes introducir un número entero");

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            entrada.close();
            System.out.println("Programa finalizado");
        }
    }
}
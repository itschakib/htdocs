package tema4_resumen;

import java.util.Scanner;

public class Tema4_resumen {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);
/*
        // =============================
        // 1️⃣ Declaración y creación de arrays
        // =============================
        int[] numeros = {5, 6, 1, 3, 7, 23}; // array con valores iniciales
        int[] lista = new int[5];           // array vacío con tamaño fijo 5

        // =============================
        // 2️⃣ Acceso a elementos
        // =============================
        System.out.println("Primer elemento de numeros: " + numeros[0]); // 5
        numeros[2] = 50; // cambiamos el valor en la posición 2
        System.out.println("Ahora el tercer elemento es: " + numeros[2]); // 50

        // =============================
        // 3️⃣ Recorrer un array con todos los bucles
        // =============================
        System.out.println("\n--- Recorrido con for clásico ---");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println("\n--- Recorrido con while ---");
        int i = 0;
        while (i < numeros.length) {
            System.out.println(numeros[i]);
            i++;
        }

        System.out.println("\n--- Recorrido con do-while ---");
        i = 0;
        do {
            System.out.println(numeros[i]);
            i++;
        } while (i < numeros.length);

        System.out.println("\n--- Recorrido con for-each ---");
        for (int n : numeros) {
            System.out.println(n);
        }
*/
  int[] numeros = {5, 6, 1, 3, 7, 23}; // array con valores iniciales
        int[] lista = new int[5];           // array vacío con tamaño fijo 5
        // =============================
        // 4️⃣ Búsqueda de un número en el array
        // =============================
        System.out.println("\nDime un número a buscar:");
        int num = consola.nextInt();

        // ---- Solución 1: condición en while ----
      int  i = 0;
        // ➤ length-1 explicado: el índice máximo es length-1 porque los arrays empiezan en 0
        // Por ejemplo, un array de 6 elementos tiene índices 0,1,2,3,4,5 → 6-1 = 5
        while (i <= numeros.length - 1 && numeros[i] != num) {
            i++;
        }

        if (i <= numeros.length - 1) {
            System.out.println("Solución 1: Encontrado en posición " + i);
        } else {
            System.out.println("Solución 1: NO encontrado");
        }

        // ---- Solución 2: uso de break ----
        i = 0;
        boolean encontrado = false;
        while (i < numeros.length) {
            if (numeros[i] == num) {
                encontrado = true;
                break; // fuerza salir del bucle
            }
            i++;
        }

        if (encontrado) {
            System.out.println("Solución 2: Encontrado en posición " + i);
        } else {
            System.out.println("Solución 2: NO encontrado");
        }

    }

}

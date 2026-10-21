package tema4_ejercicios;

import java.util.Scanner;

public class Tema4_ejercicios {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
/*
        System.out.println("********ejericico48*********");
        int[] lista = new int[10];

        lista[0] = 6;
        lista[1] = 3;
        lista[2] = 9;
        lista[3] = 7;
        lista[4] = 5;
        lista[5] = 8;
        lista[6] = 10;
        lista[7] = 2;
        lista[8] = 4;
        lista[9] = 5;
// la media
        int suma = 0;
        for (int i = 0; i < lista.length; i++) {
            suma += lista[i];
        }
        double media = suma / lista.length;
        System.out.println(media);

        System.out.println("********ejericico51*********");
        //creamos 100 elemntow
        int[] lista2 = new int[100];
        for (int i = 0; i < lista2.length; i++) {
            lista2[i] = (int) (Math.random() * (100 - 1 + 1)) + 1;
            System.out.print(lista2[i] + ", ");
        }
        //A 
        System.out.println("\nmultiplos de 5");
        for (int i = 0; i < lista2.length; i++) {
            if (lista2[i] % 5 == 0) {
                System.out.print(lista2[i] + " , ");
            }
        }
        //B
        System.out.println("\nnumeros pares");
        for (int i = 0; i < lista2.length; i++) {
            if (lista2[i] % 2 == 0) {
                System.out.print(lista2[i] + ", ");
            }
        }
        //C
        System.out.println("\nmostrar el mayor numero y su posicion");
        int mayor = lista2[0];
        int posicion = 0;

        for (int i = 1; i < lista2.length; i++) {
            if (lista2[i] > mayor) {
                mayor = lista2[i];
                posicion = i;//guardamos la posicion del mayor aqui y aqui si hay varios iguales monstramos el primero
            }
        }
        System.out.println("\nMayor num: " + mayor + "en la posicion " + posicion);

        System.out.println("********ejericico52*********");
        //creamos el array de colors
        String[] lista3 = new String[10];
        for (int i = 0; i < lista3.length; i++) {
            System.out.println("dame un color por  el posicion " + i);
            lista3[i] = consola.next();
        }
        //
        int x = 0;
        int y = 0;
        for (int i = 0; i < lista3.length; i++) {
            if (lista3[i].equalsIgnoreCase("rojo")) {
                x++;
            } else if (lista3[i].equalsIgnoreCase("azul")) {
                y++;
            }
        }
        System.out.println("el color 'rojo'  aparece " + x + " veces en el array");
        System.out.println("el color 'azul'  aparece " + y + " veces en el array");

        System.out.println("********ejericico53*********");
//creamos  las dos arrays
        System.out.println("dame el tamano de los arrays");
        int tamano = consola.nextInt();

        int[] array1 = new int[tamano];
        int[] array2 = new int[tamano];
//A-entramos los elemetnos del primer array
        System.out.println("Array 1");
        for (int i = 0; i < tamano; i++) {
            System.out.println("Elemento " + i);
            array1[i] = consola.nextInt();
        }

//B-entramos los elemetnos del segundo array
        System.out.println("Array 2");
        for (int i = 0; i < tamano; i++) {
            System.out.println("Elemento " + i);
            array2[i] = consola.nextInt();
        }

        //C- ahora vamos a hacer comparacion
        boolean iguales = true;
        for (int i = 0; i < tamano; i++) {
            if (array1[i] != array2[i]) {
                iguales = false;
            }
        }
        if (iguales) {
            System.out.println("los arrays son eguales");
        } else {
            System.out.println("Los arrays no son iguales");
        }

        System.out.println("********ejericico54*********");
        int[] valores = {2, 4, 6, 8, 1, 3, 5, 7};
        int[] otro = new int[valores.length + 2];

        int j = 0; // eso es indice para el 1 array y para recorrer 'valores'

        for (int i = 0; i < otro.length; i++) {
            if (i == 3) {
                otro[i] = 200;//insertamos 200 en posicion 4
            } else if (i == 6) {
                otro[i] = 300;
            } else {
                otro[i] = valores[j];
                j++;
            }
        }
        //monstramos resultados
        System.out.println("Otra:");
        for (int i = 0; i < otro.length; i++) {
            System.out.print(otro[i] + " ");
        }

        System.out.println("********ejericico56*********");
//creamos el array 
        int[] programa = new int[10];
//entramos elementos a el array
        for (int i = 0; i < programa.length; i++) {
            System.out.println("Elemento " + i);
            programa[i] = consola.nextInt();
        }

        for (int i = 0; i < programa.length; i++) {
            System.out.print(programa[i] + ", ");
        }
//monstramos el mayor numero y su posicion cuantos veces parece
        int mayormaximo = programa[0];
        for (int i = 1; i < programa.length; i++) {
            if (programa[i] > mayormaximo) {
                mayormaximo = programa[i];
            }
        }
// Contamos cuantos veces aparece y su posiciones
        int veces = 0;
        String posiciones = "";
        for (int i = 0; i < programa.length; i++) {
            if (programa[i] == mayormaximo) {
                veces++;
                posiciones += i + ", "; // las posicion empezando desde 0
            }
        }
//las resultados
        System.out.println("\nEl valor maximo es el " + mayormaximo);
        System.out.println("Aparece " + veces + " veces en las posiciones " + posiciones);

        System.out.println("********ejericiciosjaime 1*********");
        //dado un array de numeros enteros calcula la difernecia entre el mayor y el menor 8 y lo muestras ) 
//creamos el array  y entramos elemntos a el array 
        int[] array01 = {44, 86, 32, 19};
//calculamos la difirencia entre el mayor y el menor (y lo muestros)
        int mayor1 = array01[0];
        int menor1 = array01[0];
        for (int i = 0; i < array01.length; i++) {
            if (array01[i] > mayor1) {
                mayor1 = array01[i];
            }
            if (array01[i] < menor1) {
                menor1 = array01[i];
            }
        }
        int diferencia = mayor1 - menor1;
        System.out.println("la diferencia es :" + diferencia + "( " + mayor1 + " - " + menor1 + " )");

        System.out.println("********ejericicios jaime 2*********");
        //dado un array de enteros llamado "pepe" devder otro array que solo tenga los numeros pares de "pepe" 
        //y lo muestras en horizental , separado para comas 

//creamos el array de pepe 
        int[] pepe = new int[6];
        System.out.println("***PEPE***");
        for (int i = 0; i < pepe.length; i++) {
            System.out.println("Elemento " + i);
            pepe[i] = consola.nextInt();
        }

//creamos el array de pares 
        int[] pepepares = new int[pepe.length];
        int pares = 0;
        System.out.println("\nArray pares");
        for (int i = 0; i < pepe.length; i++) {
            if (pepe[i] % 2 == 0) {
                pepepares[pares] = pepe[i];
                pares++;
            }
        }
        //monstramos solo los valores pares del array
        for (int i = 0; i < pares; i++) {
            System.out.print(pepepares[i]);
            if (i < pares - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("********ejericicios jaime 3*********");
//dado un array de numeros enteros decir  siese array es especial o no un array es sespecial si todods los cajones
//imparestiene un numeros impares y en todos los cajones pares , tienes numeros pares (0 es par!!) 

//creamos los arrays 
        int[] ar1 = new int[6];
        for (int i = 0; i < ar1.length; i++) {
            System.out.println("Elemento " + i);
            ar1[i] = consola.nextInt();
        }

        int cumpleCondicion = 0; // cuantos posiciones cumplen la condicion 

        for (int i = 0; i < ar1.length; i++) {
            if (i % 2 == 0 && ar1[i] % 2 == 0) {
                System.out.println("Posicion " + i + " es par y numero " + ar1[i] + " es par");
               cumpleCondicion++;
            } else if (i % 2 != 0 && ar1[i] % 2 != 0) {
                System.out.println("Posicion " + i + " es impar y numero " + ar1[i] + " es impar");
              cumpleCondicion++;
            } else {
                System.out.println("Posicion " + i + " no cumple la condicion");
            }
        }

        if (cumpleCondicion== ar1.length) {
            System.out.println("el array es especial");
        } else {
            System.out.println("el array no es especial");
        }
*/
        System.out.println("********ejericicios jaime 4*********");

        //pide numero al usuario --> tam mayor a 0 y si no se vuelve a pedir 
        //crea un array de tamaño 'tam'
        //rellena el array con numeros aleatorios entre 2 y 12 
        // pide un numero entre 0 y tam al usuario   ---->        si no es correcto
        //pide otro numero entre 0 y tam al usuario ---->        se vuelvo a pedir
        //muestra el contenido del array e ntre el numero menor y el amyor (horizental con espacios)
//pidemos el numero al usuario 
        int tam;
        do {
            System.out.println("Dame un numero mayor a 0");
            tam = consola.nextInt();
        } while (tam <= 0);
//creamos el array con tamano que pedimos al usuario
        int[] array02 = new int[tam];
//rellena el array con numero aleatorioes entre 2 y 12 
        for (int i = 0; i < array02.length; i++) {
            array02[i] = (int) (Math.random() * (12 - 2 + 1) + 2);
        }
        for (int i = 0; i < array02.length; i++) {
            System.out.print(array02[i] + ", ");
        }
        System.out.println();
//pedimos un numero entre 0 y tam al usuario  y otro numero entre 0 y tam al usuario  
        int num1;
        do {
            System.out.println("Dame un numero entre 0 y " + (tam - 1));
            num1 = consola.nextInt();
        } while (num1 < 0 || num1 >= tam);
        int num2;
        do {
            System.out.println("Dame un segundo numero entre 0 y " + (tam - 1));
            num2 = consola.nextInt();
        } while (num2 < 0 || num2 >= tam);
        // Aseguramos el numero mayor y el numero menor 
        int menor03, mayor03;
        if (num1 < num2) {
            menor03 = num1;
            mayor03 = num2;
        } else {
            menor03 = num2;
            mayor03 = num1;
        }

// monstramos el contenido del array entre el numero menor y el  mayor 
        System.out.println("\nContenido del array entre  " + menor03 + " y " + mayor03);
        for (int i = menor03; i <= mayor03; i++) {
            System.out.print(array02[i] + " ");
        }

    }
}

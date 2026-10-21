package cadenas.de.caracteres;

import java.util.Scanner;

public class CadenasDeCaracteres {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("*********Ejericicio1*********");
        System.out.println("Introduzca una palabra");
        String word = consola.nextLine();
        System.out.println("longitud:  " + word.length());
        System.out.println("primer  : " + word.charAt(0) + " |  Ultimo : " + word.charAt(word.length() - 1));

        System.out.println("*********Ejericicio2*********");
        System.out.println("Introduzca una frase");
        String frase = consola.nextLine();
        System.out.println("Introduzca una palabara");
        String word1 = consola.nextLine();
        if (frase.contains(word1)) {
            System.out.println("La frase contiene la palabra \"" + word1 + "\".");
        } else {
            System.out.println("La frase NO contiene la palabra \"" + word1 + "\".");
        }

        System.out.println("*********Ejericicio3*********");
        System.out.println("Introduzca una frase ");
        String frase1 = consola.nextLine();
        System.out.println("Introduzca un caracter ");
        char c = consola.next().charAt(0);
        frase1 = frase1.replace('a', c)
                .replace('e', c)
                .replace('i', c)
                .replace('o', c)
                .replace('u', c);
        System.out.println("Frase modificada: " + frase1);

        System.out.println("*********Ejericicio4*********");

        System.out.println("Introduzca una frase ");
        String frase2 = consola.nextLine();
        //los primeros 5 
        System.out.println("Primeros 5 caracteres: " + frase2.substring(0, 5));
        // b) últimos 3 caracteres
        System.out.println("Últimos 3 caracteres: " + frase2.substring(frase2.length() - 3));

        System.out.println("*********Ejericicio5*********");
        System.out.println("Introduzca una frase ");
        String frase3 = consola.nextLine();
        // Dividimos la frase en palabras usando espacios
        String[] palabras = frase3.split(" ");
        System.out.println("La frase tiene " + palabras.length + " palabras.");

        System.out.println("*********Ejericicio6*********");
        System.out.println("Introduzca una frase");
        String frase4 = consola.nextLine().toLowerCase();
        int vocales = 0;

        if (frase4.contains("e") || frase4.contains("a") || frase4.contains("i") || frase4.contains("o") || frase4.contains("u")) {
            vocales++;

        }
        System.out.println("La frase tiene " + vocales + " vocales.");

        System.out.println("*********Ejericicio7*********");
        System.out.println("Introduzca una contraseña(tiene al menos 8 caracteres-contiene una @ y un punto(.) y el punto va despues de la arroba - no tiene espacios en blanco) ");
        String frase5 = consola.nextLine();
        int condiciones = 0;

        if (frase5.length() >= 8) {
            condiciones++;
        } else if (frase5.contains("@")) {
            condiciones++;
        } else if (frase5.contains(".")) {
            condiciones++;
        }
        System.out.println("*********Ejericicio8*********");
        System.out.print("Introduce tu nombre: ");
        String nombre1 = consola.nextLine();

        System.out.print("Introduce tu apellido: ");
        String apellido1 = consola.nextLine();

        // Capitalizamos: primera letra mayúscula + resto minúsculas
        nombre1 = nombre1.substring(0, 1).toUpperCase() + nombre1.substring(1).toLowerCase();
        apellido1 = apellido1.substring(0, 1).toUpperCase() + apellido1.substring(1).toLowerCase();

        System.out.println(nombre1 + " " + apellido1);

        consola.close();

    }

}

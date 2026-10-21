package tema3.bucles;

import java.util.Scanner;

public class Tema3Bucles {

    public static void main(String[] args) {
        System.out.println("*****ejemplo 1 *****");
        //pide un num mayor 1 al usuario (num) y muestra la suma de todas los num entre 1 y num
        Scanner consola = new Scanner(System.in);
        /*
        System.out.print("Dame un numero mayor que 1: ");
        int num = consola.nextInt();
        int suma = 0;
        int i = 1;

        while (i <= num) {
            suma = suma + i;
            i++;
        }

        System.out.println("La suma de 1 ha5sta " + num + " es: " + suma);
        System.out.println("*****ejemplo 2 *****");
        //pido una lista de numeros al usuario hasta que sea 0 
        //muesta la suma de todos esos numeros
        //indico cuantos numeros ha metidodo

        int suma1 = 0;
        int contador1 = 0;

        System.out.println("dame numeros  ( y 0 para terminar):");
        int num1 = consola.nextInt();

        while (num != 0) {
            suma += num;
            contador1++;
            num1 = consola.nextInt();
        }

        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("Has introducido " + contador1 + " numeros.");
         
        System.out.println("*****ejemplo 3 *****");
        //pido al usuario email y clave
        String correoCorrecto = "cna0009@alu.medac.es";
        String claveCorrecto = "1234";
        int intentos = 3;
        String correo = "";
        String clave = "";
        //mientras no penga los datos correctos  muestro error 
        //vuelve a pedir
        // cuando ponga datos correctos : bienvenidos!!
        //b)limito 3 intentos
        //mientras los datos sean incorrectos y tenga intentos 
        //mustra error
        //vuelvo a pedir
        //si se acaban intentos : error
        while ((!correo.equals(correoCorrecto) || !clave.equals(claveCorrecto)) && intentos > 0) {

            System.out.println("Dame tu correo: ");
            correo = consola.nextLine();

            System.out.println("Dame tu clave: ");
            clave = consola.nextLine();

            if (!correo.equals(correoCorrecto) || !clave.equals(claveCorrecto)) {
                intentos--;
                if (intentos > 0) {
                    System.out.println("Error  las datos son incorrectos  te quedan : " + intentos + " Intentos");
                }
            }
        }
        //compramos si los datos son correctos o no 
        if (correo.equals(correoCorrecto) && clave.equals(claveCorrecto)) {
            System.out.println("Bienvenido!");
        } else {
            System.out.println("Has agotado los intentos ERROR!");
        }

        System.out.println("*****ejemplo 4 *****");
        System.out.println("dame dos numeros positivos : ");
        int num1 = consola.nextInt();
        int num2 = consola.nextInt();

        while (num1 <= 0 || num2 <= 0) {
            System.out.println("las dos num deben ser positivo intentalo de nuevo porfa \n");

            System.out.print("dame el primer numero positivo : ");
            num1 = consola.nextInt();
            System.out.print("dame el segundo numero positivo ");
            num2 = consola.nextInt();
        }

        int suma = num1 + num2;
        System.out.println("La suma es: " + suma);
        */
        System.out.println("*****ejemplos********");
        
        
        
        
        //pido numeros al usuario para cuando meta el 0
        System.out.println("Introduce los numeros");
        int num = consola.nextInt();
        int numero;
        int suma = 0;
        int contador = 0;
        String lista = "";

        System.out.println("Introduce números (0 para terminar):");

        do {
            numero = consola.nextInt();
            if (numero != 0) {
                suma += numero;
                contador++;
                lista += numero + " ";
            }
        } while (numero != 0);

        if (contador == 0) {
            System.out.println("No se introdujeron números.");
        } else {
            double media = (double) suma / contador;
            System.out.println("Suma: " + suma);
            System.out.println("Media: " + media);
            System.out.println("Lista: " + lista);
        }

    }
}

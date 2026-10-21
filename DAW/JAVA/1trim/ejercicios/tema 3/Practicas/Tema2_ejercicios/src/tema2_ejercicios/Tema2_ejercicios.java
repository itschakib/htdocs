package tema3_ejercicios;

import java.util.Scanner;

public class Tema2_ejercicios {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("********Ejercicio16*********");
        System.out.println("dame nota 1");
        int num1 = consola.nextInt();
        System.out.println("dame nota 2");
        int num2 = consola.nextInt();
        System.out.println("dame nota 3");
        int num3 = consola.nextInt();

        double media = (num1 + num2 + num3) / 3;
        if (media > 6.5) {
            System.out.println("Promocionado con una media de XX");
        } else {
            System.out.println("No Promocionas");
        }
        System.out.println("********Ejercicio17*********");
        System.out.println("Introduce la clave por primera vez :");
        String clave1 = consola.nextLine();
        System.out.println("Introduce la clave por segunda vez :");
        String clave2= consola.nextLine();
        
        if(clave1.equals(clave2)){
            System.out.println("las claves son eguales");
        } else {
            System.out.println("las claves son diferentes. ");
        }
        System.out.println("********Ejercicio18*********");
        System.out.println("dame num 1");
        int n1 = consola.nextInt();
        System.out.println("dame num 2");
        int n2 = consola.nextInt();
        if(n1>n2){
            double resta = n1-n2;
            double division=n1/n2;
            System.out.println(" el resto es : " + resta + "\n" + "el division es : " + division);
        } else {
             double suma = n1+n2;
            double producto=n1*n2;
            System.out.println("La suma es : " + suma  + "\n" + "el producto es : " + producto);
        }
            System.out.println("********Ejercicio19*********");
        
        
        
        
    }

}

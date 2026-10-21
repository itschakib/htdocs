package ejercicio67;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
//A
        Lampara lampA = new Lampara("blanco", "Strosegel", 1, 20.3);
        lampA.encender();
        lampA.monstrarInfo();

//B
        System.out.println("Introducce el color de la lampara :  ");
        String color = consola.nextLine();

        System.out.println("Introduce el modelo de la lampara :  ");
        String modelo = consola.nextLine();

        System.out.println("Introduce el numero de bombillas de la lampara :  ");
        int bombillas = consola.nextInt();

        System.out.println("Introduce la potencia de la lampara:  ");
        double potencia = consola.nextDouble();

        //creo la lampara 
        Lampara lamB = new Lampara(color, modelo, bombillas, potencia);
        lamB.apagar();
        lamB.apagar();
        lamB.monstrarInfo();
    }

}

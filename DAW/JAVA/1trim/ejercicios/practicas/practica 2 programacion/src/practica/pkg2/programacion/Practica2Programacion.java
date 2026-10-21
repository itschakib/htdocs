package practica.pkg2.programacion;

import java.util.Scanner;

public class Practica2Programacion {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("******Ejercicio2*******");
        int numero;
        int contador = 1;//no podemos dejar contador con nada
        int mayor = 0;
        int menor = 0;
        int impares = 0;
        String pares = "";//eso por las pares que vamos utilizar despuese 

        while (contador <= 7) {
            System.out.print("Introduce un numero entre 10 y 50 :");
            numero = consola.nextInt();
            if (numero < 10 || numero > 50) {
                System.out.println("Incorrecto!! Debe estar entre 10 y 50.");
            } else {
                if (contador == 1) {
                    mayor = numero;
                    menor = numero;
                } else {
                    if (numero > mayor) {
                        mayor = numero;
                    }
                    if (numero < menor) {
                        menor = numero;
                    }
                }

                //guardar pares
                if (numero % 2 != 0) {
                    impares++;
                } else {
                    pares += numero + " ";
                }
                contador++;
            }
        }

        System.out.println("El mayor de todos los numeros es: " + mayor);
        System.out.println("El menor de todos los numeros es:" + menor);
        System.out.println("Hay " + impares + " numeros impares en total");
        System.out.println("Los numeros pares son: " + pares);

        System.out.println("******Ejercicio3*******");

        int cantidadnotas;

        do {
            System.out.print("Cuantas notas vas a introducir?(entre 3 y 10): ");
            cantidadnotas = consola.nextInt();
            if (cantidadnotas < 3 || cantidadnotas > 10) {
                System.out.println("Numero no valido el cantidad de notas debe estar entre 3 y 10");
            }
        } while (cantidadnotas < 3 || cantidadnotas > 10);

        //variables
        int suspensos = 0;
        int aprobados = 0;
        int notables = 0;
        int sobresalientes = 0;
        double suma = 0;

        //pedimos las notas
        for (int i = 1; i <= cantidadnotas; i++) {
            double nota;
            do {
                System.out.print("Introduce la nota " + i + " (entre 0 y 10): ");
                nota = consola.nextDouble();
                if (nota < 0 || nota > 10) {
                    System.out.println("Nota no valida debe estar entre 0 y 10");
                }
            } while (nota < 0 || nota > 10);
            //sumar las nota por la media
            suma += nota;

            //calificacion
            if (nota < 5) {
                suspensos++;
            } else if (nota < 7) {
                aprobados++;
            } else if (nota <= 9) {
                notables++;
            } else { // las notas  > 9
                sobresalientes++;
            }
        }

        // la media
        double media = suma / cantidadnotas;

        //resultados
        System.out.println("Nota media" + media);
        System.out.println("Numero de suspensos: " + suspensos);
        System.out.println("Numero de aprobados: " + aprobados);
        System.out.println("Numero de notables: " + notables);
        System.out.println("Numero de sobresalientes: " + sobresalientes);

        System.out.println("******Ejercicio1*******");
        int numU;

        do {
            System.out.print("Introduce un numero entero entre 15 y 27: ");
            numU = consola.nextInt();
            if (numU < 15 || numU > 27) {
                System.out.println("Error: el numero introducido no esta en el rango indicado.");
            }
        } while (numU < 15 || numU > 27);

        // La maquina saca un numero aleatorio entre 5 y 50
        int numM = (int) (Math.random() * (50 - 5 + 1)) + 5;
        System.out.println("La maquina ha sacado un: " + numM);

        // comparacion
        if (numU > numM) {
            System.out.println("Tu ganas.");
        } else if (numU < numM) {
            System.out.println("La maquina gana!!!.");
        } else {
            System.out.println("!!Empate!!");
        }
        consola.close();
    }

}

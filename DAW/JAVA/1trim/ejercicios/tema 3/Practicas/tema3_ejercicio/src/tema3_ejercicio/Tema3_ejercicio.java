package tema3_ejercicio;

import java.util.Scanner;

public class Tema3_ejercicio {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        /*     
        System.out.println("********Ejercicio1.1********");
        int ini,fin;
        do {
        System.out.println("Introduce el numero inicial: ");
          ini = consola.nextInt();
         }while(ini <0);
        do {
        System.out.println("Introduce el numero final");
          fin = consola.nextInt();
         } while(fin<0);

        int sumaTotal = 0;
        int sumaPares = 0;

        //monstrar los num
        for (int i = ini; i <= fin; i++) {
            sumaTotal += i; //suma 
            // comprobamos si es par
            if (i % 2 == 0) {
                sumaPares += i;
            }
        }
        System.out.println("el suma de todos los numeros es : " + sumaTotal);
        System.out.println("Suma de los numeros par es " + sumaPares);

       System.out.println("********Ejercicio1.2********");
        int total;
        int numero;
        do{
        System.out.println("Dame u numero positivo");
        numero = consola.nextInt();
        System.out.println("num =" + numero);
              }while(numero<=0);
        for (int i = 1; i <= 10; i++) {
            total = numero * i;
            System.out.println(numero + "*" + i + "=" + total);
        }
         
        
        System.out.println("********Ejercicio30********");
        System.out.println("Introduce primer numero: ");
        int num1 = consola.nextInt();
        System.out.println("Introduce segundo numero");
        int num2 = consola.nextInt();
        int inicio, fin;
        //si el 1 numero es mayor 
        if (num2 < num1) {
            inicio = num2;
            fin = num1;
        } else {
            inicio = num1;
            fin = num2;
        }
        //monstrar los num
        for (int i = inicio; i <= fin; i++) {
            // comprobamos si es par
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("********Ejercicio31********");
        System.out.print("Dame un numero entero");
        int num = consola.nextInt();
        System.out.println("Los divisores de " + num + " son:");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }

        System.out.println("********Ejercicio32********");
        System.out.println("dame un numero");
        int numero = consola.nextInt();
        while (!(numero % 2 == 0 && numero % 3 == 0)) {
            System.out.println("Error: no es divisible por 2 y 3.");
            System.out.print("Introduce otro número: ");
            numero = consola.nextInt();
        }

        System.out.println("divisible por 2 y 3");
        System.out.println("Num/2 = " + (num / 2));
        System.out.println("Num/3 = " + (num / 3));

        System.out.println("********Ejercicio33********");
        int base, exponente;
        int resultado = 1; // cada numero elevado por 0 es 1

        do {
            System.out.print("Introduce el base: ");
            base = consola.nextInt();
            System.out.print("Introduce el exponente: ");
            exponente = consola.nextInt();
        } while (exponente >= 0);//ahi por tener el exponente siempre positivo 

        for (int i = 1; i <= exponente; i++) {
            resultado = resultado * base;
        }
        System.out.println(base + " elevado a " + exponente + " es: " + resultado);

        System.out.println("********Ejercicio34********");
        for (int i = 6; i <= 200; i++) {
            if (i % 6 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("********Ejercicio35********");
        System.out.println("Introducce 1 num:");
        int n = consola.nextInt();
        System.out.println("Introduce 2 num ");
        int m = consola.nextInt();

        for (int i = n; i <= m; i++) {
            if (i % n == 0) {
                System.out.println("los multiplos de " + n + "  entre " + n + " y " + m + " son :  " + i);
            }
        }

        System.out.println("********Ejercicio36********");
        int nume;
        int sumaTotal = 0;
        int sumaMayores36 = 0;
        int sumaMenores10 = 0;

        System.out.println("dame 5 numeros:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Número " + i + ": ");
            nume = consola.nextInt();
            sumaTotal += nume;

            if (nume > 36) {
                sumaMayores36 += nume;
            } else if (nume < 10) {
                sumaMenores10 += nume;
            }
        }

        System.out.println("resultados");
        System.out.println("suma total: " + sumaTotal);
        System.out.println("suma de num mayores a 36: " + sumaMayores36);
        System.out.println("Suma de num menores a 10: " + sumaMenores10);

        System.out.println("*****ejercicios cinema ******");
        int opcion;
        int totalEntradas = 0;
        double totalRecaudado = 0;
        final double PRECIO = 10.0;

        do {
            System.out.println("\n--- Cine Palante ---");
            System.out.println("1. Vender entrada");
            System.out.println("2. Total de entradas vendidas");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            opcion = consola.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce tu edad :: ");
                    int edad = consola.nextInt();
                    double precio = 0;

                    if (edad < 5) {
                        precio = 0;
                        System.out.println("Entrada gratuita (menor de 5 años).");
                    } else if (edad >= 5 && edad <= 15) {
                        precio = PRECIO / 2;
                        System.out.println("Entrada a mitad de precio: " + precio + "€");
                    } else if (edad >= 16 && edad <= 60) {
                        precio = PRECIO;
                        System.out.println("Precio completo: " + precio + "€");
                    } else if (edad > 60) {
                        precio = 0;
                        System.out.println("Entrada gratuita (mayor de 60 años).");
                    }

                    totalEntradas++;
                    totalRecaudado += precio;
                    System.out.println("Debe pagar: " + precio + "€");
                    break;

                case 2:
                    System.out.println("\n--- Resumen ---");
                    System.out.println("Entradas vendidas: " + totalEntradas);
                    System.out.println("Total recaudado: " + totalRecaudado + "€");
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 3);

        System.out.println("********Ejercicio37********");
        int x = -1, pos = 0, primero = 0, ultimo = 0;

        while (x != 0) {
            System.out.println("Dame un numero ");
            x = consola.nextInt();
            if (x != 0) {
                pos++; }
            if (x == 12) {
                if (primero == 0) primero = pos;
                ultimo = pos;}
        }
        if (primero== 0) {
            System.out.println("No hay numero 12.");
        } else {
            System.out.println("Primera aparicion: " + primero);
            System.out.println("Ultima aparicion: " + ultimo);
        }
        System.out.println("********Ejercicio38********");
        double nota;
        double suma = 0;
        double contador = 0;

        do {
            System.out.println("Dame una nota");
            nota = consola.nextDouble();
            if (nota == -1) {
                System.out.println("Has decidido salir");
            } else if ((nota >= 0 && nota <= 10)) {
                suma += nota;
                contador++;
            } else if (nota <= -1) {
                System.out.println("Error");
            }

        } while (nota != -1);

        if (contador > 0) {
            System.out.println("la media de las notas es :" + suma / contador);
        } else {
            System.out.println("No se introdujeron notas válidas.");
        }

        System.out.println("********Ejercicio39********");
        int nota;
        int suma=0;
        int Nnotas;
        System.out.println("Introduce las notas");
        Nnotas=consola.nextInt();
        
      
        for (int i = 1; i <= Nnotas; i++) {
            System.out.print("Introduce la nota " + i + ": ");
            nota = consola.nextInt();
            suma += nota;
        }

        double media = (double) suma / Nnotas;

        System.out.println("La suma de las notas es: " + suma);
        System.out.println("La media de las notas es: " + media);
     
        
        System.out.println("********Ejercicio45********");

        int N;

        do {
            System.out.println("Dame un numero entero mayor a 10");
            N = consola.nextInt();
        } while (N <= 10);//ahi por siempre positivo 

        for (int i = 1; i <= N; i++) {
            if ((i % 5 == 0) && (i % 3 == 0)) {
                System.out.println("FIZZ");
            } else if (i % 5 == 0) {
                System.out.println("BUZZ");
            } else if(i % 3 == 0) {
                System.out.println("FIZZBUZZ");
            } else {
                System.out.println(i);
            }
        }

       
        int N;

        do {
            System.out.print("Introduce un número entero mayor que 10: ");
            N = consola.nextInt();
        } while (N <= 10);

        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.print("FIZZBUZZ ");
            else if (i % 3 == 0)
                System.out.print("FIZZ ");
            else if (i % 5 == 0)
                System.out.print("BUZZ ");
            else
                System.out.print(i + " ");
        }/*
        /*
        
      do {
            System.out.print("Introduce un número entero mayor que 10: ");
            N = consola.nextInt();
        } while (N <= 10);

        for (int i = 1; i <= N; i++) {
            String valor;
            if (i % 3 == 0 && i % 5 == 0)
                valor = "FIZZBUZZ";
            else if (i % 3 == 0)
                valor = "FIZZ";
            else if (i % 5 == 0)
                valor = "BUZZ";
            else
                valor = String.valueOf(i);

            // Sin coma al final
            if (i == N)
                System.out.print(valor);
            else
                System.out.print(valor + ", ");
        }
        
                

        System.out.println("********Ejercicio46********");
        int numP;
        int numU;
        numP = (int) (Math.random() * 100) + 1;
        do {

            System.out.println("Dame un numero entero");
            numU = consola.nextInt();
            if (numU > numP) {
                System.out.println("Te has pasado!!");
            } else if (numU < numP) {
                System.out.println("Te has quedado corto!!");
            } else {
                System.out.println("Lo logrates!");
            }

        } while (numU != numP);
   
        
          System.out.println("********Ejercicio47********");
          
          int bolasU;
          
          do{
              System.out.println("introduce el numero de bolas inicial");
              bolasU=consola.nextInt();
          }while(bolasU>0);
         */
        System.out.println("********JUEGO DE APUESTAS ********");
        //1 pido un numero mayor a  100 al usuario ( si no es mayor a 100 , se vuelve a pedir) esto sera el monedero
        int monedero;
        int usuario;
        int maquina;
        boolean jugando = true; // controla si el jugador sigue o no
        do {
            System.out.println("Dame un numero mayor a  100");
            monedero = consola.nextInt();
        } while (monedero <= 100);

        //2)Mientras el usuario quiera seguir apostando y tenga dinero en el monedero 
        // El usuario indica cuanto quiere apostar(como maximo lo que tiene el monedero)
        while ((jugando ==  true) && (monedero > 100)) {
            System.out.println("\nTienes" + monedero + "monedas.");
            //pregunto si quiere impiezar o  volver a jugar
            System.out.println("Cuantos quieres apostar? y 0 para salir");
            int apuesta = consola.nextInt();

            //si el jugador ingresa 0 termine el juego
            if (apuesta == 0) {
                jugando = false;
            } else if (apuesta > monedero) {
                System.out.println("No puedes apostar mas de lo que tienes");
            } else {
                //3)tirar los dados
                //Se "tira" dos dado de 6 para el usuario
                //Se "tira" dos dado de 6 para la maquina
                usuario = (int) (Math.random() * (6 - 1 + 1)+1) + (int) (Math.random() * (6 - 1 + 1)+1);
                maquina = (int) (Math.random() *(6 - 1 + 1)+1) + (int) (Math.random() * (6 - 1 + 1)+1);
                //Monstramos los datos
                System.out.println("Tus dados son: " + usuario);
                System.out.println("Los dados de la maquina suman: " + maquina);
                //Si el usuario gana --->  gana la apostado(incrementamos el monedero)
                //Si el usuario pierde ---> pierde la apostado(decrementamos el monedero)
                //Si empatan , nose hace nada
                //4)comprar ganador
                if (usuario > maquina) {
                    monedero += apuesta;
                    System.out.println("GANASTE!!!!!" + apuesta + "monedas");
                } else if (usuario < maquina) {
                    monedero -= apuesta;
                    System.out.println("Perdiste...." + apuesta + "monedas");
                } else {
                    System.out.println("Empate nadia gana nadia pierdes");
                }
                //Muestra por pantalla lo que queda en el monedero
                System.out.println("Monedero actual " + monedero);
            }
            System.out.println(".........................................");
        }
        //
        //fin del juego
        System.out.println("\nJuego has terminado y te quedan " + monedero + " monedas");
        System.out.println("Gracias por jugar");
    }
}

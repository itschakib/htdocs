package tema2_1;

import java.util.Scanner;

public class Tema2_1 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
/*
        System.out.println("******ejercicio 1 *******");
        System.out.println("Dime tu nombre");
        String nombre = consola.next();
        System.out.println("Dime tu DNI");
        String DNI = consola.next();
        System.out.println(" Y por final tu fecha de nacimineto");
        String fechaDeNacimiento = consola.next();
        System.out.println("Nombre:" + nombre + "\n" + "DNI:" + DNI + "\n" + "fecha de nacimiento: " + fechaDeNacimiento);
        System.out.println("******ejercicio 2 *******");
        System.out.println(" Introduce el primer numero positivo :");
        int A = consola.nextInt();
        System.out.println(" Introduce el segundo numero positivo :");
        int B = consola.nextInt();
        int suma = A + B;
        int resta = A - B;
        int multiplicacion = A * B;
        int division = A / B;
        double potencia = Math.pow(A, B);
        System.out.println("La suma de " + A + " y " + B + " es : " + suma);
        System.out.println("La resta  de " + A + " y " + B + " es : " + resta);
        System.out.println("La multiplicacion   de " + A + " y " + B + " es : " + multiplicacion);
        System.out.println("El cociente de " + A + " entre " + B + " da : " + division);
        System.out.println(A + " Elevado a " + B + " da : " + potencia);
        System.out.println("******ejercicio 3 *******");
        System.out.println("Numero 1 :  ");
        double n1 = consola.nextDouble();
        System.out.println("Numero 2 :  ");
        double n2 = consola.nextDouble();
        System.out.println("Numero 3 :  ");
        double n3 = consola.nextDouble();
        System.out.println("Numero 4 :  ");
        double n4 = consola.nextDouble();
        System.out.println("Numero 5 :  ");
        double n5 = consola.nextDouble();
        double media = (n1 + n2 + n3 + n4 + n5) / 5;
        System.out.println("la media es  : " + media);

        System.out.println("******ejercicio 4 *******");
        System.out.println(" Dame el primer numero positivo :");
        int m = consola.nextInt();
        System.out.println("Dame el segundo numero positivo :");
        int n = consola.nextInt();
        double e1 = m / n * (m - n);
        double e2 = 2.3 / n + 5 - n * 9;
        double e3 = m * 2048 / n * 1024 - Math.pow(m, n);
        double e4 = Math.pow(3203 / m - n, n) / (Math.pow(n, 2) * Math.pow(m, 3));
        System.out.println("Resultado 1 : " + e1);
        System.out.println("Resultado 2 : " + e2);
        System.out.println("Resultado 3 : " + e3);
        System.out.println("Resultado 4 : " + e4);

        System.out.println("******ejercicio 4 . 2 *******");
        System.out.println("Introduce la base del triangle : ");
        double base = consola.nextDouble();
        System.out.println("Introduce la altura del triangle : ");
        double altura = consola.nextDouble();
        double area = (base * altura) / 2;
        System.out.println("el area del triangle es : " + area);

        System.out.println("******ejercicio 5 *******");
        System.out.println("Introduce el tiempo expresado  en segundos : ");
        // tiempo 1 = en segundos - tiempo2 = en min y seg  - tiempo3=horas y min y seg
        double tiempo1 = consola.nextDouble();
        double tiempo2 = tiempo1 / 60;
        double tiempo3 = tiempo1 / 3600;
        System.out.println("El tiempo real en horas y min y seg : " + tiempo3);
        System.out.println("******ejercicio  6 *******");
        String texto = "LA LLUVIA EN SEVILLA ES UNA MARAVILLA";
        texto = texto.toLowerCase();
        // methodo 1
        // "sevilla es una maravilla" 
        String frase1 = texto.substring(10);

        // "la lluvia es una maravilla"
        String frase2 = "la lluvia " + texto.substring(21);

        // resultados
        System.out.println(frase1);
        System.out.println(frase2);
        /*
        // Construir frase1 usando char
        String frase1 = "";
        frase1 += texto.charAt(10); // s
        frase1 += texto.charAt(11); // e
        frase1 += texto.charAt(12); // v
        frase1 += texto.charAt(13); // i
        frase1 += texto.charAt(14); // l
        frase1 += texto.charAt(15); // l
        frase1 += texto.charAt(16); // a
        frase1 += " ";
        frase1 += texto.charAt(17); // e
        frase1 += texto.charAt(18); // s
        frase1 += " ";
        frase1 += texto.charAt(20); // u
        frase1 += texto.charAt(21); // n
        frase1 += texto.charAt(22); // a
        frase1 += " ";
        frase1 += texto.charAt(24); // m
        frase1 += texto.charAt(25); // a
        frase1 += texto.charAt(26); // r
        frase1 += texto.charAt(27); // a
        frase1 += texto.charAt(28); // v
        frase1 += texto.charAt(29); // i
        frase1 += texto.charAt(30); // l
        frase1 += texto.charAt(31); // l
        frase1 += texto.charAt(32); // a
        // Construir frase2 
        String frase2 = "la lluvia ";
        frase2 += texto.charAt(17); // e
        frase2 += texto.charAt(18); // s
        frase2 += " ";
        frase2 += texto.charAt(20); // u
        frase2 += texto.charAt(21); // n
        frase2 += texto.charAt(22); // a
        frase2 += " ";
        frase2 += texto.charAt(24); // m
        frase2 += texto.charAt(25); // a
        frase2 += texto.charAt(26); // r
        frase2 += texto.charAt(27); // a
        frase2 += texto.charAt(28); // v
        frase2 += texto.charAt(29); // i
        frase2 += texto.charAt(30); // l
        frase2 += texto.charAt(31); // l
        frase2 += texto.charAt(32); // a

        System.out.println(frase1);
        System.out.println(frase2);
         
        System.out.println("******ejercicio  8 *******");
        System.out.println("Introduce el numero de caras del dad:  ");
        int N = consola.nextInt();
// (int ) (Math.random()*(Max-Min)+1)
        int resultado = (int) (Math.random() * N + 1);
        System.out.println("Has sacado:  " + resultado);
    
        System.out.println("******ejercicio  9 *******");

        // Pedimos los valores de a y b
        System.out.print("Introduce el valor de a: ");
        double a = consola.nextDouble();

        System.out.print("Introduce el valor de b: ");
        double b = consola.nextDouble();

        // Calculamos la solución
        double x = -b / a;

        // Mostramos el resultado
        System.out.println("La solución de la ecuación " + a + "x + " + b + " = 0 es:");
        System.out.println("x = " + x);

        System.out.println("******ejercicio  10   *******");

        // pedimos valores
        System.out.print("Introduce el valor de a: ");
        double a1 = consola.nextDouble();

        System.out.print("Introduce el valor de b: ");
        double b1 = consola.nextDouble();

        System.out.print("Introduce el valor de c: ");
        double c1 = consola.nextDouble();

        //  las soluciones
        double x1 = (-b1 + Math.sqrt(b1 * b1 - 4 * a1 * c1)) / (2 * a1);
        double x2 = (-b1 - Math.sqrt(b1 * b1 - 4 * a1 * c1)) / (2 * a1);

        // Mostramos el resultado
        System.out.println("Las soluciones de la ecuación " + a1 + "x^2 + " + b1 + "x + " + c1 + " = 0 son:");
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
        System.out.println("******ejercicio  11    *******");

        //pedimos los valores 
        System.out.println("Introducec la velocidad de la linea en (Mbps) :");
        double mbps = consola.nextDouble();
        // Convertir de Mbps (megabits por segundo) a bytes por segundo:
        // 1 byte = 8 bits  entonces dividimos entre 8
        double MBporSegundo = mbps / 8.0;
        // Convertir de MB (megabytes, 10^6 bytes) a MiB (mebibytes, 2^20 bytes)
        // 1 MiB = 1.048.576 bytes, entonces dividimos entre 1.048576
        double MiBporSegundo = MBporSegundo / 1.048576;
        System.out.println("La descarga máxima es: " + MiBporSegundo + " MiB/s");
        
        System.out.println("******ejercicio  12 *******");
        // a) MB a MiB
        System.out.print("Introduce la cantidad en MB: ");
        double MB = consola.nextDouble();
        double MiB = MB / 1.048576;
        System.out.println(MB + " MB son " + MiB + " MiB");

        // b) MiB a Mb
        System.out.print("Introduce la cantidad en MiB: ");
        double MiB2 = consola.nextDouble();
        double Mb = MiB2 * 1.048576 * 8;
        System.out.println(MiB2 + " MiB son " + Mb + " Mb");
        
        System.out.println("******ejercicio  13 *******");
        // pedimos las datos
        System.out.print("Ancho (m): ");
        double ancho = consola.nextDouble();

        System.out.print("Largo (m): ");
        double largo = consola.nextDouble();

        System.out.print("Lado baldosa (cm): ");
        double lado = consola.nextDouble() / 100; // convertir a metros

        System.out.print("Precio por baldosa (€): ");
        double precio = consola.nextDouble();
        // calcular num de baldosas necesarias
        int baldosasAncho = (int) ((ancho + lado - 0.000001) / lado);
        int baldosasLargo = (int) ((largo + lado - 0.000001) / lado);

        int totalBaldosas = baldosasAncho + baldosasLargo;
        // calcular precio total 
        double precioTotal = totalBaldosas * precio;
        // monstrar resultados
        System.out.println("Numero de baldosas necesarias : " + totalBaldosas);
        System.out.println("Precio total " + precioTotal + " €");
        
        System.out.println("******ejercicio  14 *******");
        // Pedir al usuario los segundos transcurridos
        System.out.print("Introduce los segundos transcurridos: ");
        int segundos = consola.nextInt();

        // Calcular el minuto actual
        int minuto = (segundos / 60) + 1;

        System.out.println("Nos encontramos en el minuto: " + minuto);
        
        System.out.println("******ejercicio  15 ****14***");
        System.out.println("dame los seg : ..");
        int seg = consola.nextInt();
        int total= (int)(Math.random() * (5399 -  seg + 1) + seg);
        int min = total/seg+1;
       System.out.println("Han pasado " + seg + " segundos.");
        System.out.println("Estamos en el minuto " + min);
*/
int edad=15;
int agge=15;
edad= edad + agge;
agge=edad;
        System.out.println(edad);
        System.out.println(agge);
        consola.close();
    }
}

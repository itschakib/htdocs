package tema3_1;

import java.util.Scanner;

public class Tema3_1 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        /*
        System.out.println("********ejemplo1*********");
        
             System.out.println("dame numero 1 ");
        int num1 = consola.nextInt();
        System.out.println("Dame numero 2");
        int num2 = consola.nextInt();

        if (num2 > 0) {
            num1 = num2;
        }
        System.out.println("El valor de numero 1  es : ");

        System.out.println("********ejemplo2*********");
        System.out.println("dame un edad");
        int edad= consola.nextInt();
        if ((edad > 5) || (edad < 10)) {
            edad += 5; //edad=edad+5
            System.out.println("He creado de golpe");
        } else {
            edad -= 5;//  edad=edad-5
            System.out.println("He rejwenecido");

        }
        System.out.println("Tengo :  " + edad + "  anos");
         
        System.out.println("********ejemplo3*********");
        System.out.println("dame un num1");
        int num1 = consola.nextInt();
        System.out.println("dame un num2");
        int num2 = consola.nextInt();
        double resultado;
        if (num2 != 0) {
            resultado = num1 / num2;
        } else {
            resultado = 0;
        }
        System.out.println("el resultado es : " + resultado);

        System.out.println("********ejemplo4*********");
        // dos num

        System.out.println("dame un num1");
        int X = consola.nextInt();
        System.out.println("dame un num2");
        int Y = consola.nextInt();
        /*
//methodo 1
            if (X < Y) {
            System.out.println("Num2 mayor a Num1");
        } else {
            System.out.println("Num1 mayor  a Num2");
        }
        
//methodo 2       
        if (X < Y) {
            System.out.println("Num2 mayor a Num1");
        } else if(X>Y) {
            System.out.println("Num1 mayor  a Num2");
        } else {
            System.out.println("Num 1 y Num 2 son iguales");
        }

        // 3 num     
        
        System.out.println("********ejemplo5*********");

        System.out.println("dame un num1");
        int a = consola.nextInt();

        System.out.println("dame un num2");
        int b = consola.nextInt();

        System.out.println("dame un num3");
        int c = consola.nextInt();
        // methodo 1

        int mayor = a;
        if (b > mayor) {
            mayor = b;
        }
        if (c > mayor) {
            mayor = c;
        }

        int menor = a;
        if (b < menor) {
            menor = b;
        }
        if (c < menor) {
            menor = c;
        }

        System.out.println("El mayor es: " + mayor);
        System.out.println("El menor es: " + menor);


      // methodo 2
        if (a >= b && a >= c) {
            
            System.out.println("Num 1 es el mayor");
            
        } else if (b>= a && b>= c) {
            
            System.out.println("Num 2 es el mayor ");
        } else {
            
            System.out.println("Num 3 es el mayor");
        }
        
        
        
        if (a<= b && a <= c) {
            
            System.out.println("Num 1 es el menor");
            
        } else if (b <= a && b <= c) {
            
            System.out.println("Num 2 es el  menor ");
        } else {
            
            System.out.println("Num 3 es el  menor");
        }
     
        
          if (a == b && b == c) {
            System.out.println("Todos los numeros son eguals.");
        } else  if(a == b || a == c || b== c){
            System.out.println("hay numeros eguales");
        }
         
        System.out.println("********ejemplo6*********");
        System.out.println(" dame un mes ");
        String mes = consola.nextLine();

        if (mes.equals("enero") || mes.equals("febrero") || mes.equals("diciembre")) {
            System.out.println("Es invierno");

        } else if (mes.equals("marzo") || mes.equals("abril") || mes.equals("mayo")) {
            System.out.println("Es primavera");
        } else if (mes.equals("junio") || mes.equals("julio") || mes.equals("agosto")) {
            System.out.println("Es verano");
        } else if (mes.equals("septiembre") || mes.equals("octubre") || mes.equals("noviembre")) {
            System.out.println("Es otnoño");
        } else {
            System.out.println("Error!! mes incorrecto");
        }
        System.out.println("********ejemplo7*********");
        System.out.println("dame un numero 1");
        int num1 = consola.nextInt();
        System.out.println("dame un numero 2");
        int num2 = consola.nextInt();
        System.out.println("  1. calcular la suma \n  2.calcular la resto \n 3. calcular la divison \n 4. calcular el medulo ");
        int num3 = consola.nextInt();
        double resultado = 0;
        if (num3 == 1) {
            resultado = num1 + num2;
            System.out.println("el resultado es " + resultado); 
        } else if (num3 == 2) {
            resultado = num1 - num2;
            System.out.println("el resultado es " + resultado);
        } else if (num3 == 3) {
            resultado = num1 / num2;
            System.out.println("el resultado es " + resultado);
        } else if (num3 == 4) {
            resultado = num1 % num2;
            System.out.println("el resultado es " + resultado);
        } else {
            System.out.println("Error tienes que elegir un numero entre 1 y 4.");
        }
*/
        char opcion=consola.next().charAt(0);
        while(opcion!='n'){
            System.out.println("Estas seguro ?");
            opcion=consola.next().charAt(0);
        }
    }
}
 
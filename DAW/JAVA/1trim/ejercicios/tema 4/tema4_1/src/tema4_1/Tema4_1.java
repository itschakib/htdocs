package tema4_1;

import java.util.Scanner;

public class Tema4_1 {

    public static void main(String[] args) {
                Scanner consola = new Scanner(System.in);

System.out.println("*****ejemplo1:arrays if we dont know the variables inside but we want to know the last colomna variables***********");
        int[] lista = new int[5];
        lista[0] = 7;
        lista[1] = 8;
        lista[2] = 9;
        lista[3] = 10;
        lista[4] = 11;
                
//start reading from here
        System.out.println(lista[lista.length - 1]);

System.out.println("********ejemplo2*********");
        int[] lista2 = new int[5];

        lista2[0] = 12;
        lista2[1] = 23;
        lista2[2] = 30;
        lista2[3] = 40;
        lista2[4] = 10;

//for(int i =0;i<lista.lenght or we put the tamaño del array si le tenemos or we put i<=lista.lenght-1
        for (int i = 0; i < lista2.length; i++) {
            lista2[i] = i + 1;
            System.out.println(lista2[i]);
        }

System.out.println("********ejemplo3*********");

        int[] lista3 = new int[6];
//pido al usuario numeros y los meto en cada cajon
        for (int i = 0; i < lista3.length; i++) {
            System.out.println("meto en numero en caja " + i);
            lista3[i] = consola.nextInt();
        }
        for (int i = 0; i < lista3.length; i++) {
            System.out.println(lista3[i]);
        }
        
   
System.out.println("********ejemplo4*********");
//crea un array de longitud 12 (0de 12 celdas)
//a_rellenalo con numeros aleatorios
//b_calcula la suma , la media y muestrala
//c_muestra el array en horizontal separado por comas (el ultimo no)
//1_en 3 bucles difrentes(uno por apaeteido )NO en el mismo
        int[] lista4 = new int[12];
 
        for (int i = 0; i < lista4.length; i++) {
            lista4[i] = (int) (Math.random() * 12) + 1;
        }

        int suma = 0;
        for (int i = 0; i < lista4.length; i++) {
            suma += lista4[i];
        }
        double media = suma / lista4.length;
        System.out.println("la lista");
        for (int i = 0; i < lista4.length; i++) {
            System.out.print(lista4[i]);
            if (i < lista4.length - 1) {  // si no es el último
                System.out.print(", ");
            }
        }
 
/*
        String texto = "";
        for (int i = 0; i < lista4.length; i++) {
            if (i < lista4.length - 1) {
                texto = texto + lista4[i] + ", ";
            } else {
                texto = texto + lista4[i];
            }
        }
        System.out.println("La lista:");
        System.out.println(texto);
*/
        System.out.println("\nla media  es " + media);
        
        System.out.println("\nla suma  es " + suma);

    
System.out.println("********ejemplo5*********");
//crea un array de 5 celdas
//rellenalo con valores que de el usuario por teclado
//crea otro arrya de 5 celdas llamado 'otro'
//copio el contenido del array original en 'otro'
//muesta el contenido de ambos arrays en horizental y  cada elemnto separados por espacio
int[] lista5 = new int[5];
        for (int i = 0; i < lista5.length; i++) {
            System.out.println("meto en valores en cada celada " + i);
            lista5[i] = consola.nextInt();
        }
        int[] otro = new int[5];
        for (int i = 0; i < otro.length; i++) {
            otro[i] = lista5[i];
        }
        System.out.print("Array original: ");
        for (int i = 0; i < lista5.length; i++) {
            System.out.print(lista5[i] + " ");
        }

        System.out.println(); // salto de línea

        System.out.print("Array copia: ");
        for (int i = 0; i < otro.length; i++) {
            System.out.print(otro[i] + " ");
        }




    }

}

package ejercicio68;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

//A
        moto kawazakiz700 = new moto("kawazaki", "mt-07/2024", 2, 2);
        kawazakiz700.acelerar();
        kawazakiz700.frenar();
        kawazakiz700.parar();
        kawazakiz700.arrancar();
        for (int i = 0; i < 25; i++) {
            kawazakiz700.acelerar();
        }
        kawazakiz700.monstrarInfo();

    }

}

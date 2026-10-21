package ejercicios98;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicios98 {

    public static void main(String[] args) {

        ArrayList<Vehiculo> lista = new ArrayList<>();

        // 1. Crear objetos
        lista.add(new Coche("Rojo", 4, 180, 2000));
        lista.add(new Camioneta("Blanco", 4, 140, 2200, 1000));
        lista.add(new Bicicleta("Verde", 2, "urbana"));
        lista.add(new Motocicleta("Negra", 2, "deportiva", 200, 600));

        // 2. Mostrar todos
        for (Vehiculo v : lista) {
            System.out.println(v);
        }

        // 3. Pedir ruedas
        Scanner sc = new Scanner(System.in);
        System.out.print("Ruedas: ");
        int n = sc.nextInt();

        int cont = 0;

        // 4. Filtrar
        for (Vehiculo v : lista) {
            if (v.getRuedas() == n) {
                System.out.println(v);
                cont++;
            }
        }

        System.out.println("Encontrados: " + cont);

        // 5. Bicicletas → timbre
        for (Vehiculo v : lista) {
            if (v instanceof Bicicleta) {
                ((Bicicleta) v).tocarTimbre();
            }
        }
    }
}

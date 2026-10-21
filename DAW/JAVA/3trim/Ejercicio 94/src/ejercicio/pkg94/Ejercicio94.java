package ejercicio.pkg94;

public class Ejercicio94 {

    public static void main(String[] args) {
// Crear perros
        Perro p1 = new Perro("Labrador", "Max", 4, 45.0);
        Perro p2 = new Perro("Bulldog", "Rocky", 4, 50.0);

        // Crear gatos
        Gato g1 = new Gato("Michi", 4, 60.0);
        Gato g2 = new Gato("Luna", 4, 80.5);

        // Cambiar pelaje
        g1.setPelaje("largo");
        g2.setPelaje("semilargo");

        // Mostrar información
        System.out.println(p1);
        System.out.println(p2);

        System.out.println(g1);
        System.out.println(g2);

        // Comportamientos
        System.out.println(g1.comunicarse());
        g1.dormir();
        g1.cazar();

        System.out.println(p1.comunicarse());
        p1.dormir();
        p1.jugar();

    }

}

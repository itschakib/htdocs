package ejercicios113;

public class Ejercicios113 {

    public static void main(String[] args) {
        try {
            // Gato correcto
            Gato gato1 = new Gato("Michi", 3);
            System.out.println(gato1);

            // Gato con datos incorrectos
            Gato gato2 = new Gato("Mi", -2);
            System.out.println(gato2);

        } catch (Exception e) {
            System.out.println("Error al crear gato: " + e.getMessage());
        }

        try {
            // Usando setters con valores incorrectos
            Gato gato3 = new Gato("Luna", 2);

            gato3.setNombre("Al");  // error
            gato3.setEdad(-5);      // error

        } catch (Exception e) {
            System.out.println("Error al modificar gato: " + e.getMessage());
        }
    }

}


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Lectura {

    public static void main(String[] args) {
        final String ruta = "src/ficheros/datos.txt";
        BufferedReader mb = null;
        FileReader lector = null;
        int numLineas = 0;
        int numCaracteres = 0;

        try {
            // paso 2
            lector = new FileReader(ruta);

            // paso 3
            mb = new BufferedReader(lector);

            // paso 4 → leer
            String linea = "";
            while ((linea = mb.readLine()) != null) {
                numLineas++; // ✅ contar líneas
                numCaracteres += linea.length();
            }

            System.out.println("Número de líneas del fichero es: " + numLineas);
            System.out.println("Número de caracteres del fichero es: " + numCaracteres);

        } catch (FileNotFoundException e) {
            System.out.println("Error: ruta incorrecta " + e.getMessage());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            // paso 5 → cerrar
            try {
                if (mb != null) {
                    mb.close();
                }
                if (lector != null) {
                    lector.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el fichero");
            }
        }
    }
}

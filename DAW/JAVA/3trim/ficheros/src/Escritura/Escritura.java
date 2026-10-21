package Escritura;
//paso 1

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Escritura {

    public static void main(String[] args) {
        final String ruta = "src/ficheros/datos.txt";
        BufferedWriter bw = null;
        FileWriter fw = null;

        try {
            //paso2
            fw = new FileWriter(ruta,true);

            //paso3
            bw = new BufferedWriter(fw);

            //paso4
            bw.write("Hola mundo estoy añadiendo cosas al fichero ?");
            bw.newLine(); // salto de línea
            bw.write("Segunda línea ops no se que ha pasado me van despedir");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            try {
                //paso5
                if (bw != null) {
                    bw.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el fichero");
            }
        }
    }
}

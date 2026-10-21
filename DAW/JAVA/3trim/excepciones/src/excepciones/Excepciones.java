package excepciones;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.zip.DataFormatException;

public class Excepciones {

    public static void main(String[] args) {
        try {
            // 1. NullPointerException
            String texto = null;
            System.out.println(texto.length());

            // 2. ArrayIndexOutOfBoundsException
            int[] array = {1, 2, 3};
            System.out.println(array[5]);

            // 3. StringIndexOutOfBoundsException
            String palabra = "Hola";
            System.out.println(palabra.charAt(10));

            // 4. NumberFormatException
            int num = Integer.parseInt("abc");

            // 5. ArithmeticException
            int resultado = 10 / 0;

            // 6. ClassCastException
            Object obj = "Hola";
            Integer numero = (Integer) obj;

            // 7. FileNotFoundException
            FileReader fr = new FileReader("no_existe.txt");

            // 8. DataFormatException (simulado)
            throw new DataFormatException("Formato incorrecto");

        } catch (NullPointerException e) {
            System.out.println("Error: objeto no inicializado");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: índice fuera del array");

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: índice inválido en String");

        } catch (NumberFormatException e) {
            System.out.println("Error: no se puede convertir a número");

        } catch (ArithmeticException e) {
            System.out.println("Error: división entre 0");

        } catch (ClassCastException e) {
            System.out.println("Error: conversión de tipo incorrecta");

        } catch (FileNotFoundException e) {
            System.out.println("Error: fichero no existe");

        } catch (DataFormatException e) {
            System.out.println("Error: formato de datos incorrecto");

        } catch (Exception e) {
            System.out.println("Error general");

        } finally {
            System.out.println("FIN DEL PROGRAMA");
        }

    }

}

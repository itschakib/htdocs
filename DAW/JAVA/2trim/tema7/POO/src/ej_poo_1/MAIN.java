package ej_poo_1;


public class MAIN {

    public static void main(String[] args) {

        // un objeto Libro usando el constructor completo
        Libro libro1 = new Libro("The Lord of the Rings ", "Tolkien", 495, 20.5, false);

        // otro objeto usando el constructor sobrecargado
        Libro libro2 = new Libro("The Great Gatsby", "Scott Fitzgerald", 863);

        // un tercer objeto usando el constructor de copia
        Libro libro3 = new Libro(libro1);

        // Cambiar el precio de uno de los libros usando un SET
        libro2.setPrecio(15.0);

        // Prestar uno de los libros
        libro3.prestar();

        // información de los tres libros usando toString()
        System.out.println("******** Libro 1 ********");
        System.out.println(libro1.toString());

        System.out.println("******** Libro 2********");
        System.out.println(libro2.toString());

        System.out.println("******** Libro 3 ********");
        System.out.println(libro3.toString());
    }
}


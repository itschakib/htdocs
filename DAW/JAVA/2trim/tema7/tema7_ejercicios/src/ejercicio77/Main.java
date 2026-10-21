package ejercicio77;

public class Main {

    public static void main(String[] args) {

        Libro libro1 = new Libro("123ABC", "Adolesance", "Cervantes", 850);
        Libro libro2 = new Libro("999XYZ", "Harry Potter", "JK Rowling", 500);

        System.out.println(libro1);
        System.out.println(libro2);

        if (libro1.getNumPaginas() > libro2.getNumPaginas()) {
            System.out.println("El libro con mas paginas es :" + libro1.getTitulo());
        } else if (libro2.getNumPaginas() > libro1.getNumPaginas()) {
            System.out.println("El libro con mas paginas es: " + libro2.getTitulo());
        } else {
            System.out.println("Ambos libros tienen el mismo numero de paginas.");
        }
    }
}

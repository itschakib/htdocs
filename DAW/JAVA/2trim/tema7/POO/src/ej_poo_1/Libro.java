package ej_poo_1;


public class Libro {

    private String titulo;
    private String autor;
    private int numPaginas;
    private double precio;
    private boolean prestado;
//el constructor completo
    public Libro(String titulo, String autor, int numPaginas, double precio, boolean prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.precio = precio;
        this.prestado = prestado;
    }
//el constructor sobrecargado
    public Libro(String titulo, String autor, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.precio = 0.0;
        this.prestado = false;
    }
//el constructor de copia
    public Libro(Libro origen) {
        this.titulo = origen.titulo;
        this.autor = origen.autor;
        this.numPaginas = origen.numPaginas;
        this.precio = origen.precio;
        this.prestado = origen.prestado;
    }
// gets and sets
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("El precio no puede ser negativo");
        }
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
//methodes 
    public void prestar() {
        this.prestado = true;
        System.out.println("El libro '" + titulo + "' ha sido prestado");
    }

    public void devolver() {
        this.prestado = false;
        System.out.println("El libro '" + titulo + "' ha sido devuelto");
    }
//methodo tostring
    @Override
    public String toString() {
        String res = "";
        res += "Título : " + this.titulo + "\n";
        res += "Autor: " + this.autor + "\n";
        res += "Páginas : " + this.numPaginas + "\n";
        res += "Precio: " + this.precio + "\n";
        if (this.prestado) {
            res += "Estado: Prestado\n";
        } else {
            res += "Estado: Disponible\n";
        }
        return res;
    }

}

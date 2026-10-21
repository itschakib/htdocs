
package ejercicios103;
public class Nota {
    private String nombre; // do, re, mi...
    private int duracion;

    public Nota(String nombre, int duracion) {
        this.nombre = nombre.toLowerCase();
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return "[" + nombre + "," + duracion + "]";
    }
}
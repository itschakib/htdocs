package ejercicios113;

public class Gato {

    private String nombre;
    private int edad;

    // Constructor
    public Gato(String nombre, int edad) throws Exception {
        setNombre(nombre);
        setEdad(edad);
    }

    // Getter y Setter nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (nombre == null || nombre.length() < 3) {
            throw new Exception("El nombre debe tener al menos 3 caracteres.");
        }
        this.nombre = nombre;
    }

    // Getter y Setter edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if (edad < 0) {
            throw new Exception("La edad no puede ser negativa.");
        }
        this.edad = edad;
    }

    // toString
    @Override
    public String toString() {
        return "El gatito " + nombre + " tiene " + edad + " años de edad.";
    }
}

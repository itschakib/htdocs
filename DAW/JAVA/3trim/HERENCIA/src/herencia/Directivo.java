package herencia;

public class Directivo extends Empleado {

    public Directivo(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Soy " + getNombre() + "," + "directivo de la empresa" + "\n ";
    }

}

package herencia;

public class Tecnico extends Operario {

    public Tecnico(String nombre, int codigo) {
        super(nombre, codigo);
    }

    @Override
    public String toString() {
        return "Soy el tecnico " + getNombre() + "con el codigo " + getCodigo() + "\n";
    }
}

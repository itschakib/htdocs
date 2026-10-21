package herencia;

public class Oficial extends Operario {

    public Oficial(String nombre, int codigo) {
        super(nombre, codigo);
    }

    @Override
    public String toString() {
        return "Soy el oficial " + getNombre() + "con el codigo " + getCodigo() + "\n";
    }
}

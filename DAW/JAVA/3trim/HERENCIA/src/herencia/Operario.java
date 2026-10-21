package herencia;

public class Operario extends Empleado {

    private int codigo;

    public Operario(String nombre, int codigo) {
        super(nombre);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Soy el operario " + super.getNombre() + "con el codigo " + this.codigo + "\n";
    }
}

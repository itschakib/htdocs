package ejercicios96;

public class Agua extends Congelados {

    double salinidad;

    public Agua(double salinidad, String fechaEnvasado, String origen, double temperatura, String fechaCaducidad, int numLote) {
        super(fechaEnvasado, origen, temperatura, fechaCaducidad, numLote);
        this.salinidad = salinidad;
    }

    @Override
    public String toString() {
        return super.toString() + "Agua{" + "salinidad=" + salinidad + "g/l}" + "\n";
    }

}

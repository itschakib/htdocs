package ejercicios96;

public class Nitrogeno extends Congelados {

    String metodo;
    int tiempoExDeNitrogeno;

    public Nitrogeno(String metodo, int tiempoExDeNitrogeno, String fechaEnvasado, String origen, double temperatura, String fechaCaducidad, int numLote) {
        super(fechaEnvasado, origen, temperatura, fechaCaducidad, numLote);
        this.metodo = metodo;
        this.tiempoExDeNitrogeno = tiempoExDeNitrogeno;
    }

    @Override
    public String toString() {
        return super.toString() + "Nitrogeno{" + "metodo=" + metodo + ", tiempoExDeNitrogeno=" + tiempoExDeNitrogeno + "s }" + "\n";
    }

}

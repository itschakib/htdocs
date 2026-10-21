package ejercicios98;

public class Coche extends Vehiculo {

    protected int velocidad;
    protected int cilindrada;

    public Coche(String color, int ruedas, int velocidad, int cilindrada) {
        super(color, ruedas);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return super.toString()
                + "Coche: velocidad=" + velocidad + ", cilindrada=" + cilindrada + "\n";
    }
}

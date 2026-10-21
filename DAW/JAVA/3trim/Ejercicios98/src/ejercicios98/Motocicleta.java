package ejercicios98;

public class Motocicleta extends Bicicleta {

    protected int velocidad;
    protected int cilindrada;

    public Motocicleta(String color, int ruedas, String tipo, int velocidad, int cilindrada) {
        super(color, ruedas, tipo);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return super.toString()
                + "Motocicleta: velocidad=" + velocidad
                + ", cilindrada=" + cilindrada + "\n";
    }
}

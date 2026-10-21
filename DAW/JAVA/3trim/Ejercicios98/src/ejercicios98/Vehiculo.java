package ejercicios98;

public class Vehiculo {

    protected String color;
    protected int ruedas;

    public Vehiculo(String color, int ruedas) {
        this.color = color;
        this.ruedas = ruedas;
    }

    public int getRuedas() {
        return ruedas;
    }

    @Override
    public String toString() {
        return "Vehiculo: color=" + color + ", ruedas=" + ruedas + "\n";
    }
}

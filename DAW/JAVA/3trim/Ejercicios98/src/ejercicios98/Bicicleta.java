package ejercicios98;

public class Bicicleta extends Vehiculo {

    protected String tipo;

    public Bicicleta(String color, int ruedas, String tipo) {
        super(color, ruedas);

        if (tipo.equalsIgnoreCase("urbana") || tipo.equalsIgnoreCase("deportiva")) {
            this.tipo = tipo.toLowerCase();
        } else {
            this.tipo = "otro";
        }
    }

    public void tocarTimbre() {
        System.out.println("RING RING");
    }

    @Override
    public String toString() {
        return super.toString()
                + "Bicicleta: tipo=" + tipo + "\n";
    }
}

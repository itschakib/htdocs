package ejercicios96;

public class Aire extends Congelados {

    double nitrogeno;
    double oxigeno;
    double dioxidoCarbono;
    double VaporAgua;

    public Aire(String fechaEnvasado, String origen, double temperatura, String fechaCaducidad, int numLote ,double nitrogeno, double oxigeno, double dioxidoCarbono, double VaporAgua) {
        super(fechaEnvasado, origen, temperatura, fechaCaducidad, numLote);
        this.nitrogeno = nitrogeno;
        this.oxigeno = oxigeno;
        this.dioxidoCarbono = dioxidoCarbono;
        this.VaporAgua = VaporAgua;
    }

    @Override
    public String toString() {
        return super.toString() + "Aire{" + "nitrogeno=" + this.nitrogeno + ", O=" + this.oxigeno + ", CO2=" + this.dioxidoCarbono + ", Vapor=" + this.VaporAgua + '}'+"\n";
    }

}

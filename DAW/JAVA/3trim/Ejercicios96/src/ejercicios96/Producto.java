package ejercicios96;


public class Producto {

    String fechaCaducidad;
    int numLote;

    public Producto(String fechaCaducidad, int numLote) {
        this.fechaCaducidad = fechaCaducidad;
        this.numLote = numLote;
    }

    public String getFechaCaducidad() {
        return this.fechaCaducidad;
    }

    public int getNumLote() {
        return this.numLote;
    }

    @Override
    public String toString() {
        return "Producto{" + "Caducidad=" + this.fechaCaducidad + ", Lote=" + this.numLote + '}' + "\n";
    }

}

package ejercicios96;

import ejercicios96.Producto;

public class Congelados extends Producto {

    String fechaEnvasado;
    String origen;
    double temperatura;

    public Congelados(String fechaEnvasado, String origen, double temperatura, String fechaCaducidad, int numLote) {
        super(fechaCaducidad, numLote);
        this.fechaEnvasado = fechaEnvasado;
        this.origen = origen;
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return super.toString() + "Congelados{" + "Envasado=" + this.fechaEnvasado + ", pais=" + this.origen + ", temp=" + this.temperatura + '}'+"\n";
    }

}

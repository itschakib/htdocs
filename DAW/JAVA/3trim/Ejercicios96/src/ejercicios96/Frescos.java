package ejercicios96;

import ejercicios96.Producto;

public class Frescos extends Producto {

    String fechaEnvasado;
    String origen;
    String metodoUsado;

    public Frescos(String fechaEnvasado, String origen, String metodoUsado, String fechaCaducidad, int numLote) {
        super(fechaCaducidad, numLote);
        this.fechaEnvasado = fechaEnvasado;
        this.origen = origen;
        this.metodoUsado = metodoUsado;
    }

    @Override
    public String toString() {
        return super.toString() + "Frescos{" + "Envasado=" + this.fechaEnvasado + ", pais =" + this.origen + ", metodoUsado=" + this.metodoUsado + '}' + "\n";
    }

}

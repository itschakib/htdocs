package ejercicios96;

import ejercicios96.Producto;

public class Refrigerados extends Producto {

    int codigoOrganismo;
    String fechaEnvasado;
    double temperatura;
    String origen;

    public Refrigerados(int codigoOrganismo, String fechaEnvasado, double temperatura, String origen, String fechaCaducidad, int numLote) {
        super(fechaCaducidad, numLote);
        this.codigoOrganismo = codigoOrganismo;
        this.fechaEnvasado = fechaEnvasado;
        this.temperatura = temperatura;
        this.origen = origen;
    }

    @Override
    public String toString() {
        return super.toString() + "Refrigerados{" + "codigo=" + this.codigoOrganismo + ", Envasado=" + this.fechaEnvasado + ", temp=" + this.temperatura + ", pais=" + this.origen + '}'+"\n";
    }

}

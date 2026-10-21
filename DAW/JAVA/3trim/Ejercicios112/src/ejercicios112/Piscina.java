package ejercicios112;

public class Piscina {

    public final int MAXNIVEL;
    private int nivel;

    public Piscina(int tope) {
        if (tope < 0) {
            tope = 0;
        }
        this.MAXNIVEL = tope;
        this.nivel = 0;
    }

    public int getNivel() {
        return this.nivel;
    }

    public void quitarAgua(int cantidad) {
        if (this.nivel - cantidad < 0) {
            throw new IllegalArgumentException("No se puede quitar agua porque no queda");
        }
        this.nivel -= cantidad;
    }

    public void ponerAgua(int cantidad) {
        if (this.nivel + cantidad > this.MAXNIVEL) {
            throw new IllegalArgumentException("No se puede añadir agua porque supera el maximo");
        }
        this.nivel += cantidad;
    }

}


package ejercicios103;

public abstract class Cuerda extends Instrumento {
    protected int numCuerdas;
    protected boolean tipo;

    public Cuerda(String m, int mes, int a, Partitura p, int n, boolean pul) {
        super(m, mes, a, p);
        this.numCuerdas = n;
        this.tipo= pul;
    }
}
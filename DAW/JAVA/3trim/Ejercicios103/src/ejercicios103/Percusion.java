package ejercicios103;

public abstract class Percusion extends Instrumento {

    protected boolean usaBaquetas;

    public Percusion(String m, int mes, int a, Partitura p, boolean b) {
        super(m, mes, a, p);
        usaBaquetas = b;
    }
}

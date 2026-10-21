package ejercicios103;

public abstract class Viento extends Instrumento {

    protected String tipo;

    public Viento(String m, int mes, int a, Partitura p, String t) {
        super(m, mes, a, p);
        tipo = t;
    }
}

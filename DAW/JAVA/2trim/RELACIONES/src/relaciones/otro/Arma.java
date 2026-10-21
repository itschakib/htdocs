package relaciones.otro;

public class Arma {

    private String nombre;
    private int resistencia;
    private int poder;

    public Arma(String nombre, int resistencia, int poder) {
        this.nombre = nombre;
        this.resistencia = resistencia;
        this.poder = poder;
    }
    public int getPoder(){
        return poder;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    @Override
    public String toString() {
        return "Arma{" + "nombre=" + nombre + ", resistencia=" + resistencia + ", poder=" + poder + '}';
    }

}

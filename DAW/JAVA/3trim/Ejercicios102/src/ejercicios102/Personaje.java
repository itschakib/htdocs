package ejercicios102;

public abstract class Personaje {

    private String nombre;
    private int nivel;

    public Personaje(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public void subirNivel() {
        this.nivel++;
    }

    public abstract String tipoPersonaje();

    @Override
    public String toString() {
        return "Personaje: " + "nombre =" + this.nombre + " - nivel =" + this.nivel;
    }

}

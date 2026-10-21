package ejercicios102;

public abstract class Ofensivo extends Personaje {

    private int ataque;
    private int defensa;

    public Ofensivo(String nombre, int nivel, int ataque, int defensa) {
        super(nombre, nivel);
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public void entrenar(int puntos) {
        this.ataque += puntos;
        this.defensa += puntos;
    }

    public abstract int calcularDanio();

    public int getAtaque() {
        return this.ataque;
    }

    public int getDefensa() {
        return this.defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + " Ataque: " + this.ataque + " – Defensa: " + this.defensa;
    }
}

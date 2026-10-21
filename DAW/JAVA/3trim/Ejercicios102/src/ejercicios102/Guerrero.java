package ejercicios102;

public class Guerrero extends Ofensivo {

    String arma;
    int fuerza;

    public Guerrero(String nombre, int nivel, int ataque, int defensa, String arma, int fuerza) {
        super(nombre, nivel, ataque, defensa);
        this.arma = arma;
        this.fuerza = fuerza;
    }

    @Override
    public String tipoPersonaje() {
        return "Soy un Guerrero";
    }

    @Override
    public int calcularDanio() {
        return this.getAtaque() + this.fuerza;
    }

    public void gritoGuerra() {
        this.fuerza += 3;
        setDefensa(getDefensa() - 4);
    }

    @Override
    public String toString() {
        return "GUERRERO" + "\n"
                + super.toString() + " – Fuerza: " + this.fuerza;
    }
}

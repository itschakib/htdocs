package ejercicio99;

public abstract class Personaje {

    protected String nombre;
    protected int posX;
    protected int posY;
    protected double vida;
    protected double escudo;
    protected double ataque;

    public Personaje(String nombre, int posX, int posY, double vida, double escudo, double ataque) {
        this.nombre = nombre;
        this.posX = Math.max(0, posX);
        this.posY = Math.max(0, posY);
        this.vida = vida;
        this.escudo = escudo;
        this.ataque = ataque;
    }

    public void desplazarse(int x, int y) {
        posX = Math.max(0, posX + x);
        posY = Math.max(0, posY + y);
    }

    public void atacar(Personaje enemigo) {
        double dano = this.ataque;

        if (enemigo.escudo > 0) {
            if (enemigo.escudo >= dano) {
                enemigo.escudo -= dano;
            } else {
                double resto = dano - enemigo.escudo;
                enemigo.escudo = 0;
                enemigo.vida -= resto;
            }
        } else {
            enemigo.vida -= dano;
        }

        if (enemigo.vida < 0) enemigo.vida = 0;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nPosición: (" + posX + "," + posY + ")" +
                "\nVida: " + vida +
                "\nEscudo: " + escudo +
                "\nAtaque: " + ataque + "\n";
    }
}
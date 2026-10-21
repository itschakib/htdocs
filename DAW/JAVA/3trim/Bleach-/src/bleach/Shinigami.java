
package Bleach;

public abstract class Shinigami {
    
    protected String nombre;
    protected String origen;
    protected int edad;
    private Zanpakuto espada;
    public double vida;
    public double poder;

    public Shinigami(String nombre, String origen, int edad, Zanpakuto espada) {
        this.nombre = nombre;
        this.origen = origen;
        this.edad = edad;
        this.espada = espada;
        this.vida = 1500;
        this.poder = (double) (Math.random() * (50 - 5 + 1) + 5);
    }
    
    public abstract void invocarBankai();
    
    public abstract void pelear(Shinigami rival);

    public Zanpakuto getEspada() {
        return espada;
    }
    
    public String toString() {
        String res = "";
        res = this.nombre + "[vida: " + this.vida + ", poder: " + this.poder + "]\n";
        res += this.espada;
        return res;
    }
}

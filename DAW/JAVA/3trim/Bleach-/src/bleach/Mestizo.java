
package Bleach;

public abstract class Mestizo extends Shinigami {
    
    double hollow;
    double quincy;

    public Mestizo(String nombre, String origen, int edad, Zanpakuto espada, double quincy) {
        super(nombre, origen, edad, espada);
        this.hollow = (double) (Math.random() * (50 - 10 + 1) + 10);
        this.quincy = 50 - quincy;
    }
    
    
}

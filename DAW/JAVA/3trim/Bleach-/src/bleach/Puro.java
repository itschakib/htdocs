
package Bleach;

public abstract class Puro extends Shinigami{
    
    int escuadron;

    public Puro(int escuadron, String nombre, String origen, int edad, Zanpakuto espada) {
        super(nombre, origen, edad, espada);
        if (escuadron < 1 || escuadron > 13) {
            this.escuadron = (int) (Math.random() * (13 - 1 + 1) + 1);
        }
        else {
            this.escuadron = escuadron;
        }
    }

    public int getEscuadron() {
        return escuadron;
    }
    
    public void shunpo() {
        System.out.println(this.nombre + " se ha desplazado usando shunpo");
    }
    
    
}

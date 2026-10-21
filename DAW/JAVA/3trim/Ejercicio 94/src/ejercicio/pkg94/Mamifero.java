package ejercicio.pkg94;

public class Mamifero {

    int numPatas;
    double vida;

    public Mamifero(int numPatas, double vida) {
        this.numPatas = numPatas;
        this.vida = vida;
    }

    public String comunicarse() {
        return "";
    }

    public void dormir() {
        System.out.println("Un mamífero duerme 8 horas");
    }

    @Override
    public String toString() {
        return "Mamifero con " + this.numPatas + " patas y " + this.vida + " años de vida";

    }

}

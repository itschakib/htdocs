package ejercicio.pkg94;

public class Gato extends Mamifero {

    String pelaje;
    String nombre;

    public Gato(String nombre,int numPatas,double vida) {
        super(numPatas, vida);
        this.nombre = nombre;
        this.pelaje = "corto";
    }

    public String getpelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        if (pelaje.equalsIgnoreCase("corto") || pelaje.equalsIgnoreCase("largo") || pelaje.equalsIgnoreCase("semilargo")) {
            this.pelaje = pelaje.toLowerCase();
        } else {
            System.out.println("Pelaje no valido se vuelvo el valor original que es corto");
        }
    }

    public String comunicarse() {
        return "miauu";
    }

    public void dormir() {
        System.out.println("Un mamifero duerme 15 horas");
    }

    public void cazar() {
        System.out.println("Mi gato de " + this.numPatas + " patas est cazando");
    }

    @Override
    public String toString() {
        return "Gato " + this.nombre + " con pelaje " + this.pelaje + ", " + this.numPatas + " patas y " + this.vida + " años de vida";
    }

}

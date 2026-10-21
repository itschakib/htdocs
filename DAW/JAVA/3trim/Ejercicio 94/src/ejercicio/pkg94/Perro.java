package ejercicio.pkg94;

import ejercicio.pkg94.Mamifero;

public class Perro extends Mamifero {

    String raza;
    String nombre;
    boolean mezcla;

    public Perro(String raza, String nombre,int numPatas,double vida) {
        super(numPatas, vida);
        this.nombre = nombre;
        this.raza = raza;
        this.mezcla = false;

    }

    public String comunicarse() {
        return "ladrido";
    }

    public void dormir() {
        System.out.println("Un mamifero duerme 18 horas");
    }

    public void jugar() {
        System.out.println(this.nombre + " esta jugando");
    }

    public boolean isMezcla() {
        return mezcla;
    }

    public boolean getMezcla() {
        return mezcla;
    }

    public void setMezcla(boolean mezcla) {
        this.mezcla = mezcla;
    }

    @Override
    public String toString() {
        return "Perro " + nombre + " de raza " + raza + " mezcla: " + mezcla;
    }

}

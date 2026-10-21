package ejercicio76;

public class Monstros {

    String nombre;
    int esfuerzo;
    int hambre;
    int vidas;
    boolean vivo = true;
    final private int fuerza_final = 10;

    public Monstros(String nombre) {
        this.nombre = nombre;
        this.esfuerzo = fuerza_final;
        this.hambre = 3;
        this.vidas = 7;
        this.vivo = true;
    }

    public Monstros() {
        this.nombre = "pepe";
    }

    public void revisar() {
        if (esfuerzo <= 0 || hambre <= 0) {
             System.out.println("haz perdido una vida");
            vidas--;
            if (vidas > 0) {
                esfuerzo = fuerza_final;
                hambre = 3;
            } else {
                vivo = false;
                System.out.println("El monstro esta muerto");
                esfuerzo = hambre = vidas = -1;
            }
        }
    }

    public void jugar() {
        if (!vivo) {
            System.out.println("esta muerto no puede jugar");
            return;
        }
        esfuerzo -= 3;
        hambre -= 1;
        revisar();
    }

    public void comunicar() {
        if (!vivo) {
            System.out.println("esta muerto no puede communicar");
            return;
        }
        esfuerzo -= 1;
        revisar();
    }

    public void dormir() {
        if (!vivo) {
            System.out.println("esta muerto cabron");
            return;
        }
        esfuerzo += 5;
        if (esfuerzo > fuerza_final) {
            esfuerzo = fuerza_final;
        }
    }

    public void comer(boolean comidaFavorita) {
        if (!vivo) {
            System.out.println("Esta muerto");
            return;
        }
        esfuerzo -= 2;
        if (comidaFavorita) {
            hambre += 3;
        } else {
            hambre += 2;
        }
        if (hambre > 3) {
            hambre = 3;
        }
        revisar();
    }

    @Override
    public String toString() {
        String res = "";
        res += "Nombre : " + this.nombre + "\n";
        res += "Hambre : " + this.hambre + "\n";
        res += "Vidas : " + this.vidas + "\n";

        if (vivo) {
            res += "El monstro esta vivo" + "\n";
        } else {
            res += "El monstro no esta vivo" + "\n";
        }

        return res;
    }
}

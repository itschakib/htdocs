package relaciones;

import relaciones.otro.Arma;

public class Guerrero {

    String nombre;
    int saludMAX;
    int fuerza;
    int escudo;
    private int saludActual;
    boolean vivo;
    Arma weapon;

    public Guerrero(String nombre, int saludMAX, int fuerza, int escudo, Arma padillo) {
        this.nombre = nombre;
        this.saludMAX = saludMAX;
        this.fuerza = fuerza;
        this.escudo = escudo;
        this.saludActual = saludMAX;
        this.vivo = true;
        this.weapon = padillo;
    }

    public void atacar(Guerrero defensor) {
        if (this.vivo) {
            int danio = this.fuerza + this.weapon.getPoder() - defensor.escudo;
            defensor.saludActual -= danio;
//quito punto de res al arma
            int resTemporal = this.weapon.getResistencia();
            this.weapon.setResistencia(resTemporal - 1);
            if (defensor.saludActual <= 0) {
                defensor.vivo = false;
            }
        } else {
            System.out.println(this.nombre + "esta morid.....");
        }
    }

    @Override
    public String toString() {
        return "Guerrero{" + "nombre=" + nombre + ", saludMAX=" + saludMAX + ", fuerza=" + fuerza + ", escudo=" + escudo + ", saliudActual=" + saludActual + '}';
    }

}

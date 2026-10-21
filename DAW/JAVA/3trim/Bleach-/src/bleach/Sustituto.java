package Bleach;

public abstract class Sustituto extends Mestizo {

    String zonaAsignada;

    public Sustituto(String zonaAsignada, String nombre, String origen, int edad, Zanpakuto espada, double quincy) {
        super(nombre, origen, edad, espada, quincy);
        this.zonaAsignada = zonaAsignada;
    }

    public void vigilar() {
        System.out.println(this.nombre + " sustituto vigila " + this.zonaAsignada);
    }

    @Override
    public void invocarBankai() {

        this.getEspada().bankai(this.hollow / 10, 2);
    }

    @Override
    public void pelear(Shinigami rival) {
        if (rival instanceof Sustituto) {
            rival.vida -= Math.abs(this.getEspada().getAtaque() - rival.getEspada().getResistencia());
        }
        /* 
        else of(rival instance oo)
        */
    }

    @Override
    public String toString() {
        return "Shinigami { zonaAsignada   " + this.zonaAsignada + "  " + super.toString();
    }

}

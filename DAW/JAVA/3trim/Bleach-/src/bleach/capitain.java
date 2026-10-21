package bleach;

import Bleach.Puro;
import Bleach.Shinigami;
import Bleach.Sustituto;
import Bleach.Zanpakuto;

public class capitain extends Puro {

    public capitain(int escuadron, String nombre, String origen, int edad, Zanpakuto espada) {
        super(escuadron, nombre, origen, edad, espada);
    }

    @Override
    public void invocarBankai() {
        double at = this.getEscuadron() * 1.5;
        this.getEspada().bankai(at, 2);
    }

    @Override
    public void pelear(Shinigami rival) {
        double danio = this.getEspada().getAtaque() - rival.getEspada().getResistencia();
        if (rival instanceof Teniente) {
            danio += this.poder;
        } else {
            danio -= rival.poder;
        }
        rival.vida = Math.abs(danio);
    }

    @Override
    public String toString() {
        return "capitain{" + '}';
    }

}

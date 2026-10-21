
package bleach;

import Bleach.Puro;
import Bleach.Shinigami;
import Bleach.Sustituto;
import Bleach.Zanpakuto;

public class Teniente extends Puro {

    public Teniente(int escuadron, String nombre, String origen, int edad, Zanpakuto espada) {
        super(escuadron, nombre, origen, edad, espada);
    }
  @Override
    public void invocarBankai() {
        System.out.println(this.nombre  + " aun no puede invocar su bankai");
    }

    @Override
    public void pelear(Shinigami rival) {
        if (rival instanceof Sustituto) {
            rival.vida -= Math.abs(this.getEspada().getAtaque() - rival.getEspada().getResistencia());
        }
        else {
              rival.vida += Math.abs(this.getEspada().getAtaque() - rival.getEspada().getResistencia()+rival.poder);
        }
    }
    @Override
    public String toString() {
        return "Teniente{" + '}';
    }
    
}

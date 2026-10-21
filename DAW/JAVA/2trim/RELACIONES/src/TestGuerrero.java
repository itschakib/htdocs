
import relaciones.Guerrero;
import relaciones.otro.Arma;

public class TestGuerrero {

    public static void main(String[] args) {
        Arma espada = new Arma("Machete", 10, 15);
        Guerrero diego = new Guerrero("El matador ", 100, 40, 75, espada);

    }

}

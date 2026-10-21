
package rolita;

/**
 *
 * @author Chaki
 */
public class Jugador {
    private String nombre;
    private boolean vivo;
    private Revolver revolver;

    public Jugador(String nombre, Revolver revolver) {
        this.nombre = nombre;
        this.vivo = true;
        this.revolver = revolver; // Se le pasa el revólver del juego
    }

    public void disparar() {
        System.out.println("El jugador " + nombre + " se apunta a la cabeza y aprieta el gatillo...");
        
        // El jugador dispara SU revolver (que es el compartido)
        if (revolver.dispararRevolver()) {
            this.vivo = false;
            System.out.println("-> ¡BANG! El jugador " + nombre + " ha muerto.");
        } else {
            System.out.println("-> *Click*... ¡Uf! El jugador " + nombre + " sigue vivo.");
        }
    }

    public boolean isVivo() {
        return vivo;
    }

    public String getNombre() {
        return nombre;
    }

}

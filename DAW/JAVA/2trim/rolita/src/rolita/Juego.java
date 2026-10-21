/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rolita;

/**
 *
 * @author Chaki
 */
public class Juego {

    private Revolver revolver;
    private Jugador[] jugadores;

    public Juego(Revolver revolver, int numJugadores) {
        this.revolver = revolver;

        // Validamos que los jugadores no superen el tambor
        if (numJugadores > revolver.getCapacidadTambor()) {
            System.out.println("Demasiados jugadores. Se ajustará al tamaño del tambor.");
            numJugadores = revolver.getCapacidadTambor();
        }

        this.jugadores = new Jugador[numJugadores];

        // Creamos los jugadores y les pasamos la referencia del MISMO revólver
        for (int i = 0; i < numJugadores; i++) {
            jugadores[i] = new Jugador("Jugador " + (i + 1), revolver);
        }
    }

    public boolean finJuego() {
        for (Jugador j : jugadores) {
            if (!j.isVivo()) {
                return true; // Si hay al menos un muerto, devuelve true
            }
        }
        return false; // Todos siguen vivos
    }

    // MODO A: Se disparan todos en la ronda y al final se comprueba
    public void rondaModoA() {
        System.out.println("\n--- INICIO DE RONDA (MODO A) ---");
        System.out.println(revolver.toString()); // Chivato para ver dónde está la bala

        for (Jugador j : jugadores) {
            j.disparar();
        }

        System.out.println("--- FIN DE RONDA ---");
        if (finJuego()) {
            System.out.println("¡El juego ha terminado! Alguien ha muerto.");
        } else {
            System.out.println("Todos han sobrevivido a esta ronda. Pasad el revólver.");
        }
    }

    // MODO B: Se disparan por orden y para de inmediato si alguien muere
    public void rondaModoB() {
        System.out.println("\n--- INICIO DE RONDA (MODO B) ---");
        System.out.println(revolver.toString()); // Chivato

        for (Jugador j : jugadores) {
            j.disparar();
            // Comprobamos inmediatamente después de cada disparo
            if (!j.isVivo()) {
                System.out.println("¡Juego terminado inmediatamente! " + j.getNombre() + " no tuvo suerte.");
                break; // Rompe el bucle, los demás se salvan
            }
        }
    }

}

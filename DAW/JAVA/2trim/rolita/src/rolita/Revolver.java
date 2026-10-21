package rolita;

/**
 *
 * @author Chaki
 */
public class Revolver {

    private String marca;
    private String modelo;
    private int posicionActual;
    private int posicionBala;
    private int capacidadTambor;
    private Bala bala;

    // Constructor sobrecargado
    public Revolver(String marca, String modelo, int capacidadTambor) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadTambor = capacidadTambor;

        // Posiciones aleatorias entre 0 y (capacidadTambor - 1)
        this.posicionActual = (int) (Math.random() * capacidadTambor);
        this.posicionBala = (int) (Math.random() * capacidadTambor);

        // Colocamos UNA bala con su constructor por defecto
        this.bala = new Bala();
    }

    public boolean dispararRevolver() {
        boolean exito = false;
        if (posicionActual == posicionBala) {
            exito = true; // ¡BANG!
        }

        // El tambor siempre avanza después de apretar el gatillo
        moverTambor();

        return exito;
    }

    public void moverTambor() {
        // Al usar módulo (%), si la posición es 5 y la capacidad 6: (5+1)%6 = 0. Vuelve al inicio.
        posicionActual = (posicionActual + 1) % capacidadTambor;
    }

    public int getCapacidadTambor() {
        return capacidadTambor;
    }

    @Override
    public String toString() {
        return "Revólver " + marca + " " + modelo
                + " [Posición Martillo: " + posicionActual
                + ", Posición Bala: " + posicionBala + "]";
    }
}

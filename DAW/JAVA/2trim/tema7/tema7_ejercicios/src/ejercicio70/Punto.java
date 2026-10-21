package ejercicio70;

public class Punto {

    int X;
    int Y;

    public Punto(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }

    public void moverHorizontal(int cantidad) {
        this.X += cantidad;
    }

    public void moverVertical(int cantidad) {
        this.Y += cantidad;
    }

    public void mostrar() {
        System.out.println("Punto (" + this.X + ", " + this.Y + ")");
    }

}

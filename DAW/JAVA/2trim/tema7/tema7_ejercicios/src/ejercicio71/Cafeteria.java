package ejercicio71;


public class Cafeteria {

    int capacidadMaxima;
    int cantidadActual;

    public Cafeteria() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }

    public void echarCafe(int cantidad) {
        if (this.cantidadActual + cantidad > this.capacidadMaxima) {
            this.cantidadActual = this.capacidadMaxima;
        } else {
            this.cantidadActual += cantidad;
        }
    }

    public void llenarCafetera() {
        this.cantidadActual = this.capacidadMaxima;
    }

    public void vaciarCafetera() {
        cantidadActual = 0;
    }

    public void servirTaza(int capacidadTaza) {
        if (cantidadActual >= capacidadTaza) {
            cantidadActual -= capacidadTaza;
        } else {
            System.out.println("No hay suficiente café para llenar la taza");
            cantidadActual = 0;
        }
    }

    public void cantidadCafe() {
        System.out.println("Quedan " + cantidadActual + " cc de café en la cafetera.");
    }
}

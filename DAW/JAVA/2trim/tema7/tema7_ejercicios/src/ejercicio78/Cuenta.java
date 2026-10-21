package ejercicio78;

public class Cuenta {

    private String titular;
    private double cantidad;

    public Cuenta(String titulor ){
        this.titular = titular;
        this.cantidad = 0;
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresar(double nuevoCantidad) {
        if (nuevoCantidad > 0) {
            this.cantidad += nuevoCantidad;
        } else {
            System.out.println("No se puede prq el cantidad introduzca es negativa");
        }
    }

    public void retirar(double nuevoCantidad) {
        if (nuevoCantidad < cantidad) {
            this.cantidad -= nuevoCantidad;
        } else {
            System.out.println("No hay suficiente dinero");
        }
    }

    @Override
    public String toString() {
        String res = "";
        res += "Esta cuenta pertenece a " + this.titular + "y pose actualmente una cantidad de " + this.cantidad + " € " + "\n";
        return res;
    }
}

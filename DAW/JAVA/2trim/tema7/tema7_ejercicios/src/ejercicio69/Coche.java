package ejercicio69;

public class Coche {

    String color;
    double anchura, altura;
    int numDpuertas;
    int numDruedas;
    boolean arrancado;
    int gasolina;
    final int MAXGASOLINA = 50;

    public Coche(String color, double anchura, double altura, int numDpuertas) {
        this.color = color;
        this.anchura = anchura;
        this.altura = altura;
        this.numDpuertas = numDpuertas;
        this.numDruedas = 4;
        this.arrancado = false;
        this.gasolina = this.MAXGASOLINA;
    }

    public void arrancar() {
        if (!this.arrancado && chequear()) {
            this.arrancado = true;
            if (this.gasolina >= 5) {
                this.gasolina -= 5;
                System.out.println("El coche ha arrancado y queda de gasolina " + this.gasolina);
            } else {
                System.out.println("No hay suficiente gasolina para arrancar (minimo 5)");
            }
        } else {
            System.out.println("El coche ya está arrancado.");
        }
    }

    public void parar() {
        if (this.arrancado) {
            this.arrancado = false;
            System.out.println("El coche se ha parado.");
        } else {
            System.out.println("El coche ya está parado.");
        }
    }

    public void desplazarse() {
        if (this.arrancado) {
            if (this.gasolina >= 20) {
                this.gasolina -= 20;
                System.out.println("El coche se desplaza  ,  Gasolina: " + this.gasolina);
            } else {
                System.out.println("No hay suficiente gasolina para desplazarse (minimo 20)");

            }
        } else {
            System.out.println("No se puede desplazar porque el coche está apagado.");
        }
    }

    public void echarGasolina(int cantidad) {
        this.parar();
        this.gasolina = cantidad;
        if (this.gasolina > this.MAXGASOLINA) {
            this.gasolina = this.MAXGASOLINA;
        }
        System.out.println("Gasolina actual: " + gasolina);
    }

    //verdado con gasolina
    public boolean chequear() {
        return gasolina > 0;
    }

    public void pintar(String nuevoColor) {
        color = nuevoColor;
        System.out.println("Coche pintado de " + color);
    }

    @Override
    public String toString() {
        String res = "";

        res += "Coche : \n";
        res += "color : " + this.color + "\n";
        res += "Anchura :" + this.anchura + "\n";
        res += "Altura : " + this.altura + "\n";
        res += "puertas=" + this.numDpuertas + "\n";
        res += "ruedas=" + this.numDruedas + "\n";
        res += "arrancado=" + this.arrancado + "\n";
        res += "gasolina=" + this.gasolina + "\n";

        if (this.arrancado) {
            res += "el coche esta encendido";
        } else {
            res += "el coche esta apagado";
        }
        res += "\n";
        return res;
    }
}

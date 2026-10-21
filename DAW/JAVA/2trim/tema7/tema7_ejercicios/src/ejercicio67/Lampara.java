package ejercicio67;

public class Lampara {

    String modelo;
    String color;
    int bombillas;
    double potencia;
    boolean encendida;

    public Lampara(String color, String modelo, int bombillas, double potencia) {
        System.out.println("LAMPARA");
        System.out.println("----------");
        this.color = color;
        this.modelo = modelo;
        this.bombillas = bombillas;
        this.potencia = potencia;
        this.encendida = false;

    }

    public void encender() {
        if (!this.encendida) {
            this.encendida = true;
            System.out.println("Encendiendo lampara ...");
        }
    }

    public void apagar() {
        if (this.encendida) {
            this.encendida = false;
            System.out.println("Apagando lampara . . .");
        }
    }

    public void monstrarInfo() {
        System.out.println("LAMPARA");
        System.out.println("----------");
        System.out.println("Modelo : " + this.modelo);
        System.out.println("color : " + this.color);
        System.out.println("potencia : " + this.potencia);
        System.out.println(this.bombillas + "bombillas");
        String estado;
        if (this.encendida) {
            estado = "encendida. ";
        } else {
            estado = "apagada. ";
        }
    }
}

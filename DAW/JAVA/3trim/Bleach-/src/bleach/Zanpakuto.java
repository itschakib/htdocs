package Bleach;

public class Zanpakuto {

    private String nombre;
    private double anchura;
    private double altura;
    private boolean estado; //T- Shikai, F- Bankai
    private double ataque;
    private double resistencia;

    final private double ataqueOriginal,resistenciaOriginal;   

    public Zanpakuto(String nombre, double anchura, double altura) {
        this.nombre = nombre;
        this.anchura = anchura;
        this.altura = altura;
        this.ataque = (int) (Math.random() * (25 - 2 + 1) + 2);
        this.resistencia = (int) (Math.random() * (150 - 70 + 1) + 70);
        this.estado = true;
        this.resistenciaOriginal = this.resistencia;
        this.ataqueOriginal = this.ataque;
    }

    public void bankai(double mulAtaque, double mulResistencia) {
        this.ataque *= mulAtaque;
        this.resistencia *= mulResistencia;
        this.estado = false;
    }

    public void shikai() {
        this.ataque = this.ataqueOriginal;
        this.resistencia = this.resistenciaOriginal;
        this.estado = true;
    }

    public double getResistencia() {
        return resistencia;
    }

    public double getAtaque() {
        return ataque;
    }

    public String toString() {
        String res = "";
        res = this.nombre + " [atq: " + this.ataque + ", res: " + this.resistencia + "] ";
        if (this.estado) {
            res += "shikai";
        } else {
            res += "bankai";
        }
        return res;
    }

}

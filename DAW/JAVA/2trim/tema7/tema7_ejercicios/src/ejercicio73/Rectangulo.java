package ejercicio73;

public class Rectangulo {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.altura = altura;
        this.base = base;
    }

    public double calcularArea() {
       return altura * base;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
@Override
public String toString() {
    return  "-----------------------------------------\n" +
               "Rectángulo con base " + base + " y altura " + altura + "\n" +
               "Área: " +  calcularArea() + "\n" +
               "Perímetro: " + calcularPerimetro() + "\n" +
               "-----------------------------------------";
}
}

package ejercicio74;

public class Aritmetica {

    double a, b;

    public Aritmetica(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double sumar() {
        return a + b;
    }

    public double restar() {
        return a - b;
    }

    public double multiplicar() {
        return a * b;
    }

    public double divisir() {
        return a / b;
    }

    public double potencia() {
        return Math.pow(a, b);

    }
}

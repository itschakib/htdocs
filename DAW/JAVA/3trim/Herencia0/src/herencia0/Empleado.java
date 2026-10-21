package herencia0;

public class Empleado extends Persona {

    private int codEmpleado;

    public Empleado(int codEmpleado, String lavacalola, int edad, String dni, double altura) {
        super(lavacalola, edad, dni, altura);
        this.codEmpleado = codEmpleado;
    }

    public void trabajar() {
        System.out.println(this.nombre + " empleado numero :  " + this.codEmpleado + "esta hablando ....");
    }

}

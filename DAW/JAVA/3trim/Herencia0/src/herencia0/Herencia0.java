package herencia0;

public class Herencia0 {

    public static void main(String[] args) {
        Empleado pepe = new Empleado(2, "amparo", 23, "456984185H", 1.68);
        System.out.println(pepe.nombre);
        System.out.println(pepe.edad);
        System.out.println("");
        System.out.println(pepe.getDni());
        pepe.hablar();
    }

}

package ejercicio70;

public class Main {

    public static void main(String[] args) {

        Punto p = new Punto(3, 5);

        p.mostrar(); // Punto (3,5)

        p.moverHorizontal(2); // X ahora vale 5
        p.moverVertical(-3);  // Y ahora vale 2

        p.mostrar(); // Punto (5,2)

    }

}

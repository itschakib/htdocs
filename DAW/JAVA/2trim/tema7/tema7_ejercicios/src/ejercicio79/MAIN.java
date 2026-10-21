package ejercicio79;

public class MAIN {

    public static void main(String[] args) {
        int blancas = (int) (Math.random() * 10) + 1;
        int negras = (int) (Math.random() * 10) + 1;

        Urna u = new Urna(blancas, negras);
        System.out.println("Uran creada con " + blancas + " bolas blancas y " + negras + " bolas negras");

        while (u.totalBolas() > 1) {

            char b1 = u.extaer();
            char b2 = u.extaer();

            System.out.println("Se ha extraido una bola " + b1);
            System.out.println("Se ha extraido una bola " + b2);

            if (b1 == b2) {
                u.meter('B');
                System.out.println("Se ha metido una bola BLANCA ");
            } else {
                u.meter('N');
                System.out.println("Se ha metido una bola NEGRA ");
            }

            System.out.println(u);
        }

        char ultima = u.extaer();
        System.out.println("BOLA FINAL: " + ultima);
    }

}

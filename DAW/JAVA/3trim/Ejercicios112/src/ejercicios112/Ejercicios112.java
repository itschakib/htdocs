package ejercicios112;

public class Ejercicios112 {

    public static void main(String[] args) {

        // piscina con capacidad entre 1 y 100
        int R = 1 + (int) (Math.random() * 100);
        Piscina piscina = new Piscina(R);

        System.out.println("Capacidad maxima: " + R);
        System.out.println("Nivel inicial: " + piscina.getNivel());

        System.out.println("****************llenando/ vaciar  la piscina**************");

        for (int i = 0; i < 10; i++) {

            int C = 1 + (int) (Math.random() * 25);

            try {
                if (i < 5) {
                    piscina.ponerAgua(C);
                    System.out.println("LLENAR " + (i + 1)+ " | + " + C+ " litros | Nivel: " + piscina.getNivel());
                } else {
                    piscina.quitarAgua(C);
                    System.out.println("VACIAR " + (i - 4)+ " | - " + C+ " litros | Nivel: " + piscina.getNivel());
                }

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

package ejercicio76;

public class Main {

    public static void main(String[] args) {

        System.out.println("*****Inicio******");
        Monstros m = new Monstros("KING Kong");
        System.out.println(m);

        System.out.println("*****Revisar******");
        m.revisar();
        System.out.println(m);

        System.out.println("*****Jugar******");
        m.jugar();
        System.out.println(m);

        System.out.println("*****Communicar******");
        m.comunicar();
        System.out.println(m);

        System.out.println("*****Commer******");
        m.comer(true);
        System.out.println(m);

        System.out.println("*****Dormir******");
        m.dormir();
        System.out.println(m);

        System.out.println("Incio2");
        Monstros m2 = new Monstros();
        System.out.println(m2);
        System.out.println(m2.nombre);
    }

}

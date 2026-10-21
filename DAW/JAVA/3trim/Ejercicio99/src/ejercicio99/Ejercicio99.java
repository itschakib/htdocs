package ejercicio99;

public class Ejercicio99 {

    public static void main(String[] args) {
        Habilidad h1 = new Habilidad("Fuego", 'Q');
        Habilidad h2 = new Habilidad("Hielo", 'W');

        Campeon c1 = new Campeon("Aatrox", "Tanque", h1);
        Minion m1 = new Minion("Melee");

        System.out.println("***************CAMPEON***************");
        System.out.println(c1);

        System.out.println("***************MINION***************");
        System.out.println(m1);

        System.out.println("*************** COMBATE***************");
        c1.atacar(m1);

        System.out.println("Minion despues del ataque:");
        System.out.println(m1);

        System.out.println("*************** SUBIR NIVEL CAMPEON*************** ");
        c1.subirNivel(h2);

        System.out.println(c1);
    }

}

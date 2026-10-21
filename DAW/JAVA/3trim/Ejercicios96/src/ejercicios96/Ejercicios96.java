package ejercicios96;

public class Ejercicios96 {

    public static void main(String[] args) {
        Frescos f = new Frescos("01/05/2026", "España", "Refrigeración", "10/05/2026", 1);


        Refrigerados r = new Refrigerados( 2,"02/05/2026", 4.5  , "Francia" , "15/05/2026",123);

        Aire ca = new Aire("20/06/2026", "Italia", -10 ,"01/04/2026", 3,78, 21, 0.04, 1);

        Agua cg = new Agua(35, "25/04/2026", "Portugal", -8,"02/06/2026", 4);

       Nitrogeno cn = new Nitrogeno("Ultra rápido", 120,  "03/04/2026" , "Alemania", -20 , "30/06/2026", 5);

        System.out.println(f.toString());
        System.out.println(r.toString());
        System.out.println(ca.toString());
        System.out.println(cg.toString());
        System.out.println(cn.toString());

    }

}

package ejercicio80;

public class MAIN {

    public static void main(String[] args) {
        // un estudiante por 5 notas
        Estudiante e = new Estudiante("Juan", "Perez", 5);

        // Intramos los puntos
        e.InsertNotas(4.5);
        e.InsertNotas(6.0);
        e.InsertNotas(8.0);
        e.InsertNotas(9.5);

        // monstrar datos
        System.out.println(e);

        // un estudiante por 5 notas
        Estudiante e2 = new Estudiante("Antonio", "Marfil", 10);

        //inrtramos los puntos
        double[] Notas2 = {5.0, 2.3, 5.9, 4.6, 6.5, 9.7, 8.1, 9.4, 7.4};

        for (int i = 0; i < Notas2.length; i++) {
            e2.InsertNotas(Notas2[i]);
        }

        // monstrar datos
        System.out.println(e2);

    }

}

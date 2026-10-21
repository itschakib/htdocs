package ejercicio97;

public class Profesor {

    private String nombre;
    protected Asignatura[] asignaturas;
    protected int horasTotales;
    protected boolean enClase;

    public Profesor(String nombre, int total) {
        this.nombre = nombre;
        this.asignaturas = new Asignatura[total];
        this.horasTotales = 0;
        this.enClase = false;

        int num = (int) (Math.random() * total) + 1;

        for (int i = 0; i < num; i++) {
            int codigo = (int) (Math.random() * 101) + 100;//100-200
            int horas = (int) (Math.random() * 6) + 3;//3-8

            asignaturas[i] = new Asignatura(codigo, horas);
            horasTotales += horas;
        }
    }

    public void empezarClase() {
        if (!this.enClase) {
            int i;
            do {
                i = (int) (Math.random() * asignaturas.length);
            } while (asignaturas[i] == null);
            this.enClase = true;
            System.out.println(nombre + " da clase de " + asignaturas[i].codigo);
        }
    }

    public void parar() {
        if (this.enClase) {
            this.enClase = false;
            System.out.println(nombre + " termina la clase");
        }
    }

    @Override
    public String toString() {
        String res = "";
        res += this.nombre + "\n";
        for (Asignatura a : asignaturas) {
            if (a != null) {
                res += a + "\n";
            }
        }
        res += "Horas: " + this.horasTotales + "\n";
        res += "En clase: " + this.enClase;

        return res;
    }

}

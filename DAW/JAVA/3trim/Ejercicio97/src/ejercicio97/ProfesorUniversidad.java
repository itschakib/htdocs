package ejercicio97;

public class ProfesorUniversidad extends Profesor {

    protected boolean puedeInvestigar;
    protected int horasInv;
    protected boolean investigando;

    public ProfesorUniversidad(String nombre, int total, int horasInv) {
        super(nombre, total);

        if (horasTotales >= 8) {
            puedeInvestigar = true;
            this.horasInv = horasInv;
        } else {
            puedeInvestigar = false;
            this.horasInv = 0;
        }

        investigando = false;
    }

    public void investigar() {
        if (puedeInvestigar && !enClase && !investigando) {
            investigando = true;
            System.out.println("Investigando...");
        }
    }

    public void pararInvestigar() {
        if (investigando) {
            investigando = false;
        }
    }

    public void cogerAsignatura(Asignatura a) {
        int pos = -1;

        for (int i = 0; i < asignaturas.length; i++) {
            if (asignaturas[i] == null) {
                pos = i;
                break;
            }
        }

        if (pos != -1 && horasTotales + a.horasSemana <= 25) {
            asignaturas[pos] = a;
            horasTotales += a.horasSemana;
            actualizar();
        } else {
            System.out.println("No se puede añadir");
        }
    }

    public void abandonarAsignatura() {
        for (int i = asignaturas.length - 1; i >= 0; i--) {
            if (asignaturas[i] != null) {
                horasTotales -= asignaturas[i].horasSemana;
                asignaturas[i] = null;
                break;
            }
        }

        actualizar();
    }

    private void actualizar() {
        if (horasTotales >= 8) {
            puedeInvestigar = true;
            if (horasInv == 0) {
                horasInv = 20;
            }
        } else {
            puedeInvestigar = false;
            horasInv = 0;
            investigando = false;
        }
    }

    public String toString() {
        String estado = investigando ? "Investigando"
                : enClase ? "En clase" : "Libre";

        return super.toString()
                + "\nPuede investigar: " + puedeInvestigar
                + "\nHoras inv: " + horasInv
                + "\nEstado: " + estado;
    }
}

package ejercicio80;

public class Estudiante {

    private String nombre;
    private String apellido;
    private double[] notas;
    private int indice;

    public Estudiante(String nombre, String apellido, int cantidadNotas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.notas = new double[cantidadNotas];

        for (int i = 0; i < notas.length; i++) {
            notas[i] = -1;//significa que el estudiante todavia no tiene nota
        }
        this.indice = 0;
    }

    public boolean InsertNotas(double nota) {
        if (indice < notas.length) {
            notas[indice] = nota;
            indice++;
            return true;
        } else {
            return false;
        }
    }

    public String MonstarNotas() {
        String res = "";
        for (int i = 0; i < notas.length; i++) {
            res += notas[i] + " ";
            if (i < notas.length - 1) { // anadir espacio solo si no es la ultima nota
                res += " ";
            }
        }
        return res;
    }

    public double calcularMedia() {
        double suma = 0;
        int cont = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] != -1) {
                suma += notas[i];
                cont++;
            }
        }

        if (cont == 0) {
            return 0;
        } else {
            return suma / cont;
        }
    }

    public String IndicarRangos() {
        int insuf = 0, suf = 0, notab = 0, sobres = 0;

        for (int i = 0; i < notas.length; i++) {

            double n = notas[i];
            if (n != -1) {
                if (n < 5) {
                    insuf++;
                } else if (n < 7) {
                    suf++;
                } else if (n < 9) {
                    notab++;
                } else {
                    sobres++;
                }
            }
        }
        return "Insuficientes: " + insuf
                + ", Suficientes: " + suf
                + ", Notables: " + notab
                + ", Sobresalientes: " + sobres;
    }

    @Override
    public String toString() {
        String res = "";
        res += "Estudiante : " + this.nombre + " y " + this.apellido + "\n";
        res += "Notas : " + MonstarNotas() + "\n";
        res += "Rangos : " + IndicarRangos() + "\n";
        res += "Media: " + calcularMedia() + "\n";
        return res;
    }

}

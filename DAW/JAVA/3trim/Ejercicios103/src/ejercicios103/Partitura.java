package ejercicios103;

import ejercicios103.Nota;
import java.util.ArrayList;

public class Partitura {

    private String nombre;
    private String autor;
    private ArrayList<Nota> notas;

    public Partitura(String nombre, String autor) {
        this.nombre = nombre;
        this.autor = autor;
        notas = new ArrayList<>();
    }

    public int numNotas() {
        return notas.size();
    }

    public boolean addNota(Nota n) {
        if (notas.size() < 100) {
            notas.add(n);
            return true;
        }
        return false;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public String toString() {
        String res = nombre + " de " + autor + "\n";

        for (int i = 0; i < notas.size(); i++) {
            res += notas.get(i);

            if ((i + 1) % 10 == 0) {
                res += "\n";
            }
        }
        return res;
    }
}

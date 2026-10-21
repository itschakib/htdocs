package ejercicio81;

public class ListaCadenas {

    private String[] lista;
    private int indice;

    public ListaCadenas(int tamaño) {
        this.lista = new String[tamaño];

        for (int i = 0; i < lista.length; i++) {
            lista[i] = "";//significa que el estudiante todavia no tiene nota
        }
        indice = 0;
    }

    private void actualizarIndice() {
        indice = -1;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].equals("")) {
                indice = i;
                break;
            }
        }
    }

    public void anadir(String elemento) {
        if (indice == -1) {
            System.out.println("la lista esta llena ");
        } else {
            lista[indice] = elemento;
            actualizarIndice();
        }
    }

    public void anadir(String elemento, int pos) {
        if (pos < 0 || pos >= lista.length) {
            System.out.println("la posicion incorrecta . ");
        } else {
            lista[pos] = elemento;
            actualizarIndice();
        }
    }

    public int tamanio() {
        return lista.length;
    }

    public boolean llena() {
        return indice == -1;
    }

    public boolean vacia() {
        for (int i = 0; i < lista.length; i++) {
            if (!lista[i].equals("")) {
                return false;
            }
        }
        return true;
    }

    public String obtener(int pos) {
        if (pos < 0 || pos >= lista.length) {
            System.out.println("Posicion incorrecta.");
            return null;
        }
        return lista[pos];
    }

    public int buscar(String elemento) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public void borrar() {
        for (int i = 0; i < lista.length; i++) {
            lista[i] = "";
        }
        indice = 0;
    }

    public void borrar(int pos) {
        if (pos < 0 || pos >= lista.length) {
            System.out.println("Posicion incorrecta.");
        } else {
            lista[pos] = "";
            actualizarIndice();
        }
    }

    public void borrar(String elemento) {
        int pos = buscar(elemento);
        if (pos == -1) {
            System.out.println("No se ha encontrado el elemento.");
        } else {
            borrar(pos);
        }
    }

    public String[] trozo(int pos1, int pos2) {
        if (pos1 < 0 || pos2 < 0 || pos1 >= lista.length || pos2 >= lista.length) {
            return new String[0];
        }
        int inicio = Math.min(pos1, pos2);
        int fin = Math.max(pos1, pos2);
        String[] resultado = new String[fin - inicio + 1];
        int j = 0;
        for (int i = inicio; i <= fin; i++) {
            resultado[j] = lista[i];
            j++;
        }

        return resultado;
    }

}

package ejercicio81;

public class MAIN {

    public class Main {

        public static void main(String[] args) {

            ListaCadenas lista = new ListaCadenas(3);

            lista.anadir("Ana");
            lista.anadir("Luis");

            System.out.println(lista.obtener(0)); // Ana
            System.out.println(lista.obtener(1)); // Luis
            System.out.println(lista.obtener(2)); // ""

            System.out.println("¿Está vacía? " + lista.vacia());
            System.out.println("¿Está llena? " + lista.llena());

            lista.anadir("Maria");

            System.out.println("¿Está llena ahora? " + lista.llena());

            lista.borrar(1); // remove "Luis"

            lista.anadir("Juan");

            System.out.println("\nLista final:");
            for (int i = 0; i < lista.tamanio(); i++) {
                System.out.println(i + ": " + lista.obtener(i));
            }

            System.out.println("\nPosición de Juan: " + lista.buscar("Juan"));

            String[] parte = lista.trozo(0, 1);

            System.out.println("\nTrozo 0-1:");
            for (int i = 0; i < parte.length; i++) {
                System.out.println(parte[i]);
            }
        }
    }
}

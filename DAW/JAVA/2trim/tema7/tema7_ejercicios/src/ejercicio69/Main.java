
package ejercicio69;

public class Main {

    public static void main(String[] args) {
  // 1. Crear un coche
        Coche miCoche = new Coche("Rojo", 1.8, 1.5, 4);
      
        System.out.println(miCoche);

        // Intentar moverse (no se puede porque está apagado)
        miCoche.desplazarse();

        // Arrancar el coche
        miCoche.arrancar();

        // Desplazarse
        miCoche.desplazarse();

        // Parar el coche
        miCoche.parar();

        // Echar gasolina (apagado)
        miCoche.echarGasolina(15);

        //Pintar el coche
        miCoche.pintar("Azul");

        // Arrancar y moverse de nuevo
        miCoche.arrancar();
        miCoche.desplazarse();

        // Mostrar información final
        System.out.println(miCoche);
    }
    
}

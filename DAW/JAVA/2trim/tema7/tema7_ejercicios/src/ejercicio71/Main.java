package ejercicio71;

public class Main {

    public static void main(String[] args) {
        // crear un cafeteria
        
        Cafeteria miCafeteria = new Cafeteria();
        
        //llena l acafeteria
        
        miCafeteria.llenarCafetera();
        
        //sirve 7 tazas de tamaño 10
         miCafeteria.cantidadCafe();
        for (int i = 1; i < 7; i++) {
            System.out.println("Sirviendo la taza : " + i);
            miCafeteria.servirTaza(10);
        }
         miCafeteria.cantidadCafe();
        //Vacia la cafeteria
        
        System.out.println("Vaciando la cafetera");
        miCafeteria.vaciarCafetera();
        miCafeteria.cantidadCafe(); 

        //intenta servir otra taza
        
        System.out.println("Intentando servir otra taza de 10 cc:");
        miCafeteria.servirTaza(10);
        miCafeteria.cantidadCafe(); 


        //echar cafe con un num aleatorio  y haz eso 10 veces 
        System.out.println("sirviendo 10 taas con tamaño de un numero aleatorio entre 0 y 999");
        for (int i = 1; i < 10; i++) {
            int tamañoTaza = (int) (Math.random() * 91+10);
            System.out.println("Taza " + i + " de " + tamañoTaza + " cc");
            miCafeteria.servirTaza(tamañoTaza);
            miCafeteria.cantidadCafe();
        }
    }
}

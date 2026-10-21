package ejercicio68;

public class moto {

    String marca;
    String modelo;
    int caballos;
    int velocidad;
    boolean encendida;

    public moto(String marca, String modelo, int caballos, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.caballos = caballos;
        this.velocidad = velocidad;
        this.encendida = encendida;
    }

    public void arrancar() {
        if (!this.encendida) {
            this.velocidad = 0;
            this.encendida = true;
            System.out.println("Encendiendo moto ...");
        } else {
            System.out.println("no se puede ");
        }
    }

    public void parar() {
        if (this.encendida) {
            this.velocidad = 0;
            this.encendida = false;
            System.out.println("Apagando moto. . .");
        } else {
            System.out.println("no se puede");
        }
    }

    public void acelerar() {
        if (this.encendida  && this.velocidad <= 200) {
            this.velocidad += 10;
            System.out.println("Acelerando... : " + this.velocidad + " km/h");
        } else {
            System.out.println("no se puede ");
        }
    }

    public void frenar() {
        if (this.encendida  && this.velocidad >= 0) {
            this.velocidad -= 10;
            System.out.println("Acelerando... : " + this.velocidad + " km/h");
        } else {
            System.out.println("no se puede");
        }
    }
    
    
   public void monstrarInfo() {
        System.out.println("MOTO");
        System.out.println("Marca de la moto     : " + this.marca);
        System.out.println("caballos de la moto : " + this.caballos);
        String estado;
        if (this.encendida) {
            estado = " la moto esta arrancada y va a " + this.velocidad + "km/h" ;
        } else {
            estado = " la moto esta parada " ;
        }
    }
}


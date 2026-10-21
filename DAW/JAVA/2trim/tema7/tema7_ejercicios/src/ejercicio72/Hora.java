package ejercicio72;

public class Hora {

    int hora;
    int min;
    int seg;

    public Hora(int hora) {
        this.hora = hora;
        this.min = 0;
        this.seg = 0;
    }

    public Hora(int hora, int min) {
        this.hora = hora;
        this.min = min;
        this.seg = 0;
    }

    public Hora(int hora, int min, int seg) {
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }
public void setHora(int hora, int min, int seg){
    this.hora=hora;
    this.min=min;
    this.seg=seg;
}

public void mostrar(){
    System.out.println(hora + ":" + min + ":" + seg);
}
}

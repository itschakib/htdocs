package ejercicio97;

public class Asignatura {

    protected int codigo;
    protected int horasSemana;

    public Asignatura(int codigo, int horasSemana) {
        this.codigo = codigo;
        this.horasSemana = horasSemana;
    }
    
    @Override
    public String toString() {
        String res = "";
        res += "Codigo: " + this.codigo + "| Horas " + this.horasSemana;
        return res;
    }
}

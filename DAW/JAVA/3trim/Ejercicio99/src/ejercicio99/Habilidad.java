package ejercicio99;

public class Habilidad {

    String nombre;
    int nivel;
    char tecla;
    private double costeMana;
    private double danio;

    public Habilidad(String nombre, char tecla) {
        this.nombre = nombre;
        this.tecla = tecla;
        this.nivel = 1;
        recalcular();
    }

    private void recalcular() {
        //numero entre 1 y 10
        double randomMana = (int) (Math.random() * 10) + 1;
        this.costeMana = randomMana + (nivel / 2.0);
        //numero entre 5 y 20
        double randomDanio = (int) (Math.random() * 16) + 5;
        this.danio = randomDanio + (costeMana / 3.0);
    }

    public void subirNivel() {
        nivel++;
        recalcular();
    }

    public double getDanio() {
        return this.danio;
    }

    public double getMana() {
        return this.costeMana;
    }

    @Override
    public String toString() {
        String res = "";
        res = "Habilidad: " + this.nombre + "\n";
        res = "Nivel: " + this.nivel + "\n";
        res = "Mana:" + this.costeMana + "\n";
        res = "Daño: " + this.danio + "\n";
        res = "Tecla: " + this.tecla + "\n";
        return res;
    }

}

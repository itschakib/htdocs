package ejercicios102;

public class Mago extends Ofensivo {

    private String escuelaMagia;
    private int mana;

    
    public Mago(String nombre, int nivel, int ataque, int defensa, String escuelaMagia, int mana) {
        super(nombre, nivel, ataque, defensa);
        this.escuelaMagia = escuelaMagia;
        this.mana = mana;
    }

    @Override
    public String tipoPersonaje() {
        return "Soy un Mago";
    }

    @Override
    public int calcularDanio() {
        return getAtaque() + this.mana;
    }

    public void lanzarHechizo() {
        this.mana -= 10;
        setDefensa(getDefensa() + 8);
    }

  
    @Override
    public String toString() {
        return "MAGO" + "\n"
                + super.toString()+ " – Maná: " + this.mana;
    }
}

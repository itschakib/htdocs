
package ejercicio99;

public class Minion extends Personaje {
  private String tipo;

    public Minion(String tipo) {
        super( "minion",
            (int)(Math.random() * (1520 - 400 + 1)) + 400, // posX
            (int)(Math.random() * (1520 - 400 + 1)) + 400, // posY 
            0, 0, 0 );

        if (!tipo.equals("Melee") && !tipo.equals("Mago") && !tipo.equals("Cañón")) {
            this.tipo = "Melee";
        } else {
            this.tipo = tipo;
        }

        switch (this.tipo) {
            case "Melee":
                this.vida = 50;
                this.escudo = 10;
                this.ataque = 10;
                break;

            case "Mago":
                this.vida = 12;
                this.escudo = 40;
                this.ataque = 30;
                break;

            case "Cañón":
                this.vida = 75;
                this.escudo = 5;
                this.ataque = 25;
                break;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Tipo: " + this.tipo + "\n";
    }
}
package ejercicio99;

public class Campeon extends Personaje {

    private double mana;
    private int nivel;
    private String rol;
    private Habilidad[] habilidades;

    public Campeon(String nombre, String rol, Habilidad h) {
        super(nombre,
                (int) (Math.random() * (1920 - 1000 + 1)) + 1000, // posX
                (int) (Math.random() * (1920 - 1000 + 1)) + 1000, // posY
                0, 0, 0);
        this.nivel = 1;
        this.habilidades = new Habilidad[4];
        this.habilidades[0] = h;

        // Validar role
        switch (rol) {
            case "Tanque":
            case "Carry":
            case "Support":
            case "Mago":
            case "Jungla":
                this.rol = rol;
                break;
            default:
                this.rol = "Carry";
        }
        // Mana segun rol
        switch (this.rol) {
            case "Tanque":
                this.mana = 100;
                break;
            case "Carry":
                this.mana = 300;
                break;
            case "Support":
                this.mana = 300;
                break;
            case "Mago":
                this.mana = 500;
                break;
            case "Jungla":
                this.mana = 200;
                break;
        }

        // Ataque   de   3  a   7
        this.ataque = (int) (Math.random() * (7 - 3 + 1)) + 3;

        // Vida de  150   a    200  mas  bonus por role
        this.vida = (int) (Math.random() * (200 - 150 + 1)) + 150;

        if (this.rol.equals("Tanque")) {
            this.vida += 150;
        }
        if (this.rol.equals("Support")) {
            this.vida += 50;
        }
        if (this.rol.equals("Jungla")) {
            this.vida += 100;
        }

        // Escudo de  15  a   20  mas de bonus por rol
        this.escudo = (int) (Math.random() * (20 - 15 + 1)) + 15;

        if (this.rol.equals("Carry")) {
            this.escudo += 100;
        }
        if (this.rol.equals("Support")) {
            this.escudo += 50;
        }
        if (this.rol.equals("Mago")) {
            this.escudo += 150;
        }
    }

    public void subirNivel(Habilidad nueva) {
        nivel++;

        //  subidas random 
        this.vida += (Math.random() * 9) + 1;
        this.escudo += (Math.random() * 0.9) + 0.1;
        this.ataque += (Math.random() * 0.9) + 0.1;

        //  anadir habilidades en niveles 4 y 6 y 8
        if (nivel == 4 || nivel == 6 || nivel == 8) {
            for (int i = 0; i < habilidades.length; i++) {
                if (habilidades[i] == null) {
                    habilidades[i] = nueva;
                    break;
                }
            }
        }
    }

    @Override
    public String toString() {
        String res = super.toString();
        res += "Rol: " + this.rol + "\n";
        res += "Nivel: " + this.nivel + "\n";
        res += "Mana: " + this.mana + "\n";
        res += "Habilidades:\n";

        for (int i = 0; i < habilidades.length; i++) {
            if (habilidades[i] != null) {
                res += habilidades[i].toString() + "\n";
            }
        }

        return res;
    }
}

package ejercicios102;

public class Ejercicios102 {

    public static void main(String[] args) {
        // ===== CREACIÓN DE OBJETOS =====
        Guerrero guerrero = new Guerrero("Hacha", 10, 20, 15, "Thorin", 5);
        Mago mago = new Mago("Elemental", 40, 12, 10, "Merlín", 7);
        // ===== USO DE MÉTODOS HEREDADOS =====
        guerrero.subirNivel();
        mago.subirNivel();
        guerrero.entrenar(3);
        mago.entrenar(4);
        // ===== MÉTODOS PROPIOS =====
        guerrero.gritoGuerra();
        mago.lanzarHechizo();
        // ===== OTROS =====
        System.out.println(guerrero.tipoPersonaje());
        System.out.println(guerrero.calcularDanio());
        System.out.println();
        System.out.println(mago.tipoPersonaje());
        System.out.println(mago.calcularDanio());
        System.out.println();
        // ===== TO STRING =====
        System.out.println("=== INFORMACIÓN PERSONAJES ===");
        System.out.println(guerrero);
        System.out.println();
        System.out.println(mago);
    }

}

package ejercicio75;

public class Persona {

    String nombre;
    int edad;
    boolean sexo;
    String pais;

    public Persona(String nombre, int edad, boolean sexo, String pais) {
        this.nombre = nombre;
        this.edad = edad;
        this.pais = pais;
        this.sexo = sexo;
    }

    public String saludar() {
        return "Hola! Me llamo " + nombre + "y soy de " + pais;
    }
   public String saludar(int tipo) {
        switch(tipo) {
            case 1: 
                return "Hola! Soy " + nombre;
            case 2: 
                return "Saludos desde " + pais;
            case 3: 
                return "Q tal ? Soy " + nombre + " de " + pais;
            default: 
                return saludar();
        }
    }

    public boolean EsMayorEdad() {
        return edad >= 18;
    }

    public void monstrarDatos() {
        System.out.println(toString());
    }
@Override
    public String toString() {
        String res = "";
        res += "Nombre :   " + nombre + "\n";
        res += "Edad :       " + edad + "\n";
        res += "Sexo :       " + sexo + "\n";
        res += "Pais :        " + pais+"\n";
        return res;
    }

}

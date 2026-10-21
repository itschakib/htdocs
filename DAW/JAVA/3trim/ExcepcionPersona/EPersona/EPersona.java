
package excepciones;

public class EPersona {
    
    private String nombre;
    private int edad;
    private char sexo;

    public EPersona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    public EPersona() {
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.sexo = 'F';
    }
    
    public void setEdad(int nueva) throws PersonaException {
        if (nueva < 1) {
            throw new PersonaException("Edad incorrecta...");
        }
        this.edad = nueva;
    }

    @Override
    public String toString() {
        return "EPersona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + '}';
    }
    
}

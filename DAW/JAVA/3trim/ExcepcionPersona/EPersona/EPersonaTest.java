
package excepciones;

public class EPersonaTest {

    public static void main(String[] args) {
        EPersona p = new EPersona("Samolo", 21, 'M');
        try {
            p.setEdad(-10);
        } catch (PersonaException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
  
        System.out.println(p);
    }
    
}

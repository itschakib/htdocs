
public class EPersonaTest {

    public static void main(String[] args) {
        EPersona p = null;
        try {
            p = new EPersona("Samolo", 21, 'H');
            p.setEdad(-10);
            System.out.println(p);
        } catch (PersonaException e) {
            System.out.println("ERROR: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println(p);
    }

}

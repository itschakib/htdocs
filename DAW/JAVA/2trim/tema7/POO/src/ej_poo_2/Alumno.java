
package ej_poo_2;

public class Alumno {
    
    //Propiedades
    private String nombre;
    private int edad;
    private double notaMedia;
    private String [] asignaturas;
    
    //Constructores
    public Alumno(String nombre, int edad, double notaMedia, int tam) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
        this.asignaturas = new String[ tam];
        for (int i = 0; i < this.asignaturas.length; i++) {
            this.asignaturas[i] = "Sin asignar";
        }
    }
    
    public Alumno(String nombre, int edad, int  tam) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = 0;
        this.asignaturas = new String[ tam];
        for (int i = 0; i < this.asignaturas.length; i++) {
            this.asignaturas[i] = "Sin asignar";
        }
    }
    
    public Alumno(Alumno origen) {
        this.nombre = origen.nombre;
        this.edad = origen.edad;
        this.notaMedia = origen.notaMedia;
        this.asignaturas = origen.asignaturas;
        for (int i = 0; i < this.asignaturas.length; i++) {
            this.asignaturas[i] = "Sin asignar";
        }
    }
    
    //Métodos
    public String getNombre() {
        return this.nombre;
    }
    
    public double getNotaMedia() {
        return this.notaMedia;
    }
    
    public String [] getAsignaturas() {
        return this.asignaturas;
    }
    
    public void setEdad(int anios) {
        this.edad = anios;
    }
    
    public void setNotaMedia(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.notaMedia = nota;
        }
        else {
            System.out.println("Error");
        }
    }
    
    public void asignarAsignatura(int pos, String nomasig) {
        if (pos < this.asignaturas.length && pos >= 0) {
            this.asignaturas[pos] = nomasig;
        }
        else {
            System.out.println("Error");
        }
    }
    
    public void asignarAsignatura(String nomasig) {
        int pos = 0;
        while (!this.asignaturas[pos].equals("Sin asignar")) {            
            if (pos >= this.asignaturas.length ) {
                System.out.println("Error");
            }
            else {
                pos++;
            }
        }
        this.asignaturas[pos] = nomasig;
    }
    
    public boolean borrarAsignatura(String nomasig) {
        int pos = 0;
        while (this.asignaturas[pos].equals("Sin asignar")) {            
            if (pos >= this.asignaturas.length) {
                return false;
            }
            else {
                pos++;
            }
        }
        this.asignaturas[pos] = "Sin asignar";
        return true;
    }
    
    public boolean borrarAsignatura(int pos) {
        if (pos < this.asignaturas.length && pos >= 0) {
            this.asignaturas[pos] = "Sin asignar";
            return true;
        }
        else {
            return false;
        }
    }
    
    public void limpiarAsignaturas() {
        for (int i = 0; i < 10; i++) {
            
        }
    }
    
    
    
    
    
}
    
    
    
    
    
    
    


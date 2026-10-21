
package ejercicios103;

public class Piano extends Cuerda {
    private int numTeclas;
    private String tipo;

    public Piano(String m, int mes, int a, Partitura p, int teclas, String tipo) {
        super(m, mes, a, p, teclas, false);
        this.numTeclas = teclas;
        this.tipo = tipo;
    }

    public void afinar() {
        System.out.println("Se han tensado correctamente las " + numTeclas + " teclas del piano");
    }

    public String tocarPartitura() {
        if (roto) return "Roto";

        tocando = true;
        String res = "";

        for (Nota n : partitura.getNotas()) {
            String s = "";

            switch (n.getNombre()) {
                case "do": s = "ton"; break;
                case "re": s = "ten"; break;
                case "mi": s = "tin"; break;
                case "fa": s = "tan"; break;
                case "sol": s = "tun"; break;
                case "la": s = "tean"; break;
                case "si": s = "tain"; break;
            }

            for (int i = 0; i < n.getDuracion(); i++) {
                res += s + " ";
            }
        }

        return res;
    }
}
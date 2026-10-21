
package ejercicios103;

public class Flauta extends Viento {
    private String tipoFlauta;
    private String lengueta;

    public Flauta(String m, int mes, int a, Partitura p, String t, String tf, String l) {
        super(m, mes, a, p, t);
        tipoFlauta = tf;
        lengueta = l;
    }

    public void cambiarLengueta(String n) {
        lengueta = n;
    }

    public void afinar() {
        System.out.println("Se ha usado una baqueta para afinar correctamente la flauta "
                + tipoFlauta + " con lengüeta de " + lengueta);
    }

    public String tocarPartitura() {
        if (roto) return "Roto";

        tocando = true;
        String res = "";

        for (Nota n : partitura.getNotas()) {
            String s = "";

            switch (n.getNombre()) {
                case "do": s = "flo"; break;
                case "re": s = "fle"; break;
                case "mi": s = "fli"; break;
                case "fa": s = "fla"; break;
                case "sol": s = "flon"; break;
                case "la": s = "flan"; break;
                case "si": s = "flin"; break;
            }

            res += s;

            for (int i = 0; i < n.getDuracion(); i++) {
                res += "*";
            }

            res += " ";
        }

        return res;
    }
}
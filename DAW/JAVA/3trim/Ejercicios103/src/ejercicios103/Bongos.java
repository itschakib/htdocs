
package ejercicios103;

public class Bongos extends Percusion {
    private int numCajas;
    private String tipoPiel;

    public Bongos(String m, int mes, int a, Partitura p, boolean b, int cajas, String piel) {
        super(m, mes, a, p, b);
        numCajas = cajas;
        tipoPiel = piel;
    }

    public void afinar() {
        System.out.println("Se han ajustado los " + (numCajas * 4) + " pernos de los bongos");
    }

    public String tocarPartitura() {
        if (roto) return "Roto";

        tocando = true;
        String res = "";

        for (Nota n : partitura.getNotas()) {
            String s = "";

            switch (n.getNombre()) {
                case "do": s = "tom"; break;
                case "re": s = "tem"; break;
                case "mi": s = "tim"; break;
                case "fa": s = "tam"; break;
                case "sol": s = "totom"; break;
                case "la": s = "tatam"; break;
                case "si": s = "tutim"; break;
            }

            res += s + " ";
        }

        return res;
    }
}
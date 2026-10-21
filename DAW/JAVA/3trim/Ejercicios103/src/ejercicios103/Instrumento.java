
package ejercicios103;

public abstract class Instrumento {
  protected String marca;
    protected int mes, anio;
    protected Partitura partitura;
    protected boolean tocando;
    protected boolean roto;

    public Instrumento(String marca, int mes, int anio, Partitura p) {
        this.marca = marca;
        this.mes = mes;
        this.anio = anio;
        this.tocando = false;
        this.roto = false;

        if (p != null) {
            partitura = p;
        } else {
            generarPartitura();
        }
    }

    private void generarPartitura() {
        partitura = new Partitura("desconocido", "desconocido");

     

        int total = (int)(Math.random() * 91) + 10;

        for (int i = 0; i < total; i++) {
      this.aniadirNota();
        }
    }

    public boolean aniadirNota() {
        if (roto) return false;

        String[] notas = {"do","re","mi","fa","sol","la","si"};

        String nombre = notas[(int)(Math.random() * 7)];
        int dur = (int)(Math.random() * 5) + 1;

        return partitura.addNota(new Nota(nombre, dur));
    }

    public abstract String tocarPartitura();

    public void pararDeTocar() {
        this.tocando = false;
    }

    public abstract void afinar();
}
package ejercicio79;

public class Urna {

    private int blancas;
    private int negras;

    public Urna(int blancas, int negras) {
        this.blancas = blancas;
        this.negras = negras;
    }

    public int totalBolas() {
        return blancas + negras;
    }

    public char extaer() {
        int total = totalBolas();
        int ale = (int) (Math.random() * total) + 1;

        if (ale < this.blancas) {
            this.blancas--;
            return 'B';

        } else {
            this.negras--;
            return 'N';
        }
    }

    public void meter(char color) {
        if (color == 'B') {
            this.blancas++;
        } else {
            this.negras++;
        }
    }

    @Override
    public String toString() {
        String res = "";
        res += "Quedan " + this.totalBolas() + " bolas en total en la urna" + "\n";
        res += "Blancas: " + this.blancas + "\n";
        res += "Negras: " + this.negras + "\n";
        return res;
    }

}

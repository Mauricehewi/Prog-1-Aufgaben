import java.util.Scanner;
import java.util.*;

class Messung {
    public double[] gewichtungsreihe; // Gewichtungsfaktor jedes
    // Messwerts
    public int[] messreihe; // Messreihe mit Messwerten
    public double messwertGewichtet; // gewichteter Messwert
    public double gewichteterMesswert(double[] faktor, int[] werte) {
        double o = 0;
            for (int k = 0; k < faktor.length ; k++) {
                o = o + (werte [k] * faktor[faktor.length - (k+1)]);
            }
        return o;
    }


}


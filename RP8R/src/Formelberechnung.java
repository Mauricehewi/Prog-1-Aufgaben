import java.lang.Math;

public class Formelberechnung {
    public static double normdensity(double sigma, double my, double x) {
        double ergebnise = Math.exp((((-0.5) * (x - my)) / sigma) * (x - my) / sigma);
        double ergebniss = (sigma * Math.sqrt(Math.TAU));
        double ergebnis = ergebnise / ergebniss;
        ergebnis *= 10000;
        ergebnis = (double)Math.round(ergebnis);
        return ergebnis/10000;

    }
}

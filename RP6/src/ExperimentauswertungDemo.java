
import java.text.*;
import java.util.*;

public class ExperimentauswertungDemo {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Anzahl Messungen eingeben:");
        int i = in.nextInt();
        SimpleDateFormat Uhrzeit =new SimpleDateFormat("HH:mm:ss");
        String zeitString = Uhrzeit. format ( new Date () ) ;
        Messung messung = new Messung();
        messung.messreihe = new int[i];
        messung.gewichtungsreihe = new double[i];
        for( int k= 0; k< messung.messreihe.length;k++) {
            System.out.println(k+1 + ". Messwert eingeben:");
            messung.messreihe [k]= in.nextInt();
            System.out.println(k+1 + ". Faktor eingeben:");
            messung.gewichtungsreihe [messung.gewichtungsreihe.length - (k+1)] = in.nextDouble();
            messung.messwertGewichtet = messung.gewichteterMesswert(messung.gewichtungsreihe, messung.messreihe);
        }
        System.out.println("Gewichteter Messwert für die Messreihe (berechnet um " + zeitString + " Uhr:");
        System.out.println(messung.messwertGewichtet);
    }
}

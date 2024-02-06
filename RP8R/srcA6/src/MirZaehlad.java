import java.lang.Math;
public class MirZaehlad {
    public static double runden(double d,int i) {
        int l = 1;
        for (int k = 0; k <= i; k++)
            l *= 10;
        d *= l;
        d = Math.round(d);
        d /= l;
        return d;
    }
    private MirZaehlad(){

    }


}

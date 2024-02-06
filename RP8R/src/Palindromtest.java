import com.sun.jdi.Value;

public class Palindromtest {
    public static boolean istpalindrom(char[] k) {
        char c, cr;
        boolean b;
        if (k == null) {
            return false;
        }
        for (int o = 0; o < k.length; o++) {
            k[o] = Character.toLowerCase(k[o]);
        }
        if (k == null) {
            return false;
        } else if (k.length == 1) {
            return true;
        } else if (k.length % 2 == 0) {
            for (int i = 1; i <= k.length / 2; i++) {
                c = (k[i - 1]);
                cr = k[k.length - i];
                if (c == cr) {
                    continue;
                } else {
                    return false;
                }
            }
        } else {
            int l = k.length - 1;
            for (int i = 1; i <= l / 2; i++) {
                c = (k[i - 1]);
                cr = k[k.length - i];
                if (c == cr) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
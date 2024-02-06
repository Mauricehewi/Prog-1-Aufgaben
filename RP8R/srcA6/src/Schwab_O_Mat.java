import javax.swing.*;

public final class Schwab_O_Mat {
    static private Schwab_O_Mat maschine;

    static {
        maschine = new Schwab_O_Mat();
        System.out.println("Der Schwab o Mat wurde erstellt");
    }

    private Schwab_O_Mat() {

    }

    public static Schwab_O_Mat getInstance() {
        return maschine;
    }

    public void reduzieren(Guadschai guadschai, Veschbr[] Produkte) {
        for (Veschbr v : Produkte) {
            if (v instanceof DesKoMerGinstigerMacha)
                ((DesKoMerGinstigerMacha) v).reduzieren((guadschai));
        }
    }

    public void reduzieren(Guadschai guadschai, DesKoMerGinstigerMacha [] Produkte) {
        for (DesKoMerGinstigerMacha v : Produkte)
            v.reduzieren(guadschai);

    }


}

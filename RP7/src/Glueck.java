public class Glueck {

    /*static void wetterGlueck(Bauer b) {
        int i;
        do {
            i = (int) (10 * Math.random());
            i -= i;
        } while (i > 3);

        b.felder [i].ernten();

    }*/
    public static void wetterGlueck(Bauer bauer) {
        for (int k = 0; k < 4; k++) {
            for (int i = 0; i < 4; i++) {
                int j = (int) (Math.random() * 10) + 1;
                if ((bauer.felder[i].nummer == j) && (bauer.felder[i].
                        getIstgeerntet() == false)) {
                    System.out.println(bauer.name + ": " + bauer.felder[i].ernten());
                }

            }
        }
    }
}
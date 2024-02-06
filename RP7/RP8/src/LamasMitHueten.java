class Paul {
    public String kopfbedeckung = " Damenhut ";

    public void getKopfbedeckung() {
        System.out.println(kopfbedeckung);
    }

    public static void getName() {
        System.out.println(" Paul ");
    }
}

class Carl extends Paul {
    public String kopfbedeckung = " Strickm ü tze";

    public void getKopfbedeckung() {
        System.out.println(kopfbedeckung);
    }

    public static void getName() {
        System.out.println(" Caaaaaarl ");
    }
}

public class LamasMitHueten {
    public static void main(String[] args) {
        Carl lama1 = new Carl();//1
        lama1.getKopfbedeckung();//Strickmütze
        lama1.getName();//Carl
        System.out.println(lama1.kopfbedeckung);//Strickmütze
        Paul lama2 = new Carl();//
        lama2.getKopfbedeckung();//Strickmütze
        lama2.getName();// Paul
        System.out.println(lama2.kopfbedeckung);// Damenhut
    }
}


import java.util.Scanner;

public class Rommwurschdla {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Gericht eingeben: (Name,Preis)");
        String name = in.next();
        double preis = in.nextDouble();
        Mauldascha n1 = new Mauldascha(name, preis);
        Kaesspaetzle ole = new Kaesspaetzle(12, "ole");
        Kaesspaetzle malte = new Kaesspaetzle(15, "Malte");
        Mauldascha nick = new Mauldascha("Nick", 20);
        Guadschai n2 = new Guadschai();
        Veschbr [] veschbrs = new Veschbr[2];
        veschbrs [0] = nick;
        veschbrs [1] = n1;
        Veschbr [] veschbrs1 = {ole,malte};
        Schwab_O_Mat.getInstance().reduzieren(n2,veschbrs1);
        System.out.println(malte.toString());
        System.out.println(ole.toString());
        System.out.println(nick.toString());
        System.out.println(n1.toString());
    }
}

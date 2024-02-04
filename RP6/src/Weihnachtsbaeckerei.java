public class Weihnachtsbaeckerei {


    public static void main(String [] args){
        Zutat Mehl = new Zutat();
        Zutat Zucker = new Zutat();
        Zutat Eier = new Zutat();
        Eier.Name = "Eier";
        Eier.Menge = 150;
        Zucker.Name = "Zucker";
        Zucker.Menge = 100;
        Mehl.Name = "Mehl";
        Mehl.Menge = 200;
        Teig Teig = new Teig();
        Teig.zutathinzufuegen(Mehl);
        Teig.zutathinzufuegen(Eier);
        Teig.zutathinzufuegen(Zucker);
        Teig.geknetet();
        if (Ofen.backen(Teig,180))
            System.out.println("Mhhhh lecker");
            else System.out.println("Leider Schief gegangen");


    }
}
public class Teig {
    boolean geknetet;

    void geknetet(){
        geknetet = true;
        System.out.println("Teig geknetet");
    }
    void zutathinzufuegen(Zutat zutat){
        System.out.println("Zutat hinzugefügt: " + zutat.Name + "(" + zutat.Menge + ")");

    }
}

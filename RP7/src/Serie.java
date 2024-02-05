public class Serie {
    String name;
    int anzahlCast;
    int castZeahler;
    Charakter[] cast;

    public Serie(String name, int anzahlCast) {
        this.name = name;
        this.anzahlCast = anzahlCast;
        cast = new Charakter[anzahlCast];
    }

    void add(Charakter chaar) {
        this.cast[castZeahler] = chaar;
        castZeahler++;

    }

   public String toString() {
        return (this.name + ": " + generiereCastListe());
    }

    private String generiereCastListe() {
        String output =" ";
        for (Charakter c : cast) {
            output += "| " + c + " ";
        }
        return output;
    }
}

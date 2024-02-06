public abstract class Veschbr {
    private double preis;
    private String name;

    public Veschbr(double preis, String name) {
        this.preis = preis;
        this.name = name;
    }

    public double getPreis() {
        return this.preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        String l = "Das Gericht heißt " + this.name + " und kostet " + this.preis + " €";
        return l;
    }

}

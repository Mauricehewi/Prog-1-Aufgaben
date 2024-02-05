public class Bauer {
    Feld[] felder = new Feld[4];
    String name;

    public Bauer(String i) {
        this.name = i;
    }

    public String toString() {
        return ("Das Feld gehört: " +  this.name);
    }
}


public class Feld {
    public int nummer;
    public String sorte;
    private boolean istgeerntet;
    private int ernteMenge;

    public Feld(int i, String k, int j) {
        this.nummer = i;
        this.sorte = k;
        this.ernteMenge = j;

    }

    public boolean getIstgeerntet() {
        return this.istgeerntet;

    }

    public int getErnteMenge() {
        return this.ernteMenge;
    }

    public String toString() {
        if (this.istgeerntet)
            return ("Es wurde" + " " + this.sorte + " geerntet " + " neue Menge: " +  this.ernteMenge );
        else return ("Es wächst " + this.sorte + " und wurde noch nicht geerntet und die erntemenge beträgt: " + this.ernteMenge);
    }
    public String ernten(){
    this.istgeerntet = true;
    int help = this.ernteMenge;
    this.ernteMenge = 0;
    return ("Es wurde " + this.sorte + " (" + help + ") geerntet");
    }


}

public abstract class Veschbr {
    private double preis;
    private String name;
    public Veschbr(double preis, String name){
        this.preis = preis;
        this.name = name;
    }
    public double getPreis(){

    }

    public void setPreis(double preis) {
        this.preis = preis;
    }
    public String getName(){

    }
    public String toString(){
        String l = "Name: " + this.name + " Preis: " + this.preis;
    }

}

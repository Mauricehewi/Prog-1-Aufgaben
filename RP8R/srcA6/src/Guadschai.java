public class Guadschai {
    final double rabatt;
    boolean eingeloest;

    public Guadschai(){
        this.rabatt = Math.round(Math.random());
        this.eingeloest = false;

    }
    public double getRabatt(){
        return this.rabatt;
    }

    public void einloesen(){
        this.rabatt = false;
    }



}

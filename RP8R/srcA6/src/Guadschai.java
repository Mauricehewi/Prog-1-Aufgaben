public class Guadschai {
    public final double rabatt;
    boolean eingeloest;

    public Guadschai(){
        this.rabatt = MirZaehlad.runden(Math.random()/10, 2);
        this.eingeloest = false;

    }
    public double getRabatt(){
        return this.rabatt;
    }

    public void einloesen(Mauldascha mauldascha){
        if( !(this.eingeloest))
        mauldascha.reduzieren(this);
        this.eingeloest = true;
    }



}

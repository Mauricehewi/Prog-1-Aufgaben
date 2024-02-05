public class Charakter {
    String name;
    Schauspieler spieler;

    Serie serie;
    Charakter(String k,Serie s, Schauspieler spiiler){
        this.name = k;
        s.add(this);
        this.spieler=spiiler;
    }
    public String toString(){
        return (name + " - " + spieler.name);
    }

}

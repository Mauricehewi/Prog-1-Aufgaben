public class Erntezeit {
    public static void main(String [] args) {
        Bauer nils = new Bauer("nils");
        Bauer ole = new Bauer("ole");
        nils.felder [0]= new Feld(1,"Mais",150);
        nils.felder [1] = new Feld(2,"Gerze",500);
        nils.felder [2] = new Feld (3,"Weizen",300);
        nils.felder [3] = new Feld (4,"Weizen",10000);

        ole.felder [0]= new Feld(1,"Baumwolle",200);
        ole.felder [1]= new Feld(2,"Baumwolle",300);
        ole.felder [2]= new Feld(3,"Baumwolle",400);
        ole.felder [3] = new Feld (4,"Weizen",300);

        Glueck.wetterGlueck(nils);
        Glueck.wetterGlueck(ole);
        System . out . println () ;
        for (int i = 0; i <4; i ++) {
            System . out . println ( ole +" "+ ole . felder [ i ]) ;
        }
        System . out . println () ;
        for (int i = 0; i <4; i ++) {
            System.out.println(nils + " " + nils.felder[i]);
        }

    }
}
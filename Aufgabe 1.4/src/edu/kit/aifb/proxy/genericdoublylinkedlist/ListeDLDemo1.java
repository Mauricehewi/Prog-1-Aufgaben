package edu.kit.aifb.proxy.genericdoublylinkedlist;

public class ListeDLDemo1 {
    public static void main(String [] args){
        ListGDL neueListe = new ListGDL<>();
     neueListe.insertFirst(1);
     neueListe.insertFirst(2);
     neueListe.insertFirst(3);
     neueListe.instertLast(3);
     neueListe.instertLast(2);
     neueListe.instertLast(1);
     neueListe.remove(3);
     neueListe.remove(3);
     neueListe.remove(2);
     neueListe.remove(2);
     neueListe.remove(1);


    }

}

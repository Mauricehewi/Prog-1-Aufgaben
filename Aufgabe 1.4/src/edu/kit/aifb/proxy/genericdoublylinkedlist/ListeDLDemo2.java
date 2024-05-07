package edu.kit.aifb.proxy.genericdoublylinkedlist;

public class ListeDLDemo2 {
    public static void main(String[] args) {
        ListGDL cliste = new ListGDL();
        cliste.insertFirst("1");
        cliste.insertFirst("2");
        cliste.insertFirst("3");
        cliste.instertLast("3");
        cliste.instertLast("2");
        cliste.instertLast("1");
        cliste.remove("3");
        cliste.remove("3");
        cliste.remove("2");
        cliste.remove("2");
        cliste.remove("1");
    }}
package edu.kit.aifb.proxy.genericdoublylinkedlist;

public class ElementDL<T> {
    private T object;
    private ElementDL<T> successor;
    private ElementDL<T> prodessor;

    public ElementDL(T object) {
        this.object = object;

    }

    public ElementDL<T> getPredecessor() {
        return prodessor;
    }

    public ElementDL<T> getSuccessor() {
        return successor;
    }

    public void setPredecessor(ElementDL<T> processor) {
        this.prodessor = processor;
    }

    public void setSuccessor(ElementDL<T> successor) {
        this.successor = successor;
    }

    @Override
    public String toString() {
        String string =  (String) object.toString();
        return string;
    }
}
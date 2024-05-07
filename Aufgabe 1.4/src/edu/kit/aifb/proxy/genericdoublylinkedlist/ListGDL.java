package edu.kit.aifb.proxy.genericdoublylinkedlist;
public class ListGDL <T> {
   private ElementDL<T> head;
   private ElementDL<T> tail;

    ListGDL(){
    }

    public void insertFirst(T t){
        ElementDL newElement = new ElementDL<>(t);
        if(head == null) {
            head = newElement;
            tail = newElement;
        }
        else {
            newElement.setSuccessor(head);
            head.setPredecessor(newElement);
            head = newElement;
            if (tail==head){
                tail = head.getSuccessor();
            }
        }
       System.out.println(this.toString());
    }
        public void instertLast(T t){
            ElementDL newElement = new ElementDL<>(t);
            if(head == null) {
                head = newElement;
                tail = newElement;
            }else {
                newElement.setPredecessor(tail);
                tail.setSuccessor(newElement);
                tail = newElement;
                if(tail==head){
                    tail = head.getSuccessor();
                    head = tail.getPredecessor();
                }
            }
            System.out.println(this.toString());
    }/*
   public void remove(T t){
        ElementDL removable = head;
        ElementDL vergleich = new ElementDL(t);
        if ((head.toString().equals(vergleich.toString()))){
            head = head.getSuccessor();
        } else {
            while(!(removable.toString().equals(vergleich.toString())))
                removable = removable.getSuccessor();
            if(removable==tail) {
                tail = removable.getPredecessor();
                System.out.println(this.toString());
                return;
            }else {
            removable.getSuccessor().setPredecessor(removable.getPredecessor());
            removable.getPredecessor().setSuccessor(removable.getSuccessor());

            }}
        System.out.println(this.toString());
  }*/
   public void remove(T t) {
       ElementDL current = head;
       while (current!= null) {
           if (current.toString().equals(t)) {
               if (current == head) {
                   head = current.getSuccessor();
               } else {
                   current.getPredecessor().setSuccessor(current.getSuccessor());
               }
               if (current == tail) {
                   tail = current.getPredecessor();
               } else {
                   current.getSuccessor().setPredecessor(current.getPredecessor());
               }
               System.out.println(this.toString());
               return;
           }
           current = current.getSuccessor();
       }
       System.out.println(this.toString());

   }
    public String toString() {
        ElementDL help = this.tail;
        String ausgabe = "[ " + help.toString();
        while (help.getPredecessor() != null) {
            help = help.getPredecessor();
            ausgabe = ausgabe + ", " + help.toString();
        }
        return ausgabe + " ]";
    }}

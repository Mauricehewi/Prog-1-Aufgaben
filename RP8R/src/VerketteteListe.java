
public class VerketteteListe {
    static class ListenElement {
        private Object element;
        private ListenElement next;

        public ListenElement(Object o) {
            element = o;
            next = null;
        }
    }

    private ListenElement head;

    public VerketteteListe() {
        head = null;
    }

    public VerketteteListe(Object o) {
        head = new ListenElement(o);
    }

    public ListenElement add(Object o) {
        ListenElement newEl = new ListenElement(o);
        if (head == null)
            head = newEl;
        else {
            newEl.next = head;
            head = newEl;
        }
        return newEl;
    }

    public ListenElement insert(Object o, ListenElement pred) {
        ListenElement newEl = new ListenElement(o);

        if (pred == null) {
            newEl.next = head;
            head = newEl;
        } else {
            newEl.next = pred.next;
            pred.next = newEl;
        }

        return newEl;
    }

    public void delete(ListenElement pred) {
        if (pred == null)
            head = head.next;
        else if (pred.next != null)
            pred.next = pred.next.next;
    }

    public String toString() {
        String s = "(";
        ListenElement help = head;
        while (help != null && help.next != null){
            s = s + help.element + ", ";
            help = help.next;
        }
        if (help != null)
            s = s + help.element;
        return s + ")";
    }

    public ListenElement getHeadElement() {
        return head;
    }
}

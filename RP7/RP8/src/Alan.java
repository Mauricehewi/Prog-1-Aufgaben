
class NoWait {
    public NoWait() {
        System.out.println(" NoWait Konstruktor ");//3,7,12
    }
}

class Steve extends NoWait {
    static {
        System.out.println(" Steve statischer Initialisierer "); //1
    }

    public Steve() {
        this(2);//5
        System.out.println(" Steve Konstruktor 1");//9
    }

    public Steve(int i) {
        super();//6,11
        System.out.println(" Steve Konstruktor 2");//8,13
    }
}

public class Alan extends Steve {
    static NoWait alan = new NoWait(); //2
    public Steve murmeltier = new Steve(5);//10

    public Alan() {
        System.out.println(" Alan Konstruktor ");//14
    }

    public static void main(String[] args) {
        new Alan();//4
    }
}
import java.util.Scanner;
public class rekursivPyramiede{
    static String k = "";
    static int l;
public static void main(String [] args){
    Scanner in = new Scanner(System.in);
    l = in.nextInt();
    pyra(k,1);
}
static public String pyra(String k, int i){
    k += "*";
    System.out.println(k);
    if (i != l) {
        return pyra(k, i+1);
    }
    else return "ulai";
}

}

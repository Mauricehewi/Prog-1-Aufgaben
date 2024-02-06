import java.sql.SQLOutput;
import java.util.Scanner;
public class Studienverwaltung {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Name eingeben:");
        String name = in.next();
        System.out.println("Alter eingeben: ");
        int alter = in.nextInt();
        System.out.println("Martrikelnummer eingeben: ");
        int matrikelnummer = in.nextInt();
        Student wittich = new Student(name,alter,matrikelnummer);
        System.out.println("Name: " + wittich.getName());
        System.out.println("Alter: " + wittich.getAlterInJahren());
        System.out.println("Martrikelnummer: " + wittich.getMatrikelNr());

    }
}
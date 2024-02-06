import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ExceptionsFangen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] stringfeld = {"34", "252", "drei", "3.5"};

        for (int i = 1; i <= 5; i++) {
            System.out.println("Indizee angeben: ");

            try {
                byte j = input.nextByte();
                System.out.println(parseInt(stringfeld[j]));
            }
            catch (NumberFormatException feld)
            {
                System.out.println("Geht leider niocht weil kein int");
            } catch (ArrayIndexOutOfBoundsException feld){
                System.out.println("Geht leider nicht weil ausserhalb der Feldlänge");
            }
        }


    }
}


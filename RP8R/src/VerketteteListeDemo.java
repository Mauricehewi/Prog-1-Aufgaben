
import java.util.Scanner;

/**
 * Demonstriere eine Liste der Klasse ListeL
 *
 * @version 1.0
 * @author Prog1-Team
 */
public class VerketteteListeDemo {
    private static VerketteteListe liste;
    private static boolean running;
    private static String entry;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        running = true;
        liste = new VerketteteListe();
        System.out.println("Neue int-Liste erstellt.");

        while (running) {
            System.out.println("Was wollen Sie tun? (a)dd - (d)elete - (p)rint - (c)lose? ");
            entry = scan.next();

            switch (entry) {
                case "a":
                    System.out.println("Welcher Wert soll hinzugefügt werden? ");
                    liste.add(scan.nextInt());
                    System.out.println("Listenausgabe: " + liste);
                    break;
                case "d":
                    liste.delete(liste.getHeadElement()); // Lösche Element nach dem ersten
                    System.out.println("Listenausgabe: " + liste);
                    break;
                case "p":
                    System.out.println("Listenausgabe: " + liste);
                    break;
                case "c":
                    running = false;
                    break;
                default:
                    System.out.println("Bitte nur gültige Werte angeben.");
            }
        }
    }
}


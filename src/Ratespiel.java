import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ratespiel {
    static int min = 1;
    static int max = 10;
    static int myNumber = ThreadLocalRandom.current().nextInt(min, max + 1);
    static int tries;
    static boolean guessedCorrectly;

    public static void main(String[] args) {
        System.out.println("Willkommen beim Ratespiel!");
        System.out.println("Du hast 3 Versuche und glaub ja nicht es gibt irgendwelche Tipps!");
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;
        while (playAgain) {
            tries = 0;
            guessedCorrectly = false;
            myNumber = ThreadLocalRandom.current().nextInt(min, max + 1);
            while (tries < 3 && !guessedCorrectly) {
                nextRound(scanner);
            }
            System.out.println("Spiel beendet.");
            System.out.println("Möchtest du noch einmal spielen? (j/n)");
            String replay = scanner.next();
            scanner.nextLine();
            if (replay.equals("j")) {
            } else {
                playAgain = false;
                System.out.println("Auf Wiedersehen!");
            }

        }
        scanner.close();
    }

    public static void nextRound(Scanner scanner) {
        int number = 0;
        tries = tries +1;
        if (tries <= 3)
        System.out.println("Gib eine Zahl zwischen 1 und 10 ein: ");
        if (tries <= 3)
        System.out.println("Pssst, hier ein kleiner Tipp: " + myNumber);
        if (!scanner.hasNextInt()) {
        System.out.println("Bitte gib eine Zahl ein!");
        scanner.nextLine();
        tries --;
        return;
        }
        else {
            number = scanner.nextInt();
        }
        scanner.nextLine();
        guess(number);
        }


    public static void guess(int number) {
        if (number == myNumber) {
            System.out.println("Richtig geraten!");
            guessedCorrectly = true;
            System.out.println("Du hast " + tries + " Versuch/e gebraucht.");
        } else {
            if (number < myNumber) {
                System.out.println("Zu niedrig!");
                if (tries < 3)
                System.out.println("Versuche es noch einmal!");
                System.out.println("");
            }
            if (number > myNumber) {
                System.out.println("Zu hoch!");
                if (tries < 3)
                System.out.println("Versuche es noch einmal!");
                System.out.println("");
            }
            if (tries >= 3) {
                System.out.println("Verloren! Du musst die Augen aufmachen um den Tipp " + myNumber + " zu sehen.");
            }
        }
    }
}
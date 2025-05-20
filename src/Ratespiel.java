import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ratespiel {
    static int min = 1;
    static int max = 10;
    static int myNumber = ThreadLocalRandom.current().nextInt(min, max + 1);

    public static void main(String[] args) {
        nextRound();
    }

    public static void nextRound() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib eine Zahl zwischen 1 und 10 ein: ");
        System.out.println("Pssst, hier ein kleiner Tipp: " + myNumber);
        int number = scanner.nextInt();
        guess(number);
    }

    public static void guess(int number) {
        if (number == myNumber) {
            System.out.println("Richtig geraten!");
            System.out.println();
        } else {
            if (number < myNumber) {
                System.out.println("Zu niedrig!");
                System.out.println("Versuche es noch einmal!");
                System.out.println("");
            }
            if (number > myNumber) {
                System.out.println("Zu hoch!");
                System.out.println("Versuche es noch einmal!");
                System.out.println("");
            }
            nextRound();
        }
    }
    /*
    public static void tries(int number) {
        if guess();
    }
     */

}
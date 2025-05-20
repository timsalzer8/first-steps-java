import java.util.Scanner;

public class Waehrungsrechner {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.print("Geben Sie einen Betrag in EUR ein: ");
        Double money = scanner.nextDouble();
        convertToDollars(money);
        convertToBaht(money);
        convertToYen(money);
    }
    public static void convertToDollars(Double eur) {
        System.out.println("Der Betrag in Dollar ist: " + eur * 1.12);
    }
    public static void convertToBaht(Double eur) {
        System.out.println("Der Betrag in Baht ist: " + eur * 37.28);
    }
    public static void convertToYen(Double eur) {
        System.out.println("Der Betrag in Yen ist: " + eur * 163.35);
    }
}

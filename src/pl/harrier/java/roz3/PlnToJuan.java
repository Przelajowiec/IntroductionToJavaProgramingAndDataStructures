package pl.harrier.java.roz3;

import java.util.Scanner;

public class PlnToJuan {
    public static void main(String[] args) {
        System.out.print("Podaj kurs wymiany złotych na juany: ");
        Scanner scanner = new Scanner(System.in);
        double exchangeRate = scanner.nextDouble();
        System.out.print("Wpisz 0, aby przeliczyć złote na juany, i 1, by przeliczyć  juany na złote: ");
        int currency = scanner.nextInt();

        if (currency == 0) {
            System.out.print("Podaj kwotę w złotych: ");
            double amount = scanner.nextDouble();
            double amountAfter = exchangeCurrency(amount, exchangeRate, currency);
            System.out.printf("%.2f PLN to %.2f CNY", amount, amountAfter);
        } else if (currency == 1) {
            System.out.print("Podaj kwotę w juanach: ");
            double amount = scanner.nextDouble();
            double amountAfter = exchangeCurrency(amount, exchangeRate, currency);
            System.out.printf("%.2f CNY to %.2f PLN", amount, amountAfter);
        } else {
            System.out.println("Nieprawidłowe dane wejściowe.");
        }

    }
    public static double exchangeCurrency(double amount, double exchangeRate, int currency) {
        if (currency == 0) {
            return amount * exchangeRate;
        } else if (currency == 1) {
            return amount * 1 / exchangeRate;
        }
        return 0;
    }
}

package pl.harrier.java.roz3;

import java.util.Scanner;

public class TipCounter {
    public static void main(String[] args) {
        System.out.print("Podaj cenę posiłku i procent napiwku: ");
        Scanner scanner = new Scanner(System.in);
        double mealPrice = scanner.nextDouble();
        double tipPercent = scanner.nextDouble();

        double tip = (mealPrice / 100) * tipPercent;
        double toPay = mealPrice + tip;

        System.out.printf("Wysokość napiwku: %.2f zł, do zapłaty: %.2f zł.\n", tip, toPay);
    }
}

package pl.harrier.java.roz2;

import java.util.Scanner;

public class PoundToKilogram {
    public static void main(String[] args) {
        System.out.println("Podaj wartość w funtach: ");
        Scanner scanner = new Scanner(System.in);
        double pound = scanner.nextDouble();
        double kilo = pound * 0.454;
        System.out.printf("%.2f w funtach to %.2f w kilogramach.", pound, kilo);
    }
}

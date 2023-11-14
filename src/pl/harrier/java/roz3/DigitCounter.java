package pl.harrier.java.roz3;

import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        System.out.print("Podaj liczbę: ");
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        long sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Suma cyfr wynosi: " + sum);
    }
}

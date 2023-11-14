package pl.harrier.java.roz3;

import java.util.Scanner;

public class TimeCounter {
    public static void main(String[] args) {
        System.out.print("Podaj liczbę minut: ");
        Scanner scanner = new Scanner(System.in);
        long minutes = scanner.nextLong();

        int hours = (int)minutes / 60;
        int years = hours / 24 / 365;
        int days = (hours - (years * 24 * 365)) / 24;

        System.out.printf("%d minut to w przybliżeniu %d lat i %d dni.", minutes, years, days);
    }
}

package pl.harrier.java.roz3;

import java.util.Scanner;

public class DayPredict {
    public static void main(String[] args) {
        String[] daysOfWeek = {"niedziela", "poniedziałek", "wtorek", "środa", "czwartek",
        "piątek", "sobota"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj numer dnia tygodnia: ");
        int day = scanner.nextInt();
        System.out.print("Podaj liczbę dni do jakiejś przyszłej daty: ");
        int nextDay = (scanner.nextInt() + day) % 7;
        System.out.printf("Dziś jest %s, a wskazany przyszły dzień to %s", daysOfWeek[day], daysOfWeek[nextDay] );
    }
}

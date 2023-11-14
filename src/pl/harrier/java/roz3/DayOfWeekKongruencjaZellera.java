package pl.harrier.java.roz3;

import java.util.Scanner;

public class DayOfWeekKongruencjaZellera {
    //Algorytm Christiana Zellera do obliczania dnia tygodnia

    public static void main(String[] args) {
        int dayOfMonth, month, year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program do odnajdywania dni tygodnia.\n");
        System.out.print("Podaj rok (np 2023): ");
        year = scanner.nextInt();
        System.out.print("Podaj miesiąc ( od 1 do 12): ");
        month = scanner.nextInt();
        System.out.print("Podaj dzień miesiąca (od 1 do 31): ");
        dayOfMonth = scanner.nextInt();

        System.out.println("Dzień tygodnia: " + calculateDay(year, month, dayOfMonth));
    }
    public static String calculateDay(int year, int month, int day) {
        int century;
        century = year / 100;
        year = year % 100;
        if (month < 3) {
            month += 12;
            year--;
        }
        int dofw = (day + 26 * (month + 1) / 10 + year + year / 4 + century / 4 + 5 * century) % 7;
        switch (dofw) {
            case 0 -> {
                return "Sobota";
            }
            case 1 -> {
                return "Niedziela";
            }
            case 2 -> {
                return "Poniedziałek";
            }
            case 3 -> {
                return "Wtorek";
            }
            case 4 -> {
                return "Środa";
            }
            case 5 -> {
                return "Czwartek";
            }
            case 6 -> {
                return "Piątek";
            }

        }
        return "Coś poszło nie tak";


    }
}

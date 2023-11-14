package pl.harrier.java.roz3;

import java.util.Scanner;

public class ActualTime {
    public static void main(String[] args) {
        System.out.print("Podaj różnicę względem strefy czasowej GMT: ");
        Scanner scanner = new Scanner(System.in);
        int timeShift = scanner.nextInt();

        long TotalMillis = System.currentTimeMillis();
        // ustalamy sekundy
        long TotalSecond = TotalMillis / 1000;
        long currentSecond = TotalSecond % 60;
        // ustalamy minuty
        long TotalMinute = TotalSecond / 60;
        long currentMinute = TotalMinute % 60;
        // ustalamy godziny
        long TotalHour = TotalMinute / 60;
        long currentGMTHour = TotalHour % 24;
        // aktualizujemy strefę czasową
        long currentHour = currentGMTHour + timeShift;

        System.out.printf("Aktualny czas to %d:%d:%02d", currentHour, currentMinute, currentSecond);
    }
}

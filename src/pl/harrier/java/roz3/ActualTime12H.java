package pl.harrier.java.roz3;

import java.util.Scanner;

public class ActualTime12H {
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
        // przestawiamy zegar na 12-to godzinny
        String dayNight = "AM";
        if (currentGMTHour > 12) {
            currentGMTHour -= 12;
            dayNight = "PM";
        }
        // aktualizujemy strefę czasową
        long currentHour = currentGMTHour + timeShift;

        System.out.printf("Aktualny czas to %d:%d:%02d %s",
                currentHour, currentMinute, currentSecond, dayNight);
    }
}

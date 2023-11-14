package pl.harrier.java.roz3;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        //generowanie liczby trzycyfrowej
        int lottery = (int)(Math.random() * 1000);
        //wydruk liczby do testowania programu, należy zakomentownać przy implementacji!
        //System.out.println("Wylosowana liczba (na potrzeby testowania programu: " + lottery);

        //prośba o wytypowanie liczby przez urzytkownika
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wytypuj liczbę (trzy cyfry): ");
        int quess = scanner.nextInt();

        //pobieranie cyfr z wylosowanej liczby
        int lotteryDigit1 = lottery / 100;
        int lotteryDigit2 = (lottery / 10) % 10;
        int lotteryDigit3 = lottery % 10;

        //pobieranie cyfr z wylosowanej liczby
        int quessDigit1 = quess / 100;
        int quessDigit2 = (quess / 10) % 10;
        int quessDigit3 = quess % 10;

        System.out.println("Wygenerowana liczba to: " + lottery);

        //sprawdzanie liczby
        if (quess == lottery) {
            System.out.println("Pełne dopasowanie - wygrałeś 10 000 zł");
        } else if (quessDigit1 == lotteryDigit1 || quessDigit1 == lotteryDigit2 || quessDigit1 == lotteryDigit3 &&
                quessDigit2 == lotteryDigit1 || quessDigit2 == lotteryDigit2 || quessDigit2 == lotteryDigit3  &&
                quessDigit3 == lotteryDigit1 || quessDigit3 == lotteryDigit2 || quessDigit3 == lotteryDigit3) {
            System.out.println("Dopasowanie trzech cyfr - wygrywasz 3000 zł");
        } else if (quessDigit1 == lotteryDigit1 || quessDigit1 == lotteryDigit2 || quessDigit1 == lotteryDigit3 ||
                quessDigit2 == lotteryDigit1 || quessDigit2 == lotteryDigit2 || quessDigit2 == lotteryDigit3  ||
                quessDigit3 == lotteryDigit1 || quessDigit3 == lotteryDigit2 || quessDigit3 == lotteryDigit3) {
            System.out.println("Dopasowanie przynajmniej jednej cyfry - wygrywasz 1000 zł");
        } else {
            System.out.println("Niestety, brak dopasowania");
        }
    }
}

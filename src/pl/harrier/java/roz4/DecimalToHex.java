package pl.harrier.java.roz4;

import java.util.Scanner;

public class DecimalToHex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę to zakodowania w systemie heksagonalnym: ");
        int number = scanner.nextInt();
        System.out.printf("%d w systemi szestnastkowym to %X", number, number);
    }
}

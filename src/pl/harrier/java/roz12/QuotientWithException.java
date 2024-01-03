package pl.harrier.java.roz12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class QuotientWithException {
    public static int quotient(int number1, int number2) {
        if (number2 == 0) {
            new ArithmeticException("Nie można dzielić przez zero!");
        }
        return number1 / number2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wpisz dwie liczby całkowite: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        try {
            int result = quotient(number1, number2);
            System.out.println(number1 + " / " + number2 + " równa się " + result);
        }
        catch (ArithmeticException ex) {
            System.out.println("Wyjątek liczby całkowitej, nie można dzielić przez zero");
        }
        System.out.println("Kontynuowanie pracy...");
    }
}

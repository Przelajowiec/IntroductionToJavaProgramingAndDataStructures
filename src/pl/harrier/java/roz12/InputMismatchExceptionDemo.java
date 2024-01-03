package pl.harrier.java.roz12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class InputMismatchExceptionDemo {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean continueInput = true;

        do {
            try {
                System.out.print("Podaj liczbę całkowitą: ");
                int number = Integer.parseInt(reader.readLine());

                System.out.println("Podana liczba to: " + number);
                continueInput = false;
            }
            catch (Exception ex) {
                System.out.println("Podana liczba nie jest liczbą całkowitą!");
            }

        }
        while (continueInput);
    }
}

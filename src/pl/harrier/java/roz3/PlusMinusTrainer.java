package pl.harrier.java.roz3;

import java.util.Random;
import java.util.Scanner;

public class PlusMinusTrainer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean game = true;
        boolean cont = false;
        while (game) {
            System.out.println("Witaj na gimnastyce mózgu.\n Zaczynamy? [y] / jeśli chcesz wyjść wciśnij [q]");

            String input = scanner.next();
            if (input.equals("Y")) {
                game = false;
                cont = true;
            } else if (input.equals("N")) {
                game = false;
                cont = false;
            } else {
                System.out.println("Coś poszło nie tak, gramy czy nie? T/N");
                game = true;
            }
        }
        while (cont) {
            System.out.print("Podaj ile razy chcesz zgadywać: ");
            int howManyTimes = scanner.nextInt();
            int good = 0;
            int bad = 0;
            for (int i = howManyTimes; i > 0; i--) {
                int first = (int) (Math.random() * 100);
                int second = (int) (Math.random() * 100);
                int operation = (int)Math.round(Math.random());
                String op = "";
                int result = 0;
                int answer;
                if (operation == 0) {
                    result = first - second;
                    op = " - ";
                } else if (operation == 1) {
                    result = first + second;
                    op = " + ";
                }
                System.out.print(first + op + + second + " = ");
                answer = scanner.nextInt();
                if (answer == result) {
                    System.out.println("OK. " + first + op + + second + " = " + result);
                    good++;
                } else {
                    System.out.println("NIE. " + first + op + + second + " = " + result);
                    bad++;
                }
            }
            System.out.println("Dobrych odpowiedzi: " + good + "\nZłych odpowiedzi: " + bad);
            System.out.println("gramy dalej? T/N");
            String gameStill = scanner.next();
            if (gameStill.equals("[YyTt")) {
                cont = true;
            } else {
                cont = false;
            }
        }
    }
}

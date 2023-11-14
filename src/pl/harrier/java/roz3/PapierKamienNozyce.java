package pl.harrier.java.roz3;

import java.util.Scanner;

public class PapierKamienNozyce {
    public static void main(String[] args) {
        int computer = (int)(Math.random() * 3);

        System.out.print("Wybierz: nożyce (0), kamień (1), papier (2): ");
        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();
        System.out.printf("Komputer wybrał %s. Gracz wybrał %s. %s"
                ,choose(computer), choose(user), winner(computer, user));
    }
    static String choose(int number) {
        switch (number) {
            case 0 -> {
                return "nożyce";
            }
            case 1 -> {
                return "kamień";
            }
            case 2 -> {
                return "papier";
            }
        } return "";
    }
    static String winner(int computer, int user) {
        if (computer == user) {
            return "Remis";
        } else if (computer + 1 == user) {
            return "Wygrał gracz";
        } else if (user + 1 == computer) {
            return "Wygrał komputer";
        } else if (computer + 2 == user) {
            return "Wygrał komputer";
        } else if (user + 2 == computer) {
            return "Wygrał gracz";
        }
        return "";
    }
}

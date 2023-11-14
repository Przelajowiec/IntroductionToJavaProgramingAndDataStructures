package pl.harrier.java.roz3;

import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        int number3 = (int)(Math.random() * 10);
        int sum = number1 + number2 + number3;

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Ile wynosi suma %d + %d + %d? ", number1, number2, number3);

        int answer = scanner.nextInt();

        if (sum == answer) {
            System.out.println("Dobra odpowiedź, suma równa się: " + sum);
        } else {
            System.out.println("Zła odpowiedź, suma równa się: " + sum);
        }
    }
}

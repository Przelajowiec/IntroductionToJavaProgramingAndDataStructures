package pl.harrier.java.roz3;

import java.util.Scanner;

public class ISBNChesk {
    public static void main(String[] args) {
        System.out.print("Podaj pierwszych 9 cyfr numeru ISBN: ");
        Scanner scanner = new Scanner(System.in);
        int isbnInput = scanner.nextInt();
        int isbnCheck = isbnInput;
        int isbn = 0;
        int temp;
        for (int i = 9; i > 0; i--) {
            temp = isbnCheck % 10;
            isbnCheck /= 10;
            temp *= i ;
            isbn += temp;
        }
        int number = isbn % 11;
        String finalISBN = "";
        if (number == 10) {
            finalISBN = isbnInput + "X";
        } else {
            finalISBN = isbnInput + "" + number;
        }
        System.out.println("Numer ISBN-10 to " + finalISBN);
    }
}

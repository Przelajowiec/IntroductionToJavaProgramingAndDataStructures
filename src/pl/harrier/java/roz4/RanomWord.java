package pl.harrier.java.roz4;

import java.util.Scanner;

public class RanomWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = (int)(2 + Math.random() * 12);
        char[] word = new char[len];
        for (int i = 0; i < len; i++) {
            char letter = (char)(65 + Math.random() * (123-65));
            if (letter < 'z' && letter > 'A') {
                word[i] = letter;
            }
        }
        System.out.println(word);
    }
}

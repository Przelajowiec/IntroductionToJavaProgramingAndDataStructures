package pl.harrier.java.roz4;

import java.util.Scanner;

public class AsciiCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean go = true;

        while (go) {
            System.out.print("""
                    Wybierz w którą stronę chcesz tłumaczyć kod:
                    ASCII -> Unicode: wybierz 1
                    Unicode -> ASCII: wybierz 2
                    Zakończenie programu: wybierz 0
                    >> \t""");
            int choise = scanner.nextInt();
            switch (choise) {
                case 0 ->  go = false;
                case 1 -> {
                    System.out.print("Podaj kod ASCII: ");
                    int ascii = scanner.nextInt();
                    System.out.printf("Znak odpowiadający kodowi ASCII: %d to %s\n", ascii, (char) ascii);
                    System.out.println();
                    System.out.println("-".repeat(100));
                }
                case 2 -> {
                    System.out.print("Podaj znak Unicode: ");
                    String toAsciiString = scanner.next();
                    char toAscii = toAsciiString.charAt(0);
                    System.out.printf("Kod Unicode odpowiadający znakowi %s to %d\n", toAscii, (int)toAscii);
                    System.out.println();
                    System.out.println("-".repeat(100));
                }
                default -> System.out.println("Zły wybór :(");
            }
        }
        scanner.close();



    }
}

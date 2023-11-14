package pl.harrier.java.roz2;

import java.util.Scanner;

public class dwa_2 {
    public static void main(String[] args) {
        double promien = 0;
        double wysokosc = 0;
        System.out.println("Podaj promień i wysokość walca:");
        Scanner scanner = new Scanner(System.in);
        promien = scanner.nextDouble();
        wysokosc = scanner.nextDouble();
        double powierzniaPodatawy = promien * promien * Math.PI;
        double objetosc = powierzniaPodatawy * wysokosc;
        System.out.printf("Powierzchnia podstawy wynosi: %.2f\n", powierzniaPodatawy);
        System.out.printf("Objętość wynosi: %.2f\n", objetosc);
    }

}

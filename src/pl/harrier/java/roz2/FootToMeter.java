package pl.harrier.java.roz2;

import java.util.Scanner;

public class FootToMeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wartość w stopach: -> ");
        double foot = scanner.nextDouble();
        double meter = foot * 0.305;
        System.out.printf("%.2f w stopach to %.3f w metrach.\n", foot, meter);
    }
}

package pl.harrier.java.roz3;

import java.util.Scanner;

public class RownanieLiniowe {
    public static void main(String[] args) {
        System.out.println("Podaj a, b, c, d, e i f: ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();

        if ((a * d - b * c) == 0) {
            System.out.println("Równanie nie ma rozwiązania.");
        } else {

            double x = (e * d - b * f) / (a * d - b * c);
            double y = (a * f - e * c) / (a * d - b * c);

            System.out.printf("x jest równe: %f, a y jest równe: %f", x, y);
        }
    }
}

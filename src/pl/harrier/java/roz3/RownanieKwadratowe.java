package pl.harrier.java.roz3;

import java.util.Scanner;

public class RownanieKwadratowe {
    public static void main(String[] args) {
        System.out.print("Podaj a, b, c równania kwadratowego: ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        scanner.close();
        double result = b * b - 4 * a * c;
        if (result < 0) {
            System.out.println("Równanie nie ma pierwiastków kwadratowych.");
        } else {
            double r1 = (-b + Math.sqrt(result)) / 2 * a;
            if (result > 0) {
                double r2 = (- b - Math.sqrt(result))/2 * a;
                System.out.printf("Równanie ma dwa pierwiastki: %f i %f\n", r1, r2);
            } else {
                System.out.printf("Równanie ma pierwiastek: %f\n", r1);
            }
        }
    }
}

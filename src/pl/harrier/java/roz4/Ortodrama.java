package pl.harrier.java.roz4;

import java.util.Scanner;

public class Ortodrama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program do obliczania bezwzglednej odległości między miejscami na ziemi");
        System.out.println("-".repeat(30));
        System.out.print("Podaj punkt pierwszy (szerokość i wysokość) w stopniach: ");
        double latitude1 = Math.toRadians(scanner.nextDouble());
        double longitude1 = Math.toRadians(scanner.nextDouble());
        System.out.print("Podaj punkt drugi (szerokość i wysokość) w stopniach: ");
        double latitude2 = Math.toRadians(scanner.nextDouble());
        double longitude2 = Math.toRadians(scanner.nextDouble());
        double distance = 6371.01 * Math.acos(Math.sin(latitude1) * Math.sin(latitude2) +
                Math.cos(latitude1) * Math.cos(latitude2) * Math.cos(longitude1 - longitude2));
        System.out.printf("Odlagłość między tymi punktami wynosi: %.3f km.", distance);

    }
}

package pl.harrier.java.roz2;

import java.util.Scanner;

public class dwa_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Przeliczanie temperatury ze stopnie Celcjusza na Fahrenheita i na odwrót:");
        System.out.println("Podaj skalę w jakiej będzie wprowadzona temperatura(F/C):");
        String scale = scanner.next();
        String choice = scale.equals("F")? "Celcjusza" : scale.equals("C")?"Fahrenthaita" : "Zły wybór";
        System.out.println("Podaj temperaturę do przeliczenia na stopnie " + choice );
        double temp = scanner.nextDouble();
        double temp1;
        if (scale.equals("F")) {
             temp1 = ((temp - 32) / 1.8) * 100;
        } else if (scale.equals("C")) {
            temp1 = ((9.0 / 5) * temp + 32) * 100;
        } else {
            temp1 = 0;
        }
        System.out.println("Stopnie " + choice +" " + temp + ", Stopnie po przeliczeniu: " + (int)(temp1)/100.0);
    }
}

package pl.harrier.java.roz9;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Stoper stoper = new Stoper();
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(5, 6.3);


        System.out.printf("prostokąt1 o bokach: %.2f x %.2f ma pole = %.2f oraz obwód = %.2f\n"
        , rectangle1.getWidth(), rectangle1.getHeight(), rectangle1.getArea(), rectangle1.getPerimeter());

        System.out.printf("prostokąt2 o bokach: %.2f x %.2f ma pole = %.2f oraz obwód = %.2f\n"
                , rectangle2.getWidth(), rectangle2.getHeight(), rectangle2.getArea(), rectangle2.getPerimeter());

        Stock oracle = new Stock("ORCL", "Oracle Corporation");
        oracle.setPreviousClosingPrice(34.5);
        oracle.setCurrentPrice(34.35);

        System.out.println(oracle.toString());
        stoper.stop();
        System.out.println(stoper.getElapseTime());
    }
}

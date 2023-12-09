package pl.harrier.java.roz7;

public class calculator {
    public static void main(String[] args) {
        int first = Integer.parseInt(args[0]);
        String symbol = args[1];
        int second = Integer.parseInt(args[2]);

        switch (symbol) {
            case "+" -> {
                System.out.printf("%d + %d = %d\n", first, second, first+second);
            }
            case "-" -> {
                System.out.printf("%d - %d = %d\n", first, second, first-second);
            }
            case "." -> {
                System.out.printf("%d * %d = %d\n", first, second, first*second);
            }
            case "/" -> {
                System.out.printf("%d / %d = %d\n", first, second, first/second);
            }
            default -> System.out.println("bad values");
        }


    }
}

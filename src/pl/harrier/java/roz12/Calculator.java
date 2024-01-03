package pl.harrier.java.roz12;


public class Calculator {
    public static void main(String[] args) {
        try {
            int number1 = Integer.parseInt(args[0]);
            String symbol = args[1];
            int number2 = Integer.parseInt(args[2]);

            switch (symbol) {
                case "-" -> {
                    System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));;
                }
                case "+" -> {
                    System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));;
                }
                case "*" -> {
                    System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));;
                }
                case "/" -> {
                    System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));;
                }
                default -> {
                    System.out.println("Niedozwolone działanie: " + symbol);
                }
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Błędne dane wejściowe: " + e.getMessage().substring(19, e.getMessage().length() - 1));
        }
        catch (ArithmeticException ex) {
            System.out.println("Zabronione działanie, nie można dzielić przez zero!");
        }
        catch (ArrayIndexOutOfBoundsException ex1) {
            System.out.println("Niewłaściwa ilość danych wejściowych");
        }
    }
}

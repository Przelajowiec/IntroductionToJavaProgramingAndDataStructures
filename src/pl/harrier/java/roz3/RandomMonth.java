package pl.harrier.java.roz3;

public class RandomMonth {
    public static void main(String[] args) {
        String[] months = {"Styczeń", "Luty", "Marzec", "Kwiecień", "Maj", "Czerwiec",
        "Lipiec", "Sierpień", "Wrzesień", "Październik", "Listopad", "Grudzień"};

//        int max = (int)(0.99999 * 12);
//        System.out.println("test: " + max);

        int randomMonth = (int)(Math.random() * 12);
        System.out.println(months[randomMonth]);
    }
}

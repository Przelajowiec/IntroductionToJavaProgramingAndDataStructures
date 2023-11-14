package pl.harrier.java.roz3;

public class CardDraw {
    public static void main(String[] args) {
        String[] card = {"As", "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "Walet", "Dama", "Król"};
        String[] colour = {"Trefl", "Karo", "Kier", "Pik"};

        int cardDraw = (int)(Math.random() * 13);
        int colourDraw = (int)(Math.random() * 4);
        System.out.println("Wylosowana karta: " + card[cardDraw] + " " + colour[colourDraw]);

    }
}

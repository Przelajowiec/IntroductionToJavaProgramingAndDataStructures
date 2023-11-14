package pl.harrier.java.roz3;

public class RandomPointKartezjusz {
    public static void main(String[] args) {
        int xCoordinate = -50 + (int)(Math.random() * 100);
        int yCoordinate = -100 + (int)(Math.random() * 200);

        System.out.printf("Przypadkowe współrzędne punktu w prostokątie 100x200" +
                " w przestrzeni Kartejańskiej: (%d,%d)\n",xCoordinate, yCoordinate);
    }
}

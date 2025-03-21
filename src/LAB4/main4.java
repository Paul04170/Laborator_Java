package LAB4;

import java.util.*;

public class main4 {
    public static void main(String[] args) {
        Random rand = new Random();

        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();

        // Generare valori aleatorii pentru x (5 elemente) și y (7 elemente) în domeniul [0..10]
        for (int i = 0; i < 5; i++) {
            x.add(rand.nextInt(11));
        }
        for (int i = 0; i < 7; i++) {
            y.add(rand.nextInt(11));
        }

        // Ordonare liste
        Collections.sort(x);
        Collections.sort(y);

        // a) xPlusY - conține toate elementele din x și y
        List<Integer> xPlusY = new ArrayList<>(x);
        xPlusY.addAll(y);
        Collections.sort(xPlusY);
    }
}
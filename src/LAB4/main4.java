package LAB4;

import java.util.*;
 class ListOperations {
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

        // b) zSet - conține numai valorile comune din x și y, fără duplicate
        Set<Integer> zSet = new TreeSet<>(x);
        zSet.retainAll(y);

        // c) xMinusY - conține valorile din x care nu sunt în y
        List<Integer> xMinusY = new ArrayList<>(x);
        xMinusY.removeAll(y);

        // d) xPlusYLimitedByP - elementele din x și y ce nu depășesc valoarea p
        int p = 4;
        List<Integer> xPlusYLimitedByP = new ArrayList<>();
        for (int num : xPlusY) {
            if (num <= p) {
                xPlusYLimitedByP.add(num);
            }
        }

        // Afișare rezultate
        System.out.println("Lista x: " + x);
        System.out.println("Lista y: " + y);
        System.out.println("xPlusY: " + xPlusY);
        System.out.println("zSet: " + zSet);
        System.out.println("xMinusY: " + xMinusY);
        System.out.println("xPlusYLimitedByP: " + xPlusYLimitedByP);
    }
}
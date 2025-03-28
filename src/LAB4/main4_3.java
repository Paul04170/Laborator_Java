package LAB4;
import java.util.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class main4_3 {

    public class Main {
        public static void main(String[] args) {
            List<studenti> studenti = new ArrayList<>();
            studenti.add(new studenti("Popescu Andrei", "Grupa 1"));
            studenti.add(new studenti("Ionescu Maria", "Grupa 2"));
            studenti.add(new studenti("Dumitrescu Vlad", "Grupa 1"));
            studenti.add(new studenti("Georgescu Ana", "Grupa 3"));
            studenti.add(new studenti("Stan Mihai", "Grupa 2"));

            // b1) Sortare alfabetică pe grupe
            studenti.sort(Comparator.comparing(LAB4.studenti::getGrupa).thenComparing(LAB4.studenti::getNume));
            System.out.println("Sortare alfabetică pe grupe:");
            studenti.forEach(System.out::println);

            // b2) Sortare descrescătoare a mediilor pentru integraliști
            List<studenti> integralisti = studenti.stream()
                    .filter(LAB4.studenti::isIntegralist)
                    .sorted(Comparator.comparingDouble(LAB4.studenti::getMedie).reversed())
                    .toList();
            System.out.println("\nIntegraliști (ordine descrescătoare a mediilor):");
            integralisti.forEach(System.out::println);

            // b3) Sortare crescătoare a numărului de restanțe pentru restanțieri
            List<studenti> restantieri = studenti.stream()
                    .filter(s -> !s.isIntegralist())
                    .sorted(Comparator.comparingInt(LAB4.studenti::getRestante))
                    .toList();
            System.out.println("\nRestanțieri (ordine crescătoare a numărului de restanțe):");
            restantieri.forEach(System.out::println);
        }
    }
}

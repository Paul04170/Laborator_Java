package LAB4;

import java.util.*;

public class studenti {
    private String nume;
    private String grupa;
    private List<Integer> note;

    public studenti(String nume, String grupa) {
        this.nume = nume;
        this.grupa = grupa;
        this.note = new ArrayList<>();
        randomizeGrades();
    }

    private void randomizeGrades() {
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            note.add(rand.nextInt(7) + 4); // Note între 4 și 10
        }
    }

    public double getMedie() {
        return note.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    public int getRestante() {
        return (int) note.stream().filter(n -> n < 5).count();
    }

    public String getGrupa() {
        return grupa;
    }

    public String getNume() {
        return nume;
    }

    public boolean isIntegralist() {
        return getRestante() == 0;
    }

    @Override
    public String toString() {
        return nume + " - " + grupa + " - Note: " + note + " - Medie: " + getMedie();
    }
}


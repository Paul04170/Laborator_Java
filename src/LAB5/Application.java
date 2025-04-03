package LAB5;

import java.io.*;

public class Application {
    public static void main(String[] args) {
        String inputFile = "in.txt";
        String outputFile = "out.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                // a) Adăugăm un newline după fiecare linie
                writer.write(line + "\n\n");
                System.out.println(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reîncepem citirea fișierului pentru partea b
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile, true))) { // true pentru append

            String line;
            while ((line = reader.readLine()) != null) {
                // b) Adăugăm un newline după fiecare caracter punct
                line = line.replace(".", ".\n");
                writer.write(line + "\n");
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
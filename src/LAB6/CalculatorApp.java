package LAB6;

public class CalculatorApp {
    public static void main(String[] args) {
        // Creăm obiecte de tip NewIntCalculator și DoubleCalculator
        NewIntCalculator intCalculator = new NewIntCalculator();
        DoubleCalculator doubleCalculator = new DoubleCalculator();

        // Operațiile pentru int:(10 + 5 - 3) * 2
        intCalculator.add(10);
        intCalculator.add(5);
        intCalculator.subtract(3);
        intCalculator.multiply(2);
        System.out.println("Rezultatul pentru int: " + intCalculator.result());  // Așteptat: 24

        // Operațiile pentru double:(10 + 5 - 3.3) * 2.2
        doubleCalculator.add(10);
        doubleCalculator.add(5);
        doubleCalculator.subtract(3.3);
        doubleCalculator.multiply(2.2);
        System.out.println("Rezultatul pentru double: " + doubleCalculator.result());  // Așteptat: 25.94
    }
}
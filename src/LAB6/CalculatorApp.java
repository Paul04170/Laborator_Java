package LAB6;

public class CalculatorApp {
    public static void main(String[] args) {
        NewIntCalculator intCalc = new NewIntCalculator(10);
        int intResult = intCalc.add(5).subtract(3).multiply(2).result();
        System.out.println("a) " + intResult);

        DoubleCalculator doubleCalc = new DoubleCalculator(10.0);
        double doubleResult = doubleCalc.add(5).subtract(3.3).multiply(2.2).result();
        System.out.println("b) " + doubleResult);
}
}

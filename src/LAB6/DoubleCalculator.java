package LAB6;

class DoubleCalculator extends ACalculator {

    // Constructor
    public DoubleCalculator() {
        init(); // Inițializare
    }

    // Implementarea metodei init pentru a inițializa starea cu 0.0
    @Override
    public void init() {
        state = 0.0; // Setăm starea la 0.0 (tip Double)
    }

    // Metodă pentru adunare
    public void add(double value) {
        state = (Double) state + value;
    }

    // Metodă pentru scădere
    public void subtract(double value) {
        state = (Double) state - value;
    }

    // Metodă pentru înmulțire
    public void multiply(double value) {
        state = (Double) state * value;
    }
}
package LAB6;
class NewIntCalculator extends ACalculator {

    // Constructor
    public NewIntCalculator() {
        init(); // Inițializare
    }

    // Implementarea metodei init pentru a inițializa starea cu 0
    @Override
    public void init() {
        state = 0; // Setăm starea la 0 (tip Integer)
    }

    // Metodă pentru adunare
    public void add(int value) {
        state = (Integer) state + value;
    }

    // Metodă pentru scădere
    public void subtract(int value) {
        state = (Integer) state - value;
    }

    // Metodă pentru înmulțire
    public void multiply(int value) {
        state = (Integer) state * value;
    }
}
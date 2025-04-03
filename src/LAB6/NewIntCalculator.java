package LAB6;

class NewIntCalculator extends ACalculator<Integer> {

    public NewIntCalculator(Integer initialValue) {
        super(initialValue);
    }

    @Override
    public NewIntCalculator init(Integer value) {
        this.state = value;
        return this;
    }

    public NewIntCalculator add(int value) {
        this.state += value;
        return this;
    }

    public NewIntCalculator subtract(int value) {
        this.state -= value;
        return this;
    }

    public NewIntCalculator multiply(int value) {
        this.state *= value;
        return this;
    }
}
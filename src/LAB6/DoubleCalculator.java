package LAB6;

class DoubleCalculator extends ACalculator<Double> {

    public DoubleCalculator(Double initialValue) {
        super(initialValue);
    }

    @Override
    public DoubleCalculator init(Double value) {
        this.state = value;
        return this;
    }

    public DoubleCalculator add(double value) {
        this.state += value;
        return this;
    }

    public DoubleCalculator subtract(double value) {
        this.state -= value;
        return this;
    }

    public DoubleCalculator multiply(double value) {
        this.state *= value;
        return this;
    }
}

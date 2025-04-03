package LAB6;

abstract class ACalculator<T extends Number> {
    protected T state;

    public ACalculator(T initialValue) {
        this.state = initialValue;
    }

    public abstract ACalculator<T> init(T value);

    public T result() {
        return state;
    }

    public ACalculator<T> clear() {
        this.state = null;
        return this;
    }
}

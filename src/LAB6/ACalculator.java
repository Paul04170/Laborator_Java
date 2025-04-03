package LAB6;

abstract class ACalculator {
    protected Object state;

    public Object result() {
        return state;
    }

    public void clear() {
        state = null;
    }

    public abstract void init();
}
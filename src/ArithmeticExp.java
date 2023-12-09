public abstract class ArithmeticExp {
    private int value;

    public ArithmeticExp(int value) {
        this.value = value;
    }

    abstract public int evaluate();

    public int getValue() {
        return value;
    }
}

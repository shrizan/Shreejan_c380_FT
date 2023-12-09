public class Number extends ArithmeticExp {
    public Number(int value) {
        super(value);
    }

    @Override
    public int evaluate() {
        return getValue();
    }

    @Override
    public String toString() {
        return "" + getValue();
    }
}

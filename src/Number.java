public class Number extends ArithmeticExp {
    public Number(ArithmeticExp exp, int value) {
        super(exp, value);
    }

    @Override
    public int evaluate() {
        return getValue();
    }
}

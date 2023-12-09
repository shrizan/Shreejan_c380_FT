public class Sum extends Binary{
    public Sum(int value, ArithmeticExp left, ArithmeticExp right) {
        super(value, left, right);
    }

    @Override
    public int evaluate() {
        return left.evaluate()+ right.evaluate();
    }

    @Override
    public String toString() {
        return String.format("%s + %s",left.toString(),right.toString());
    }
}

public class Product extends Binary {
    public Product(ArithmeticExp exp, int value, ArithmeticExp left, ArithmeticExp right) {
        super(exp, value, left, right);
    }

    @Override
    public int evaluate() {
        return left.evaluate() * right.evaluate();
    }
}

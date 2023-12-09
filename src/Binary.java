public abstract class Binary extends ArithmeticExp {
    protected ArithmeticExp left;
    protected ArithmeticExp right;

    public Binary(ArithmeticExp exp, int value, ArithmeticExp left, ArithmeticExp right) {
        super(exp, value);
        this.left = left;
        this.right = right;
    }
}

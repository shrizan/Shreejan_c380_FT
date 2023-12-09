public abstract class Binary extends ArithmeticExp {
    protected ArithmeticExp left;
    protected ArithmeticExp right;

    public Binary(int value, ArithmeticExp left, ArithmeticExp right) {
        super(value);
        this.left = left;
        this.right = right;
    }
}

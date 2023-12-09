public abstract class Binary extends ArithmeticExp {
    protected ArithmeticExp left;
    protected ArithmeticExp right;

    public Binary(ArithmeticExp left, ArithmeticExp right) {
        super(0);
        this.left = left;
        this.right = right;
    }
}

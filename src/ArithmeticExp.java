public abstract class ArithmeticExp {
    private ArithmeticExp exp;
    private int value;

    public ArithmeticExp(ArithmeticExp exp, int value) {
        this.exp = exp;
        this.value = value;
    }

    abstract public int evaluate();

    public ArithmeticExp getExp() {
        return exp;
    }

    public int getValue() {
        return value;
    }
}

// THIS IS A EXAMPLE FILE PROVIDED IN THE ASSIGNMENT
// THIS IS A EXAMPLE FILE PROVIDED IN THE ASSIGNMENT
// THIS IS A EXAMPLE FILE PROVIDED IN THE ASSIGNMENT
// THIS IS A EXAMPLE FILE PROVIDED IN THE ASSIGNMENT
// THIS IS A EXAMPLE FILE PROVIDED IN THE ASSIGNMENT
// THIS IS A EXAMPLE FILE PROVIDED IN THE ASSIGNMENT
// THIS IS A EXAMPLE FILE PROVIDED IN THE ASSIGNMENT
class ArithmeticExp1 {
    public int type;
    public int value;
    public ArithmeticExp1 left;
    public ArithmeticExp1 right;
    public ArithmeticExp1(int type, int value, ArithmeticExp1 left, ArithmeticExp1 right) {
        this.type = type;
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
/** main class */
class ArithmeticOperation {
    /** Constants for representing the types*/
    public static final int TYPE_NUMBER = 1;
    public static final int TYPE_SUM = 2;
    public static final int TYPE_PROD = 3;
    public static void main(String [] args) {
// constructing the expression 3 + 2 * 5
        ArithmeticExp1 term = new ArithmeticExp1(
                TYPE_SUM,
                0,
                new ArithmeticExp1(TYPE_NUMBER, 3, null, null),
                new ArithmeticExp1(TYPE_PROD, 0,
                        new ArithmeticExp1(TYPE_NUMBER, 2, null, null),
                        new ArithmeticExp1(TYPE_NUMBER, 5, null, null)));
        System.out.println(evaluate(term));
    }
    /** Evaluating the expression recursively */
    public static int evaluate(ArithmeticExp1 term) {
        switch (term.type) {
            case TYPE_NUMBER:
                return term.value;
            case TYPE_SUM:
                return evaluate(term.left) + evaluate(term.right);
            case TYPE_PROD:
                return evaluate(term.left) * evaluate(term.right);
            default:
                return 0; //error, should never happen
        }
    }
}
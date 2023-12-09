// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArithmeticExp number = new Number(3);
        ArithmeticExp product = new Product(0, new Number(2), new Number(5));

        ArithmeticExp sum = new Sum(0, number, product);
        System.out.println(sum + " = " + sum.evaluate());
    }
}
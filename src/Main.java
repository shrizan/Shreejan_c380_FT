// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ArithmeticExp number = new Number(3);

        ArithmeticExp product = new Product(new Number(2), new Number(5));

        ArithmeticExp sum = new Sum(number, product);
        System.out.println(sum + " = " + sum.evaluate());

        ArithmeticExp modulo = new Modulo(new Number(3), new Number(2));
        System.out.println(modulo + " = " + modulo.evaluate());
    }
}
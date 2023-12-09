// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Number number = new Number(null,3);
        Binary binary= new Product(null,0,new Number(null,2),new Number(null,5));
        System.out.println(binary.evaluate());

        Sum sum = new Sum(null,0,number,binary);
        System.out.println(sum.evaluate());
    }
}
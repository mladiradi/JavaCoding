package JavaCoding;

public class MultiplicationTable {
    public static void main(String[] args) {

        for (int h = 1; h <= 10; h++) {

            for (int m = 1; m <= 10; m++) {
                System.out.printf("%d * %d = %d%n", h, m, h * m);

            }
        }
    }
}

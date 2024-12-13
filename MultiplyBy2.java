package JavaCoding;

import java.util.Scanner;

public class MultiplyBy2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double max = Integer.MAX_VALUE;

        for (int i = 0; i < max; i++) {
            double num = Double.parseDouble(scan.nextLine());
            if (num >= 0) {
                num *= 2;
                System.out.printf("Result: %.2f%n", num);
            } else {
                System.out.println("Negative number!");
                break;
            }
        }
    }
}

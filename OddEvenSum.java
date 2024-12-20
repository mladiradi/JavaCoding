package JavaCoding;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int eSum = 0;
        int oSum = 0;
        for (int i = 0; i < n; i++) {
            int numers = Integer.parseInt(scan.nextLine());
            if (i % 2 == 0) {
                oSum += numers;
            } else {
                eSum += numers;
            }
        }
        if (eSum == oSum) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", eSum);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(eSum - oSum));
        }

    }
}

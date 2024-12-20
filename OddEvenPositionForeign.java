package JavaCoding;

import java.util.Scanner;

public class OddEvenPositionForeign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        double oddSum = 0, oddMin = Double.MAX_VALUE, oddMax = -Double.MAX_VALUE
                , evenSum = 0, evenMin = Double.MAX_VALUE, evenMax = -Double.MAX_VALUE, num = 0;
        for (int i = 1; i <= n; i++) {
            num = Double.parseDouble(sc.nextLine());

            if (i % 2 == 0) {
                evenSum += num;
                evenMax = Math.max(num, evenMax);
                evenMin = Math.min(num, evenMin);
            } else {
                oddSum += num;
                oddMax = Math.max(num, oddMax);
                oddMin = Math.min(num, oddMin);
            }
        }
        System.out.printf("OddSum=%.2f,%n", oddSum);
        if (oddMin != 0 && oddMin != Double.MAX_VALUE) {
            System.out.printf("OddMin=%.2f,%n", oddMin);
        } else {
            System.out.println("OddMin=No,");
        }
        if (oddMax != 0 && oddMax != -Double.MAX_VALUE) {
            System.out.printf("OddMax=%.2f,%n", oddMax);
        } else {
            System.out.println("OddMax=No,");
        }

        System.out.printf("EvenSum=%.2f,%n", evenSum);
        if (evenMin != 0 && evenMin != Double.MAX_VALUE) {
            System.out.printf("EvenMin=%.2f,%n", evenMin);
        } else {
            System.out.println("EvenMin=No,");
        }
        if (evenMax != 0 && evenMax != -Double.MAX_VALUE) {
            System.out.printf("EvenMax=%.2f%n", evenMax);
        } else {
            System.out.println("EvenMax=No");
        }
    }
}

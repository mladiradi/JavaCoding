package JavaCoding;

import java.util.Scanner;

public class EqualPairsForeign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0, sumP = 0, dif = 0, difMax = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int a = Integer.parseInt(sc.nextLine());
            int b = Integer.parseInt(sc.nextLine());
            sum = a + b;
            if (i != 1) {
                dif = Math.abs(sum - sumP);
                if (dif > difMax) {
                    difMax = dif;
                }
            }
            sumP = sum;
        }
        if (dif == 0) {
            System.out.printf("Yes, value=%d", sum);
        } else {
            System.out.printf("No, maxdiff=%d", difMax);
        }
    }
}


package JavaCoding;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 1; i <= n; ++i) {
            int num = Integer.parseInt(scan.nextLine());
            sum += num;

            if (num > max) {
                max = num;
            }
        }
        sum -= max;
        if (sum == max) {
            System.out.printf("Yes%nSum = %d" , max);
        } else {
            System.out.printf("No%nDiff = %d" , Math.abs(max - sum));
        }
    }
}
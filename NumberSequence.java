package JavaCoding;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scan.nextLine());
            if (number > maxNum) {
                maxNum = number;
            }
            if (number < minNum) {
                minNum = number;
            }
        }
        System.out.printf("Max number: %d%n", maxNum);
        System.out.printf("Min number: %d%n", minNum);

      //  System.out.println("Max number:" + maxNum);
      //  System.out.println("Min number:" + minNum);
    }
}

package JavaCoding;

import java.util.Scanner;

public class NumbersDividedByThreeWithoutReminder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = 0;

        while (n <= 100) {
            n++;
            if (n % 3 == 0) {
                System.out.println(n);
            }
        }
    }
}
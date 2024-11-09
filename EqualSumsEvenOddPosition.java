package JavaCoding;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());

        for (int i = first; i <= second; i++) {
            int momentN = i;
            int oddSum = 0;
            int evenSum = 0;

            for (int j = 6; j > 0; j--) {
                int last = momentN % 10;
                momentN /= 10;

                if (j % 2 == 0) {
                    evenSum += last;
                } else {
                    oddSum += last;
                }
            }

            if (evenSum == oddSum) {
                System.out.print(i + " ");
            }
        }


    }
}

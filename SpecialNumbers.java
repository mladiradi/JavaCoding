package JavaCoding;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        for (int i = 1111; i <= 9999; i++) {
            int curr = i;
            int cunt = 0;

            for (int j = 0; j < 4; j++) {
                int lastDigit = curr % 10;
                curr /= 10;

                if (lastDigit == 0){
                    break;
                }

                if (num % lastDigit == 0) {
                    cunt++;

                }
            }

            if (cunt == 4) {
                System.out.print(i + " ");
            }
        }
    }
}

package JavaCoding;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int primeSum = 0;
        int nonPrimeSum = 0;


        String input = scan.nextLine();
        while (!"stop".equals(input)) {
            int num = Integer.parseInt(input);
            boolean isNonPrime = false;

            if (num < 0) {
                System.out.println("Number is negative.");
                input = scan.nextLine();
                continue;
            }

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isNonPrime = true;
                    break;
                } else {

                }
            }

            if (isNonPrime) {
                nonPrimeSum += num;
            } else {
                primeSum += num;
            }

            input = scan.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d%n", primeSum);
        System.out.printf("Sum of all non prime numbers is: %d", nonPrimeSum);

    }
}

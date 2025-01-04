package JavaCoding;

import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int target = Integer.parseInt(scan.nextLine());

        int cunt = 0;
        double cash = 0;
        double cred = 0;
        double sumi = 0;

        String input = scan.nextLine();
        while (true) {
            if ("End".equals(input)) {
                System.out.println("Failed to collect required money for charity.");
                break;
            }
            int prod = Integer.parseInt(input);

            if (cunt % 2 == 0) {
                if (prod > 100 || prod <= 0) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    cash += prod;
                    sumi += prod;
                }

            } else {
                if (prod <= 10 ) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    cred += prod;
                    sumi += prod;
                }
            }

            cunt++;

        if (sumi >= target) {
            break;}
            input = scan.nextLine();
        }

        if (sumi >= target && !"End".equals(input)) {
            System.out.printf("Average CS: %.2f%n", (cash / 2));
            System.out.printf("Average CC: %.2f%n", (cred / 2));
        }
    }
}


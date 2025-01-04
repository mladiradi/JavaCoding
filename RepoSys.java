package JavaCoding;

import java.util.Scanner;

public class RepoSys {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int target = Integer.parseInt(scan.nextLine());

        int cunt = 0;
        double cash = 0;
        double cred = 0;
        double sumi = 0;

        String input = scan.nextLine();
        while ((!"End".equals(input)) ) {

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
                if (prod < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    cred += prod;
                    sumi += prod;
                }
            }

            cunt++;
            if (sumi >= target){
                break;
            }

            input = scan.nextLine();
        }

        if (sumi >= target ) {
            System.out.printf("Average CS: %.2f%n", Math.abs(cash / 2));
            System.out.printf("Average CC: %.2f%n", Math.abs(cred / 2));
        }else{System.out.println("Failed to collect required money for charity.");

        }
    }
}
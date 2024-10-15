package JavaCoding;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        double sum = 0.0;

        while (!"NoMoreMoney".equals(input)) {
            double cash = Double.parseDouble(input);

            if (cash < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            sum += cash;
            System.out.printf("Increase: %.2f%n", cash);
            input = scan.nextLine();
        }
        System.out.printf("Total: %.2f%n", sum);
    }
}





package JavaCoding;

import java.util.Scanner;

public class Club {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double need = Double.parseDouble(scan.nextLine());

        double sum = 0.0;
        double total = 0;
        int price = 0;

        String input = scan.nextLine();
        while (!"Party!".equals(input)) {

            int n = Integer.parseInt(scan.nextLine());

            price = input.length();
            sum = price * n;

            if (!(sum % 2 == 0)) {
                sum *= 0.75;
            }

            total += sum;
            if (need <= total) {
                System.out.println("Target acquired.");
                break;
            }
            input = scan.nextLine();
        }
        if (need > total) {
            System.out.printf("We need %.2f leva more.%n", need - total);
        }


        System.out.printf("Club income - %.2f leva.", total);
    }
}

package JavaCoding;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        while (!"End".equals(input)) {
            String next = input;
            double money = Double.parseDouble(scan.nextLine());

            while (true){
                double profit = Double.parseDouble(scan.nextLine());
                money -= profit;
                if (money <= 0){
                    System.out.printf("Going to %s!%n",next);
                    break;
                }
            }
            input = scan.nextLine();
        }
    }
}

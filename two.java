package JavaCoding;

import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double partyPrice = Double.parseDouble(scan.nextLine());
        int loveL = Integer.parseInt(scan.nextLine());
        int roses = Integer.parseInt(scan.nextLine());
        int keys = Integer.parseInt(scan.nextLine());
        int paint = Integer.parseInt(scan.nextLine());
        int lucks = Integer.parseInt(scan.nextLine());

        double sum = loveL * 0.6 + roses * 7.2 + keys * 3.6 + paint * 18.2 + lucks * 22;
        int count = loveL + roses + keys + paint + lucks;

        if (count >= 25) {
            sum *= 0.65;
        }

        double host = sum * 0.1;
        double profit = sum - host;

        if (profit > partyPrice) {
            System.out.printf("Yes! %.2f lv left.", profit - partyPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", partyPrice - profit);
        }


    }
}

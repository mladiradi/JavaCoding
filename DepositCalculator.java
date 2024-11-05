package JavaCoding;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double deposit = Double.parseDouble(scan.nextLine());
        double months = Double.parseDouble(scan.nextLine());
        double interestRate = Double.parseDouble(scan.nextLine());
        double total = deposit + months * ((deposit * interestRate/100)/12);
        System.out.println(total);
    }
}

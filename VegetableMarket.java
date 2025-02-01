package JavaCoding;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double vpr = Double.parseDouble(scan.nextLine());
        double fpr = Double.parseDouble(scan.nextLine());
        int vkg  = Integer.parseInt(scan.nextLine());
        int fkg = Integer.parseInt(scan.nextLine());
        double vsum = vpr * vkg;
        double fsum = fpr * fkg;
        double total = (vsum + fsum) / 1.94 ;

        System.out.printf("%.2f",total);
    }
}

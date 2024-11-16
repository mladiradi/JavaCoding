package JavaCoding;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double macpr = Double.parseDouble(scan.nextLine());
        double sprpr = Double.parseDouble(scan.nextLine());
        double bonkg = Double.parseDouble(scan.nextLine());
        double saukg = Double.parseDouble(scan.nextLine());
        int muskg = Integer.parseInt(scan.nextLine());
        double bonpr = (macpr + (macpr * 0.6)) * bonkg;
        double saupr = (sprpr + (sprpr * 0.8)) * saukg;
        double muspr = muskg * 7.5;
        double total = bonpr + saupr + muspr;
        System.out.printf("%.2f",total);
    }
}

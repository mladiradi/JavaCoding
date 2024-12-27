package JavaCoding;

import java.util.Scanner;

public class Pool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int people = Integer.parseInt(scan.nextLine());
        double tax = Double.parseDouble(scan.nextLine());
        double bedP = Double.parseDouble(scan.nextLine());
        double umbrP =Double.parseDouble(scan.nextLine());

        double totalTax = people * tax;
        double totalbed = Math.ceil(0.75 * people ) * bedP;
        double totalumbr = Math.ceil(0.5 * people) * umbrP;
        double total = totalTax + totalbed + totalumbr;

        System.out.printf("%.2f lv.",total);
    }
}

package JavaCoding;

import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nCargo = Integer.parseInt(scan.nextLine());

        int c1 = 0;
        int c2 = 0;
        int c3 = 0;

        for (int i = 0; i < nCargo; i++) {
            int cargo = Integer.parseInt(scan.nextLine());

            if (cargo <= 3) {
                c1 += cargo;
            } else if (cargo <= 11) {
                c2 += cargo;
            } else {
                c3 += cargo;
            }
        }
        double sumCargoTones = c1 + c2 + c3;

        double sumCargoMid = (c1 * 200 + c2 * 175 + c3 * 120) / sumCargoTones;

        System.out.printf("%.2f%n", sumCargoMid);
        System.out.printf("%.2f%%%n", c1 / sumCargoTones * 100);
        System.out.printf("%.2f%%%n", c2 / sumCargoTones * 100);
        System.out.printf("%.2f%%%n", c3 / sumCargoTones * 100);
    }
}

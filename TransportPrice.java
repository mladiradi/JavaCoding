package JavaCoding;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nKm = Integer.parseInt(scan.nextLine());
        String day = scan.nextLine();

        double dTaxi = 0.70 + nKm * 0.79;
        double nTaxi = 0.70 + nKm * 0.90;
        double bus = nKm * 0.09;
        double train = nKm * 0.06;

        if (nKm >= 100) {
            System.out.printf("%.2f",train);

        } else if (nKm >= 20) {
            System.out.printf("%.2f",bus);

        } else if (day.equals("day")) {
            System.out.printf("%.2f", dTaxi);

        } else {
            System.out.printf("%.2f", nTaxi);

        }
    }
}

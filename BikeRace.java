package JavaCoding;

import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nJ =Integer.parseInt(scan.nextLine());
        int nS = Integer.parseInt(scan.nextLine());
        String road = scan.nextLine();

        double tax = 0.0;

        switch (road){
            case "trail":
                tax = (5.50 * nJ) + (7 * nS); break;
            case "cross-country":
                if ((nJ + nS) >= 50) {
                    tax = ((8 * nJ) + (9.50 * nS)) * 0.75;
                }else{tax = (8 * nJ) + (9.50 * nS);} break;
            case "downhill":
                tax = (12.25 * nJ) + (13.75 * nS); break;
            case "road":
                tax = (20 * nJ) + (21.50 * nS); break;
        }

        System.out.printf("%.2f",tax * 0.95);
    }
}

package JavaCoding;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int numstat = Integer.parseInt(scan.nextLine());
        double clotespr = Double.parseDouble(scan.nextLine()) * numstat;

        double decor = budget * 0.1;
        if (numstat > 150) {
            clotespr = clotespr - (clotespr * 0.1);
        }
        double sumovie = clotespr + decor;
            if (sumovie > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", sumovie - budget);
        } else {
                System.out.println("Action!");
                System.out.printf("Wingard starts filming with %.2f leva left.", budget - sumovie );
            }
        }
    }

package JavaCoding;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int budget = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        int num = Integer.parseInt(scan.nextLine());

        double price = 0.0;
        boolean even = num % 2 == 0;

        if (num <= 6) {
            switch (season) {
                case "Summer":
                    price = even ? (4200 * 0.9)*0.95 : 4200 * 0.9;
                    break;
                case "Spring":
                    price = even ? (3000 * 0.9)*0.95 : 3000 * 0.9;
                    break;
                case "Winter":
                    price = even ? (2600 * 0.9)*0.95 : 2600 * 0.9;
                    break;
                case "Autumn":
                    price = 4200 * 0.9;
                    break; }
        } else if (num<=11){
            switch (season) {
                case "Summer":
                    price = even ? (4200 * 0.85)*0.95 : 4200 * 0.85;
                    break;
                case "Spring":
                    price = even ? (3000 * 0.85)*0.95 : 3000 * 0.85;
                    break;
                case "Winter":
                    price = even ? (2600 * 0.85)*0.95 : 2600 * 0.85;
                    break;
                case "Autumn":
                    price = 4200 * 0.85;
                    break;}
        }else if (num >=12){
            switch (season) {
                case "Summer":
                    price = even ? (4200 * 0.75)*0.95 : 4200 * 0.75;
                    break;
                case "Spring":
                    price = even ? (3000 * 0.75)*0.95 : 3000 * 0.75;
                    break;
                case "Winter":
                    price = even ? (2600 * 0.75)*0.95 : 2600 * 0.75;
                    break;
                case "Autumn":
                    price = 4200 * 0.75;
                    break;
            }
        }

        double diff = Math.abs(price - budget);
        if (price <= budget) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }}}
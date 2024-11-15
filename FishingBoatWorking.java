package JavaCoding;

import java.util.Scanner;

    public class FishingBoatWorking {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            double budget = Double.parseDouble(scanner.nextLine());
            String season = scanner.nextLine();
            int fishermen = Integer.parseInt(scanner.nextLine());

            double rentPrice = 0.0;

            switch (season) {
                case "Winter":
                    rentPrice = 2600.0;
                    break;
                case "Summer":
                case "Autumn":
                    rentPrice = 4200.0;
                    break;
                case "Spring":
                    rentPrice = 3000.0;
                    break;
            }

            if (fishermen <= 6) {
                rentPrice *= 0.90;
            } else if (fishermen <= 11) {
                rentPrice *= 0.85;
            } else {
                rentPrice *= 0.75;
            }

            if (fishermen % 2 == 0 && !season.equals("Autumn")) {
                rentPrice *= 0.95;
            }

            double diff = Math.abs(rentPrice - budget);

            if (rentPrice <= budget) {
                System.out.printf("Yes! You have %.2f leva left.", diff);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", diff);
            }
        }

}

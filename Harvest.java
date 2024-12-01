package JavaCoding;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sqMeters = Integer.parseInt(scan.nextLine());
        double kgGrapeSqM = Double.parseDouble(scan.nextLine());
        int ltWine = Integer.parseInt(scan.nextLine());
        int nWorkers = Integer.parseInt(scan.nextLine());

        double grapeKg = sqMeters * kgGrapeSqM;
        double wine = 0.4 * grapeKg / 2.5;

        if (wine >= ltWine){
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n" +
                    "%.0f liters left -> %.0f liters per person.%n",
                    Math.floor(wine),Math.ceil(wine - ltWine),Math.ceil((wine - ltWine) / nWorkers));
        } else {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.",
                    Math.floor(ltWine - wine));
        }

    }
}

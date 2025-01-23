package JavaCoding;

import java.util.Scanner;

public class Vacation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double price = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();

        String type = "Summer".equals(season) ? "Alaska" : "Morocco" ;
        String classy = "";

        if (price <= 1000){
            switch (season) {
                case "Summer":
                    price *= 0.65;
                    classy = "Camp";
                    break;
                case "Winter":
                    price *= 0.45;
                    classy = "Camp";
                    break;
            }
        }else if (price > 1000 && price <= 3000) {
            switch (season) {
                case "Summer":
                    price *= 0.80;
                    classy = "Hut";
                    break;
                case "Winter":
                    price *= 0.60;
                    classy = "Hut";
                    break;
            }
        }else {
            switch (season) {
                case "Summer":
                case "Winter":
                    price *= 0.90;
                    classy = "Hotel";
                    break;
            }
        }
                System.out.printf("%s - %s - %.2f",type,classy,price);
    }
}
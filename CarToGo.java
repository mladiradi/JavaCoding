package JavaCoding;

import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double price = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();

        String type = "Summer".equals(season) ? "Cabrio" : "Jeep" ;
        String classy = "";

        if (price <= 100){
            switch (season) {
                case "Summer":
                    price *= 0.35;
                    classy = "Economy class";
                    break;
                case "Winter":
                    price *= 0.65;
                    classy = "Economy class";
                    break;
            }
            }else if (price > 100 && price <= 500) {
            switch (season) {
                case "Summer":
                    price *= 0.45;
                    classy = "Compact class";
                    break;
                case "Winter":
                    price *= 0.80;
                    classy = "Compact class";
                    break;
            }
            }else {
                price *= 0.90;
                classy = "Luxury class";
                type = "Jeep";
                }
        System.out.printf("%s%n",classy);
        System.out.printf("%s - %.2f",type,price);
    }
}
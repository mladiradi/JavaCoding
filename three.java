package JavaCoding;

import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nights = Integer.parseInt(scan.nextLine()) - 1;
        String type = scan.nextLine();
        String rating = scan.nextLine();

        double price = 0;

        if (nights < 10) {
            switch (type) {
                case "room for one person":
                    price = nights * 18.00;
                    break;
                case "apartment":
                    price = (nights * 25.00) * 0.7;
                    break;
                case "president apartment":
                    price = (nights * 35.00) * 0.9;
                    break;
            }
        } else if (nights > 15) {
            switch (type) {
                case "room for one person":
                    price = nights * 18.00;
                    break;
                case "apartment":
                    price = (nights * 25.00) * 0.5;
                    break;
                case "president apartment":
                    price = (nights * 35.00) * 0.8;
                    break;
            }
        } else {
            switch (type) {
                case "room for one person":
                    price = nights * 18.00;
                    break;
                case "apartment":
                    price = (nights * 25.00) * 0.65;
                    break;
                case "president apartment":
                    price = (nights * 35.00) * 0.85;
                    break;
            }
        }

        if ("positive".equals(rating)){
            price *= 1.25;
        }else{
            price *= 0.9;
        }

        System.out.printf("%.2f",price );
    }
}

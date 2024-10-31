package JavaCoding;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String drink = scan.nextLine();
        String sugar = scan.nextLine();
        int n = Integer.parseInt(scan.nextLine());

        double price = 0.0;

        if ("Espresso".equals(drink)) {
            switch (sugar) {
                case "Without":
                    price = (0.9 * n) * 0.65;
                    break;
                case "Normal":
                    price = 1.0 * n;
                    break;
                case "Extra":
                    price = 1.2 * n;
                    break;
            }
        } else if ("Cappuccino".equals(drink)) {
            switch (sugar) {
                case "Without":
                    price = (1.0 * n) * 0.65;
                    break;
                case "Normal":
                    price = 1.2 * n;
                    break;
                case "Extra":
                    price = 1.6 * n;
                    break;
            }
        } else if ("Tea".equals(drink)) {
            switch (sugar) {
                case "Without":
                    price = (0.5 * n) * 0.65;
                    break;
                case "Normal":
                    price = 0.6 * n;
                    break;
                case "Extra":
                    price = 0.7 * n;
                    break;
            }
        }

        if ("Espresso".equals(drink) && n >= 5){
            price *= 0.75;
        }
        if (price > 15){
            price *= 0.80;
        }
        System.out.printf("You bought %d cups of %s for %.2f lv.",n,drink,price);
}
}

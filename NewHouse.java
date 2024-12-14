package JavaCoding;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String typeF = scan.nextLine();
        int numF = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());
        double price = 0.0;

        switch (typeF) {
            case "Roses":
                price = numF * 5;
                if (numF > 80) {price = numF * 5 * 0.9;}
                break;
            case "Dahlias":
                price = numF * 3.8;
                if (numF > 90) {price = numF * 3.8 * 0.85;}
                break;

            case "Tulips":
                price = numF * 2.8;
                if (numF > 80) {price = numF * 2.8 * 0.85;}
                break;
            case "Narcissus":
                price = numF * 3;
                if (numF < 120) {price *= 1.15;}
                break;

            case "Gladiolus":
                price = numF * 2.5;
                if (numF < 80) {price = numF * 2.5 * 1.2;}
                break;
                }
            double diff = Math.abs(price - budget);
        if ( price <= budget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numF, typeF, diff);
            } else {
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
                 }
    }
}


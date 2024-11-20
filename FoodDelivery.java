package JavaCoding;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int chickMenu = Integer.parseInt(scan.nextLine());
        int fishMenu = Integer.parseInt(scan.nextLine());
        int veggieMenu = Integer.parseInt(scan.nextLine());
        double chickPrice = chickMenu * 10.35;
        double fishPrice = fishMenu * 12.40;
        double veggiePrice = veggieMenu * 8.15;
        double sumMenu = (chickPrice + fishPrice + veggiePrice);
        double dessertPrice = sumMenu * 0.20;
        double supply = 2.50;
        double total = sumMenu + dessertPrice + supply;
        System.out.println(total);
    }
}

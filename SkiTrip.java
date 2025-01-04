package JavaCoding;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine())-1;
        String room = scan.nextLine();
        String rating = scan.nextLine();

        double price = 0.0;

        switch (room){
            case "room for one person":
                price = 18.00 * n; break;
            case "apartment":
                price = 25.00 * n; break;
            case  "president apartment":
                price = 35.00 * n; break;
        }

        if ("apartment".equals(room)){
            if (n<10){
                price *= 0.70;
            } else if (n > 15) {
                price *= 0.50;
            } else { price *= 0.65;}
        }
        if ("president apartment".equals(room)){
            if (n<10){
                price *= 0.90;
            } else if (n > 15) {
                price *= 0.80;
            } else { price *= 0.85;}
        }

        if ("positive".equals(rating)){
            price *= 1.25;
        } else if ("negative".equals(rating)) {
            price *= 0.9;
        }

        System.out.printf("%.2f",price);
    }
}

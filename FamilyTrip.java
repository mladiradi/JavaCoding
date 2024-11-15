package JavaCoding;

import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int nights = Integer.parseInt(scan.nextLine());
        double price = Double.parseDouble(scan.nextLine());
        int percent = Integer.parseInt(scan.nextLine());

        if (nights > 7){
            price = price * 0.95;
        }
        double sumNigts = nights * price;
        double extra = (budget * percent) /100;

        double total = sumNigts + extra;

        if (budget >= total){
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.",budget - total);
        }else{
            System.out.printf("%.2f leva needed.",total - budget);
        }
    }
}

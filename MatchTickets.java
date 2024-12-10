package JavaCoding;

import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String category = scan.nextLine();
        int n = Integer.parseInt(scan.nextLine());


       // double price = 0.0;
        double price = "VIP".equals(category)  ? 499.99*n : 249.99*n;

       // switch (category){
        //    case "VIP": price = 499.99 * n; break;
        //    case "Normal": price = 249.99 * n ; break;}

        if (n <=4 ){
            budget *= 0.25 ;
        } else if (n <= 9 ) {
            budget *= 0.40 ;
        } else if (n <= 24) {
            budget *= 0.50 ;
        } else if (n <= 49) {
            budget *= 0.60 ;
        } else if (n > 50) {
            budget *= 0.75 ;
        }

        double diff = Math.abs(budget - price);

        if (price < budget){
            System.out.printf("Yes! You have %.2f leva left.",diff);
        }else{
            System.out.printf("Not enough money! You need %.2f leva.",diff);
        }
    }
}

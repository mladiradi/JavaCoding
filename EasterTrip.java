package JavaCoding;

import java.util.Scanner;

public class EasterTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String destination = scan.nextLine();
        String dates = scan.nextLine();
        int n = Integer.parseInt(scan.nextLine());

        int price = 0;

        if ("21-23".equals(dates)) {
            switch (destination) {
                case "France":
                    price = 30;
                    break;
                case "Italy":
                    price = 28;
                    break;
                case "Germany":
                    price = 32;
                    break;
            }
        }
        if ("24-27".equals(dates)) {
            switch (destination) {
                case "France":
                    price = 35;
                    break;
                case "Italy":
                    price = 32;
                    break;
                case "Germany":
                    price = 37;
                    break;
            }
        }
        if ("28-31".equals(dates)) {
            switch (destination) {
                case "France":
                    price = 40;
                    break;
                case "Italy":
                    price = 39;
                    break;
                case "Germany":
                    price = 43;
                    break;
            }
        }
 double sum = n * price;

        System.out.printf("Easter trip to %s : %.2f leva.",destination,sum);
    }
}


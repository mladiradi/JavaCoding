package JavaCoding;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String month = scan.nextLine();
        int n = Integer.parseInt(scan.nextLine());

        double studio = 0.0;
        double apart = 0.0;

        boolean first = "May".equals(month) || "October".equals(month);
        boolean second = "June".equals(month) || "September".equals(month);

        switch (month) {
            case "May":
            case "October":
                studio = 50 * n;
                apart = 65 * n;
                break;
            case "June":
            case "September":
                studio = 75.20 * n;
                apart = 68.70 * n;
                break;
            case "July":
            case "August":
                studio = 76 * n;
                apart = 77 * n;
                break;
        }
        if (n > 14 && first) {
            studio *= 0.70;
        } else if (n > 14 && second) {
            studio *= 0.80;
        }else if ((n > 7 && n <= 14) && first) {
            studio *= 0.95;
        }
        if (n > 14) {
            apart *= 0.90;
        }
        System.out.printf("Apartment: %.2f lv.%n", apart);
        System.out.printf("Studio: %.2f lv.",studio);
    }
}

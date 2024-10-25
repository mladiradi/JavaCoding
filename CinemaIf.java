package JavaCoding;

import java.util.Scanner;

public class CinemaIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String ticket = scan.nextLine();
        int row = Integer.parseInt(scan.nextLine());
        int col = Integer.parseInt(scan.nextLine());

        double profit = 0;
        int seat = row * col;

        if ("Premiere".equals(ticket)){
            profit = seat * 12.00;
        } else if ("Normal".equals(ticket)){
            profit = row * col * 7.5;
        } else if ("Discount".equals(ticket)){
            profit = row* col * 5.0;
            }
        System.out.printf("%.2f leva", profit);
    }
}

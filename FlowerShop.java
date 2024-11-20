package JavaCoding;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    int magn = Integer.parseInt(scan.nextLine());
    int hyac = Integer.parseInt(scan.nextLine());
    int rose = Integer.parseInt(scan.nextLine());
    int cact = Integer.parseInt(scan.nextLine());
    double gift = Double.parseDouble(scan.nextLine());

    double order = magn * 3.25 + hyac * 4 + rose * 3.5 + cact * 8;
    double profit = order - (order * 0.05 );

    if (profit >= gift){
        System.out.printf("She is left with %.0f leva.",Math.floor( profit - gift ));
    } else {
        System.out.printf("She will have to borrow %.0f leva. ", Math.ceil(gift - profit));
    }

    }
}

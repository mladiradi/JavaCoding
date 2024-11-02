package JavaCoding;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double change = Double.parseDouble(scan.nextLine());
        int cents = (int) (change * 100);
        int cunt = 0;

        while (cents > 0) {
            cunt++;
            if (cents >= 200) {
                cents -= 200;
            } else if (cents >= 100) {
                cents -= 100;
            } else if (cents >= 50) {
                cents -= 50;
            } else if (cents >= 20) {
                cents -= 20;
            } else if (cents >= 10) {
                cents -= 10;
            } else if (cents >= 5) {
                cents -= 5;
            } else if (cents >= 2) {
                cents -= 2;
            } else {
                cents -= 1;
            }
        }
        System.out.println(cunt);
    }
}

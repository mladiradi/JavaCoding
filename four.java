package JavaCoding;

import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        double sumRate = 0.0;
        double sumOfsales = 0.0;
        double countOfsales = 0.0;

        for (int i = 0 ; i < n ; i++) {
            int num = Integer.parseInt(scan.nextLine());

            int lastdigit = num % 10;
            double sales = (num /= 10);

            switch (lastdigit) {
                case 2:
                    sales *= 0;
                    break;
                case 3:
                    sales *= 0.5;
                    break;
                case 4:
                    sales *= 0.7;
                    break;
                case 5:
                    sales *= 0.85;
                    break;
                case 6:
                    sales *= 1;
                    break;
            }
            sumRate += lastdigit;
            sumOfsales += sales;
            countOfsales++;

        }
        System.out.printf("%.2f%n",sumOfsales);
        System.out.printf("%.2f",sumRate / countOfsales);

    }
}

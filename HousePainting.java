package JavaCoding;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = Double.parseDouble(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());
        double greenp = ((((x * y)*2) -((1.5*1.5)*2)) + (((x * x)*2) - (1.2 *2))) / 3.4;
        double redp = (((x * y)*2) + (((x * h) / 2)*2)) / 4.3;
        System.out.printf("%.2f %n", greenp);
        System.out.printf("%.2f", redp);
    }
}

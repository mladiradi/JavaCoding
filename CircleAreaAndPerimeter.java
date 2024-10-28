package JavaCoding;

import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r = Double.parseDouble(scan.nextLine());
        double area = Math.PI * r * r;
        double param = 2 * Math.PI * r;
        System.out.printf("%.2f %n",area);
        System.out.printf("%.2f",param);
    }
}

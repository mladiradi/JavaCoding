package JavaCoding;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String figure = scan.nextLine();
        if (figure.equals("square")) {
            double a = Double.parseDouble(scan.nextLine());
            double front = a * a;
            System.out.printf("%.3f", front);
        } else if (figure.equals("rectangle")) {
            double a = Double.parseDouble(scan.nextLine());
            double b = Double.parseDouble(scan.nextLine());
            double front = a * b;
            System.out.printf("%.3f", front);
        } else if (figure.equals("circle")) {
            double r = Double.parseDouble(scan.nextLine());
            double front = Math.pow(r,2) * Math.PI ;
            System.out.printf("%.3f", front);
        } else if (figure.equals("triangle")) {
            double a = Double.parseDouble(scan.nextLine());
            double h = Double.parseDouble(scan.nextLine());
            double front = (a * h) / 2 ;
            System.out.printf("%.3f",front);
        }
    }
}

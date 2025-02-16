package JavaCoding;

import java.util.Scanner;

public class WeatherForecastPart2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double degree = Double.parseDouble(scan.nextLine());
        if (degree < 5) {
            System.out.println("unknown");
        } else if (degree < 12) {
            System.out.println("Cold");
        } else if (degree < 15.00) {
            System.out.println("Cool");
        } else if (degree <= 20.00) {
            System.out.println("Mild");
        } else if (degree <= 25.9) {
            System.out.println("Warm");
        } else if (degree <=35.00){
            System.out.println("Hot");
        } else if (degree > 35.00){
        System.out.println("unknown");}
    }
}


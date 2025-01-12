package JavaCoding;

import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int hour = Integer.parseInt(scan.nextLine());
        int min = Integer.parseInt(scan.nextLine()) + 15;
        hour = hour + min /60;
        min = min % 60;
        if (hour >= 24){
            hour = hour - 24;
        }
        if (min < 10){
            System.out.printf("%d:0%d", hour, min);
        } else {
            System.out.printf("%d:%d", hour, min);}
        }
    }


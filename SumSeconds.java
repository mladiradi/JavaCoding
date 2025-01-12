package JavaCoding;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());
        int total = a + b + c;
        int min = total / 60;
        int sec = total % 60;
        if (sec < 10) {
            System.out.printf("%d:0%d", min,sec);
        } else {
            System.out.printf("%d:%d", min, sec);
        }
    }
}
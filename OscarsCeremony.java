package JavaCoding;

import java.util.Scanner;

public class OscarsCeremony {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rent =Integer.parseInt(scan.nextLine());

        double statue = rent * 0.70;
        double gatering = statue * 0.85;
        double sound = gatering / 2;
        double sum  =rent + statue + gatering + sound;

        System.out.printf("%.2f",sum);
    }
}

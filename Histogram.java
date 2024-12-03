package JavaCoding;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scan.nextLine());

            if (num < 200) {
                p1++;
            } else if (num < 400) {
                p2++;
            } else if (num < 600) {
                p3++;
            } else if (num < 800) {
                p4++;
            } else {
                p5++;
            }
        }

        System.out.printf("%.2f%%%n", 100.0 * p1/ n);
        System.out.printf("%.2f%%%n", 100.0 * p2/ n);
        System.out.printf("%.2f%%%n", 100.0 * p3/ n);
        System.out.printf("%.2f%%%n", 100.0 * p4/ n);
        System.out.printf("%.2f%%%n", 100.0 * p5/ n);

    }
}
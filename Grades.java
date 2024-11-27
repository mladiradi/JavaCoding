package JavaCoding;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nStudent = Integer.parseInt(scan.nextLine());

        double sc5 = 0;
        double sc4 = 0;
        double sc3 = 0;
        double sc2 = 0;
        double total = 0;

        for (int i = 0; i < nStudent; i++) {
            double score = Double.parseDouble(scan.nextLine());
            total += score;
            if (score >= 5.00) {
                sc5++;
            } else if (score >= 4.00 && score <= 4.99) {
                sc4++;
            } else if (score >= 3.00 && score <= 3.99) {
                sc3++;
            } else {
                sc2++;
            }
        }
            System.out.printf("Top students: %.2f%%%n",(sc5 * 100) / nStudent);
            System.out.printf("Between 4.00 and 4.99: %.2f%%%n",(sc4* 100) / nStudent);
            System.out.printf("Between 3.00 and 3.99: %.2f%%%n",(sc3 * 100) / nStudent);
            System.out.printf("Fail: %.2f%%%n",(sc2 * 100) / nStudent);
            System.out.printf("Average: %.2f",total / nStudent);
    }
}
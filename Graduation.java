package JavaCoding;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();

        int grade = 0;
        double sum = 0.0;

        while (true) {
            double score = Double.parseDouble(scan.nextLine());
            grade++;
            sum += score;
            if (score < 4.00) {
                System.out.printf("%s has been excluded at %d grade", name, grade);
                break;
            }
            if (grade == 12) {
                System.out.printf("%s graduated. Average grade: %.2f", name, sum / grade);
                break;
            }
        }
    }
}
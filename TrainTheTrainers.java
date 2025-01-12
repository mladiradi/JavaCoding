package JavaCoding;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double total = 0;
        int cunt = 0;

        String input = scan.nextLine();
        while (!"Finish".equals(input)) {
            String name = input;

            double sumGrades = 0.0;
            for (int i = 0; i < n; i++) {
                double grade = Double.parseDouble(scan.nextLine());
                sumGrades += grade;
                cunt++;
            }

            total += sumGrades;
            double aveGrade = sumGrades / n;
            System.out.printf("%s - %.2f.%n", name, aveGrade);


            input = scan.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", total / cunt);
    }
}

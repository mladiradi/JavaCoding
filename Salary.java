package JavaCoding;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int salary = Integer.parseInt(scan.nextLine());
        boolean lost = false;

        for (int i = 0; i < n; i++) {
            String site = scan.nextLine();

            switch (site) {
                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
                    break;
            }

            if (salary <= 0) {
                lost = true;
                break;
            }
        }
        if (lost) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.println(salary);
        }

    }
}

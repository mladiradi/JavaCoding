package JavaCoding;

import java.util.Scanner;

public class VacationWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double targetM = Double.parseDouble(scan.nextLine());
        double savedM = Double.parseDouble(scan.nextLine());
        int daysSave = 0;
        int daysSpend = 0;
        boolean dS = false;

        while (savedM < targetM) {
            ++daysSave;
            String textM = scan.nextLine();
            double dailyM = Double.parseDouble(scan.nextLine());

            switch (textM) {
                case "spend":
                    savedM -= dailyM;
                    savedM = Math.max(0,savedM);
//                    if (savedM < 0) {
//                        savedM = 0;
//                    }
                    daysSpend++;
                    if (daysSpend == 5) {
                        dS = true;
                    }
                    break;
                case "save":
                    savedM += dailyM;
                    daysSpend = 0;
                    break;
            }
            if (dS) {
                break;
            }
        }
        if (dS) {
            System.out.printf("You can't save the money.%n%d", daysSave);
        } else {
            System.out.printf("You saved the money for %d days.", daysSave);
        }
    }
}



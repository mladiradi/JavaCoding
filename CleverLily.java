package JavaCoding;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nYears = Integer.parseInt(scan.nextLine());
        double washP = Double.parseDouble(scan.nextLine());
        int toyP = Integer.parseInt(scan.nextLine());

        double moneyS = 0.0;
        //1 double mon = 0;


        for (int i = 1; i <= nYears; i++) {
            if (i % 2 == 0) {
                moneyS += 10.0 * (i * 0.5) - 1;// за да сумира натрупаните суми през 1 четна година или (i / 2.0)

                //2 moneyS = moneyS + (i * 5)-1;

                //1 mon += 10.0;
                //1 moneyS += mon - 1;
            } else {
                moneyS += toyP;
            }
        }
        if (moneyS >= washP) {
            System.out.printf("Yes! %.2f", Math.abs(moneyS - washP));
        } else {
            System.out.printf("No! %.2f", Math.abs(washP - moneyS));
        }

    }
}

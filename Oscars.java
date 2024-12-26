package JavaCoding;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String actName = scan.nextLine();
        double startP = Double.parseDouble(scan.nextLine());
        int judgeNum = Integer.parseInt(scan.nextLine());

        double points = 0.0;
        boolean nomination = false;

        for (int i = 0; i < judgeNum; i++) {
            String judgeName = scan.nextLine();
            double judgePoints = Double.parseDouble(scan.nextLine());
            points += judgeName.length() * judgePoints / 2;

            if (points + startP > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actName, points + startP);
                nomination = true;
                break;
            }
        }

        if (!nomination) {
            System.out.printf("Sorry, %s you need %.1f more!", actName, 1250.5 - (points + startP));
        }


    }
}

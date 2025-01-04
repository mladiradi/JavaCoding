package JavaCoding;

import java.util.Scanner;

public class Renovation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int h = Integer.parseInt(scan.nextLine());
        int w = Integer.parseInt(scan.nextLine());
        int perc = Integer.parseInt(scan.nextLine());


        double scm = h * w * 4;
        double scmW = scm - ((scm * perc) / 100);
        double paint = scm - ((scm * perc) / 100);
        int sumL = 0;


        while (true) {
            String input = scan.nextLine();
            if ("Tired!".equals(input)){
                System.out.printf("%.0f quadratic m left.", Math.ceil(paint - sumL));
                break;
            }
            int litr = Integer.parseInt(input);

            scmW -= litr;
            sumL += litr;

            if (scmW == 0) {
                System.out.println("All walls are painted! Great job, Pesho!");
                break;

            } else if (sumL >= paint) {
                System.out.printf("All walls are painted and you have %.0f l paint left!",sumL - paint);
                break;
            }
        }
    }
}



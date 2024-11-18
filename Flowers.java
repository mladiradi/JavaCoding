package JavaCoding;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nC = Integer.parseInt(scan.nextLine());
        int nR = Integer.parseInt(scan.nextLine());
        int nT = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        String holyday = scan.nextLine();

        double pC = 0.0;
        double pR = 0.0;
        double pT = 0.0;

        switch (season){
            case "Spring":
            case "Summer":
                pC = 2.00; pR = 4.10; pT = 2.50;
                break;
            case "Autumn":
            case "Winter":
                pC = 3.75; pR = 4.50; pT = 4.15;
                break;
        }
        double sum = (pR * nR) + (pT * nT) + (pC * nC);
        if ("Y".equals(holyday)){
            sum *= 1.15;
        }
        if ((nT > 7) && "Spring".equals(season)){
            sum *= 0.95;
        } else if ((nR >= 10) && "Winter".equals(season)) {
            sum *= 0.90;
        }
        if (nT+nC+nR > 20) {
            sum *= 0.80;
        }
        System.out.printf("%.2f",sum +2);

    }
}

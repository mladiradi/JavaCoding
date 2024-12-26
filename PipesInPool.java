package JavaCoding;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int V = Integer.parseInt(scan.nextLine());
        int P1 = Integer.parseInt(scan.nextLine());
        int P2 = Integer.parseInt(scan.nextLine());
        double H = Double.parseDouble(scan.nextLine());

        double DP1 = P1 * H;
        double DP2 = P2 * H;
        double DSum = DP1 + DP2;
        double DebitPer = DSum / V * 100;
        double P1DPer = DP1 / DSum * 100;
        double P2DPer = DP2 / DSum * 100;

        if (DSum <= V){
            System.out.printf("The pool is %.2f%c full. Pipe 1: %.2f%c. Pipe 2: %.2f%c. ",
                               DebitPer,'%',P1DPer,'%',P2DPer,'%');
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.",
                               H,DSum - V);
        }

    }
}

package JavaCoding;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nTour = Integer.parseInt(scan.nextLine());
        int startPoint = Integer.parseInt(scan.nextLine());

        double score = 0;
        double scorew = 0;
        int w = 2000;
        int f = 1200;
        int sf = 720;

        for (int i = 0; i < nTour; i++) {
            String finalist = scan.nextLine();
            switch (finalist) {
                case "W":
                    score += w;
                    scorew++;
                    break;
                case "F":
                    score += f;
                    break;
                case "SF":
                    score += sf;
                    break;
            }
        }

        System.out.printf("Final points: %.0f%n", score + startPoint);
        System.out.printf("Average points: %.0f%n", Math.floor(score / nTour));
        System.out.printf("%.2f%%", scorew / nTour * 100);
    }

}
package JavaCoding;

        import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int allmoves = Integer.parseInt(scan.nextLine());

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;
        double p6 = 0;
        double sum = 0;

        for (int i = 0; i < allmoves; i++) {
            int move = Integer.parseInt(scan.nextLine());

            if (move >= 0 && move <= 9) {
                sum += move * 0.2;
                p1++;
            } else if (move >= 10 && move <= 19) {
                sum += move * 0.3;
                p2++;
            } else if (move >= 20 && move <= 29) {
                sum += move * 0.4;
                p3++;
            } else if (move >= 30 && move <= 39) {
                sum += 50;
                p4++;
            } else if (move >= 40 && move <= 50) {
                sum += 100;
                p5++;
            } else {
                sum = sum / 2;
                p6++;
            }
        }
        System.out.printf("%.2f%n",sum);
        System.out.printf("From 0 to 9: %.2f%%%n", (p1 * 100) / allmoves);
        System.out.printf("From 10 to 19: %.2f%%%n", (p2 * 100) / allmoves);
        System.out.printf("From 20 to 29: %.2f%%%n", (p3 * 100) / allmoves);
        System.out.printf("From 30 to 39: %.2f%%%n", (p4 * 100) /  allmoves);
        System.out.printf("From 40 to 50: %.2f%%%n", (p5 * 100) / allmoves);
        System.out.printf("Invalid numbers: %.2f%%%n", (p6 * 100) / allmoves);
    }
}


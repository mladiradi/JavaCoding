package JavaCoding;

import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int stad = Integer.parseInt(scan.nextLine());
        int fans = Integer.parseInt(scan.nextLine());
        double fansy = fans;
        double a = 0;
        double b = 0;
        double v = 0;
        double g = 0;

        for (int i = 0; i < fans; i++) {
            String sector = scan.nextLine();
            switch (sector) {
                case "A":
                    a++;
                    break;
                case "B":
                    b++;
                    break;
                case "V":
                    v++;
                    break;
                case "G":
                    g++;
                    break;
            }
        }
        double sum = (fansy * 100) / stad;
        System.out.printf("%.2f%%%n", (a * 100) / fans);
        System.out.printf("%.2f%%%n", (b * 100) / fans);
        System.out.printf("%.2f%%%n", (v * 100) / fans);
        System.out.printf("%.2f%%%n", (g * 100) / fans);
        System.out.printf("%.2f%%", sum);
    }
}

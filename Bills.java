package JavaCoding;

import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int month = Integer.parseInt(scan.nextLine());

        double othsum = 0;
        double watersum = 0.0;
        double netsum = 0.0;
        double elesum = 0;

        for (int i = 0; i < month; i++) {
            double ele = Double.parseDouble(scan.nextLine());
            double water = 20;
            double net = 15;

            elesum += ele;
            othsum += (ele + water + net) * 1.2;
            watersum += water;
            netsum += net;
        }
        double total = elesum + watersum + netsum + othsum;
        System.out.printf("Electricity: %.2f lv%n", elesum);
        System.out.printf("Water: %.2f lv%n", watersum);
        System.out.printf("Internet: %.2f lv%n", netsum);
        System.out.printf("Other: %.2f lv%n", othsum);
        System.out.printf("Average: %.2f lv%n", total / month);
    }
}


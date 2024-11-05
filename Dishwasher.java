package JavaCoding;

import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nBotlle = Integer.parseInt(scan.nextLine());
        int totalvero = nBotlle * 750;
        int cunt = 0;
        int used = 0;
        int ml = 0;
        int pots = 0;
        int dish = 0;

        String input = scan.nextLine();
        while (!"End".equals(input)) {
            int num = Integer.parseInt(input);
            cunt++;
            ml = 5;
            dish += num;
            if (cunt == 3) {
                ml = 15;
                pots += num;
                dish -= num;
                cunt = 0;
            }
            used = num * ml;
            if (totalvero < used) {
                break;
            }
            totalvero -= used;
            input = scan.nextLine();
        }
        if ("End".equals(input)) {
            System.out.printf("Detergent was enough!%n");
            System.out.printf("%d dishes and %d pots were washed.%n", dish, pots);
            System.out.printf("Leftover detergent %d ml.", totalvero);
        } else {
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(totalvero - used));
        }
    }
}


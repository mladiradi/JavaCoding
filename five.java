package JavaCoding;

import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int maxGoals = Integer.MIN_VALUE;
        String player = "";

        String input = scan.nextLine();

        while (!"END".equals(input)) {
            String name = input;
            int nGoals = Integer.parseInt(scan.nextLine());

            if (nGoals > maxGoals) {
                maxGoals = nGoals;
                player = name;
            }

            if (nGoals >= 10) {
                break;
            }

            input = scan.nextLine();
        }

        System.out.printf("%s is the best player!%n", player);
        if (maxGoals >= 3) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", maxGoals);
        } else {
            System.out.printf("He has scored %d goals.", maxGoals);
        }
    }
}
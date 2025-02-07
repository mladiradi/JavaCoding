package JavaCoding;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int goal = 10000;

        while (goal > 0) {
            String input = scan.nextLine();
            if ("Going home".equals(input)) {
                int lastSteps = Integer.parseInt(scan.nextLine());
                goal -= lastSteps;
                break;
            }

            int steps = Integer.parseInt(input);
            goal -= steps;
        }

        if (goal <= 0) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", Math.abs(goal));
        } else {
            System.out.printf("%d more steps to reach goal.", goal);
        }
    }
}

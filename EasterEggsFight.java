package JavaCoding;

import java.util.Scanner;

public class EasterEggsFight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int p1 = Integer.parseInt(scan.nextLine());
        int p2 = Integer.parseInt(scan.nextLine());

        while (true) {
            String name = scan.nextLine();
            if ("End".equals(name)) {
                System.out.printf("Playe one has %d eggs left%n", p1);
                System.out.printf("Playe two has %d eggs left", p2);
                break;
            }
            if ("one".equals(name)) {
                p2--;
            } else if ("two".equals(name)) {
                    p1--;
            }

            if (p1 == 0) {
                System.out.printf("Player one is out of eggs. Player two has %d eggs left.", p2);
                break;
            } else if (p2 == 0) {
                System.out.printf("Player two is out of eggs. Player one has %d eggs left.", p1);
                break;
            }

        }
    }
}



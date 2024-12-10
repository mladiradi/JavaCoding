package JavaCoding;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int chapT = Integer.parseInt(scan.nextLine());
        int breakT = Integer.parseInt(scan.nextLine());
        double free = breakT - (breakT / 8.0) - (breakT / 4.0);
        if (free >= chapT) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", name , Math.ceil(free - chapT));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", name , Math.ceil(chapT - free));
        }




    }
}

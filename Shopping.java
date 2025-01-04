package JavaCoding;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int vgaN = Integer.parseInt(scan.nextLine());
        int cpuN = Integer.parseInt(scan.nextLine());
        int ramN = Integer.parseInt(scan.nextLine());
        int vgaS = vgaN * 250;
        double sum = vgaS + vgaS * 0.35 * cpuN + vgaS * 0.1 * ramN;
        if (vgaN > cpuN){
            sum = sum - (sum * 0.15);
        }
        if (budget < sum){
            System.out.printf("Not enough money! You need %.2f leva more!", sum - budget);

        } else {
            System.out.printf("You have %.2f leva left!", budget - sum );
        }

    }
}

package JavaCoding;

import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        double litres = Double.parseDouble(scan.nextLine());

        String fname = name.toLowerCase();
        boolean oil = name.equals("Gas") || name.equals("Gasoline") || name.equals("Diesel");


        if (oil) {

            if (litres < 25) {
                System.out.printf("Fill your tank with %s!", fname);
            } else if (litres >= 25) {
                System.out.printf("You have enough %s.", fname);
            }
        }

        if (!oil) {
            System.out.println("Invalid fuel!");
        }
    }
}

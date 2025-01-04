package JavaCoding;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int nylon = Integer.parseInt(scan.nextLine());
        int paint = Integer.parseInt(scan.nextLine());
        int thinner = Integer.parseInt(scan.nextLine());
        int hours = Integer.parseInt(scan.nextLine());
        double nylonPrice = (nylon + 2) * 1.50;
        double paintPrice = (paint * 1.10) * 14.50;
        double thinnerPrice = thinner * 5.00;
        double sumOfMaterials = nylonPrice + paintPrice + thinnerPrice + 0.40;
        double amountForLabor = (sumOfMaterials * 0.30) * hours;
        double total = sumOfMaterials + amountForLabor;
        System.out.println(total);
    }
}

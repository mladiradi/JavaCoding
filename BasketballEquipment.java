package JavaCoding;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tax = Integer.parseInt(scan.nextLine());
        double sneakers = tax - (tax * 0.40);
        double outfits = sneakers - (sneakers * 0.20);
        double balls = outfits / 4;
        double accessories = balls / 5;
        double total = tax + sneakers + outfits + balls + accessories;
        System.out.println(total);

    }
}

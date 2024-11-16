package JavaCoding;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        double percent = Double.parseDouble(scan.nextLine());
        double bulkInLitres = (length * width * height) * 0.001;
        double occupiedSpace = percent / 100;
        double liters = bulkInLitres * (1-occupiedSpace);
        System.out.println(liters);
    }
}

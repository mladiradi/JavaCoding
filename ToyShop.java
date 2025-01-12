package JavaCoding;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tourPrice = Double.parseDouble(scan.nextLine());
        int puzzN = Integer.parseInt(scan.nextLine());
        int dollN = Integer.parseInt(scan.nextLine());
        int bearN = Integer.parseInt(scan.nextLine());
        int miniN = Integer.parseInt(scan.nextLine());
        int truckN = Integer.parseInt(scan.nextLine());
        int sumN = puzzN + dollN + bearN + miniN + truckN;
        double sumOrder = puzzN * 2.6 + dollN * 3 + bearN * 4.1 + miniN * 8.2 + truckN * 2;
        if (sumN >= 50){
            sumOrder = sumOrder - sumOrder * 0.25;
        }
        double profit = sumOrder - sumOrder * 0.1;
        if (profit < tourPrice){
            System.out.printf("Not enough money! %.2f lv needed.", tourPrice - profit);
        } else {
            System.out.printf("Yes! %.2f lv left.", profit - tourPrice);
        }
    }
}

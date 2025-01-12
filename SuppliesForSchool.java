package JavaCoding;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int penNum = Integer.parseInt(scan.nextLine());
        int markNum = Integer.parseInt(scan.nextLine());
        int chemNum = Integer.parseInt(scan.nextLine());
        int discount = Integer.parseInt(scan.nextLine());
        double penPrice = penNum * 5.80;
        double marPrice = markNum *7.20;
        double chemPrice = chemNum * 1.20;
        double totalPrice = penPrice + marPrice + chemPrice;
        double totalPriDis = totalPrice - (totalPrice * discount / 100);
        System.out.println(totalPriDis);
        }
    }


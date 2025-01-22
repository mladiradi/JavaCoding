package JavaCoding;

import java.util.Scanner;

public class UsdToBgn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double usd = Double.parseDouble(scan.nextLine());
        double bgn = usd * 1.79549;
        System.out.println(bgn);
    }
}

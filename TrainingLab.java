package JavaCoding;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double l = Double.parseDouble(scan.nextLine());
        double w = Double.parseDouble(scan.nextLine());
        double desкNum = Math.floor((w - 1) / 0.7);
        double rowNum = Math.floor(l / 1.2);
        double sitNum = desкNum * rowNum - 3;
        System.out.printf("%.0f",sitNum);
    }
}

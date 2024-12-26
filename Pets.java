package JavaCoding;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        int food = Integer.parseInt(scan.nextLine());
        double dog = Double.parseDouble(scan.nextLine());
        double cat = Double.parseDouble(scan.nextLine());
        double turtle = Double.parseDouble(scan.nextLine()) / 1000;

        double total = (dog + cat + turtle) * days;

        if (food >= total){
            System.out.printf("%.0f kilos of food left.",Math.floor(food - total ));
        } else {
            System.out.printf("%.0f more kilos of food are needed.",Math.ceil(total - food));
        }

    }
}

package JavaCoding;

import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int year = Integer.parseInt(scan.nextLine());
        double money = 0;
        int yold = 18;

        for (int i = 1800; i <= year; ++i ){
            if (i % 2 == 0){
                yold++;
                money += 12000;
            }else{
                money += 12000 + 50 * yold;
                yold++;
            }
        }

        double diff = Math.abs(budget - money);

        if (money <= budget){
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", diff );
        }else {
            System.out.printf("He will need %.2f dollars to survive.",diff);
        }

    }
}

package JavaCoding;

import java.util.Scanner;

public class EasterDecoration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int cunt = 0;
        double price = 0.0;
        double sum = 0.0;


        for (int i = 0; i < n; i++) {

            while (true) {
                String name = scan.nextLine();
                if ("Finish".equals(name)){

                    if (cunt % 2 == 0 ){
                        price *= 0.80;
                    }
                    sum +=price;
                    break;
                }

                switch (name){
                    case "basket":
                        cunt++;
                        price += 1.5;
                        break;

                    case "wreath":
                        cunt++;
                        price += 3.8;
                        break;

                    case "chocolate bunny":
                        cunt++;
                        price += 7;
                        break;
                }
            }
            System.out.printf("You purchased %d items for %.2f leva.%n",cunt,price);
            cunt = 0;
            price = 0;
        }

        System.out.printf("Average bill per client is: %.2f leva.",sum / n);
    }
}

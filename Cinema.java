package JavaCoding;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int capacity = Integer.parseInt(scan.nextLine());

        double profit = 0.0;

        String input = scan.nextLine();
        while (!"Movie time!".equals(input)){
            int visitors = Integer.parseInt(input);

            capacity -= visitors;
            if (capacity < 0){
                System.out.println("The cinema is full.");
                break;
            }

            double price = visitors * 5;
            if (visitors % 3 == 0){
                price -= 5;
            }
            profit += price;

            input = scan.nextLine();
            if ("Movie time!".equals(input)){
                System.out.printf("There are %d seats left in the cinema.%n",capacity);

            }
        }
        System.out.printf("Cinema income - %.0f lv.",profit);
    }
}

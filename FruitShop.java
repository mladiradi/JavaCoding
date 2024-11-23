package JavaCoding;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String fruit = scan.nextLine();
        String day = scan.nextLine();
        double qtity = Double.parseDouble(scan.nextLine());

        boolean validFruit = "banana".equals(fruit) || "apple".equals(fruit) || "orange".equals(fruit)
                || "grapefruit".equals(fruit) || "kiwi".equals(fruit) || "pineapple".equals(fruit)
                || "grapes".equals(fruit);
        boolean workingDay = "Monday".equals(day) || "Tuesday".equals(day) || "Wednesday".equals(day)
                || "Thursday".equals(day) || "Friday".equals(day);
        boolean weekendDay = "Saturday".equals(day) || "Sunday".equals(day);
        boolean validDay = workingDay || weekendDay;
        double price = 0;
        if (!validFruit || !validDay) {
            System.out.println("error");
        } else {

            switch (fruit) {
                case "banana":
                    price = workingDay ? 2.5 : 2.7;
                    break;
                case "apple":
                    price = workingDay ? 1.2 : 1.25;
                    break;
                case "orange":
                    price = workingDay ? 0.85 : 0.9;
                    break;
                case "grapefruit":
                    price = workingDay ? 1.45 : 1.6;
                    break;
                case "kiwi":
                    price = workingDay ? 2.7 : 3;
                    break;
                case "pineapple":
                    price = workingDay ? 5.5 : 5.6;
                    break;
                case "grapes":
                     price = workingDay ? 3.85 : 4.2;
                    break;

            }
            System.out.printf("%.2f", price * qtity);
        }
    }
}

    // case "grapes":
    //       if (isWeekendDay) {
    //     price = 3.85;
    //     } else {
    //     price = 4.2;
    //     }
    //     // price = isWorkingDay ? 3.85 : 4.2;
    //     break;
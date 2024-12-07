package JavaCoding;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();

        String dest = "";
        double price = 0.0;
        boolean summer = "summer".equals(season);
        boolean winter = "winter".equals(season);

        if (budget <= 100){
            dest = "Bulgaria";
            if (winter){
                price = budget * 0.70;
            } else if (summer) {
                price = budget * 0.30;
            }

        }else if (budget <= 1000){
            dest = "Balkans";
            if (winter){
                price = budget * 0.80;
            } else if (summer) {
                price = budget * 0.40;
            }
        }else{
            dest = "Europe";
            price = budget * 0.90;
        }
        // Tримерен оператор
        String type = winter || "Europe".equals(dest) ? "Hotel" : "Camp";

        // Тримерни замества последващия двумерен оператор
     //   String type = "";
     //   if (summer){
     //       type = "Camp";
     //   }else if (winter || "Europe".equals(dest)){
     //       type = "hotel";
        //  }

        System.out.printf("Somewhere in %s%n", dest);
        System.out.printf("%s - %.2f",type,price);

    }
}

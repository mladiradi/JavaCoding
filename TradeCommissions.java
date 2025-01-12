package JavaCoding;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String city = scan.nextLine();
        double sales = Double.parseDouble(scan.nextLine());

        boolean vCity = "Sofia".equals(city) || "Plovdiv".equals(city) || "Varna".equals(city);
        boolean vSales = sales >= 0;
        double commis = 0;
        if (!vCity || !vSales) {
            System.out.println("error");
        } else if (sales <= 500) {

            switch (city) {
                case "Sofia":
                    commis = 0.05;                    break;
                case "Varna":
                    commis =  0.045;                    break;
                case "Plovdiv":
                    commis = 0.055;                    break;}

                    System.out.printf("%.2f", sales * commis);

        } else if (sales <= 1000) {
            switch (city) {
                case "Sofia":
                    commis = 0.07;                    break;
                case "Varna":
                    commis =  0.075;                    break;
                case "Plovdiv":
                    commis = 0.08;                    break;}

            System.out.printf("%.2f", sales * commis);

        } else if (sales <= 10000){
            switch (city) {
                case "Sofia":
                    commis =  0.08;                    break;
                case "Varna":
                    commis = 0.1;                    break;
                case "Plovdiv":
                    commis = 0.12;                    break;}

            System.out.printf("%.2f", sales * commis);

        } else {
            switch (city) {
                case "Sofia":
                    commis =  0.12;                    break;
                case "Varna":
                    commis =  0.13;                    break;
                case "Plovdiv":
                    commis =  0.145;                    break;}

            System.out.printf("%.2f", sales * commis);

        }


    }


}



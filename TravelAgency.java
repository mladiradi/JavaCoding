package JavaCoding;

import java.util.Scanner;

public class TravelAgency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String city = scan.nextLine();
        String pack = scan.nextLine();
        String vip = scan.nextLine();
        int n = Integer.parseInt(scan.nextLine());

        boolean mount = "Bansko".equals(city) || "Borovets".equals(city);
        boolean sea = "Varna".equals(city) || "Burgas".equals(city);
        double price = 0.0;
        boolean typeM = "withEquipment".equals(pack) || "noEquipment".equals(pack);
        boolean typeS = "withBreakfast".equals(pack) || "noBreakfast".equals(pack);

        if (n > 7){
            n-= 1;
        }

        if (mount) {
            if (typeM) {
                switch (pack) {
                    case "withEquipment":
                        price = 100.00 * n;
                        if ("yes".equals(vip)) {
                            price *= 0.9;
                        }
                        break;
                    case "noEquipment":
                        price = 80.00 * n;
                        if ("yes".equals(vip)) {
                            price *= 0.95;
                        }
                        break;
                }
            }
        }

        if (sea) {
            if (typeS) {
                switch (pack) {
                    case "withBreakfast":
                        price = 130.00 * n;
                        if ("yes".equals(vip)) {
                            price *= 0.88;
                        }
                        break;
                    case "noBreakfast":
                        price = 100.00 * n;
                        if ("yes".equals(vip)) {
                            price *= 0.93;
                        }
                        break;
                }
            }
        }

        if (n <= 0) {
            System.out.print("Days must be positive number!");
        } else if ((mount && typeM) || (sea && typeS)) {
            System.out.printf("The price is %.2flv! Have a nice time!", price);
        } else {
            System.out.print("Invalid input!");
        }
    }
}
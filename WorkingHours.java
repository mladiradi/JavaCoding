package JavaCoding;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        String day = scan.nextLine();

        boolean hour = num >= 10;
        boolean hour1 = num<= 18;

        if(hour && hour1){
            switch (day){
                case "Sunday":
                    System.out.println("closed");
                    break;
                default:
                    System.out.println("open");
                    break;
            }
        } else {
           System.out.println("closed");
        }
    }
}


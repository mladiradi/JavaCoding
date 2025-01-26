package JavaCoding;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfPages = Integer.parseInt(scan.nextLine());
        int pages = Integer.parseInt(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());
        int hours = (countOfPages/pages)/days;
        System.out.println(hours);
    }
}

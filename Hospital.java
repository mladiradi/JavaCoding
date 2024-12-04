package JavaCoding;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        int doc = 7;
        int treat = 0;
        int untreat = 0;

        for (int i = 1; i <= days; i++) {
            int pac = Integer.parseInt(scan.nextLine());

                if (i % 3 == 0 && untreat > treat) {

                    doc++;

        }
        if (pac <= doc) {
            treat += pac;
        } else {
            untreat += pac - doc;
            treat += Math.abs(pac - (pac - doc));
        }
    }
        System.out.printf("Treated patients: %d.%n",treat);
        System.out.printf("Untreated patients: %d.",untreat);
}
}
package JavaCoding;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int w = Integer.parseInt(scan.nextLine());
        int l = Integer.parseInt(scan.nextLine());
        int pie = w * l;

        String input = scan.nextLine();
        while (!"STOP".equals(input)) {
            int num = Integer.parseInt(input);
            pie -= num;
            if (pie <= 0) {
                break;
            }
            input = scan.nextLine();
        }
        if (pie > 0) {
            System.out.printf("%d pieces are left.", pie);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(pie));
        }
    }
}

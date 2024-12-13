package JavaCoding;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int w = Integer.parseInt(scan.nextLine());
        int l = Integer.parseInt(scan.nextLine());
        int h = Integer.parseInt(scan.nextLine());

        int free = w * l * h;
        int need = 0;

        String input = scan.nextLine();
        while (!"Done".equals(input)) {
            int box = Integer.parseInt(input);
            need += box;
            if (need > free) {
                break;
            }
            input = scan.nextLine();
        }

//        String input = "" ;
//        while(!"Done".equals(input = scan.nextLine())) {
//            int box = Integer.parseInt(input);
//            need += box;
//            if (need > free) {
//                break;
//            }
//        }
        int left = free - need;
        if (left < 0) {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(left));
        } else {
            System.out.printf("%d Cubic meters left.", left);
        }
    }
}

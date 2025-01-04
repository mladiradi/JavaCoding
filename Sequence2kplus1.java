package JavaCoding;

import java.util.Scanner;

public class Sequence2kplus1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int num = 1;

//        while (num <= n) {
//            System.out.println(num);
//            num = num * 2 + 1;
//        }
//    }
//}

        while (true) {
            if (num > n) {
                break;
            }
            System.out.println(num);
            num = num * 2 + 1;
        }
    }
}
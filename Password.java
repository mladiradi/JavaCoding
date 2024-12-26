package JavaCoding;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        String name = scan.nextLine();
//        String pass = scan.nextLine();
//
//        String input = scan.nextLine();
//
//        while (!input.equals(pass)) {
//
//            input = scan.nextLine();
//        }
//        System.out.printf("Welcome %s!",name);
//    }
//}

        String name = scan.nextLine();
        String pass = scan.nextLine();

        while (true) {
            String input = scan.nextLine();
            if (input.equals(pass)) {
                System.out.printf("Welcome %s!", name);
                break;
            }
        }
    }
}
package JavaCoding;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int minNum = Integer.MAX_VALUE;

        while (true) {
            String input = scan.nextLine();
            if (input.equals("Stop")) {
                System.out.println(minNum);
                break;
            }
            int num = Integer.parseInt(input);
            if (num < minNum) {
                minNum = num;
            }
        }
    }
}

//    String input = scan.nextLine();
//
//    int minNum = Integer.MAX_VALUE;
//
//        while (!input.equals("Stop")) {
//                int num = Integer.parseInt(input);
//                if (num < minNum){
//        minNum = num;
//        }
//        input = scan.nextLine();
//        }
//        System.out.println(minNum);
//}
//        }
//



//    String input = scan.nextLine();
//    int minNum = Integer.MAX_VALUE;
//
//        while (true) {
//
//                if (input.equals("Stop")) {
//                System.out.println(minNum);
//                break;
//                }
//                int num = Integer.parseInt(input);
//                if (num < minNum) {
//        minNum = num;
//        }
//        input = scan.nextLine();
//        }
//
//        }
//        }

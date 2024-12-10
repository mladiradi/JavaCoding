package JavaCoding;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        int bigNum = Integer.MIN_VALUE;

        while (!input.equals("Stop")) {
            int num = Integer.parseInt(input);
            if (num > bigNum){
                bigNum = num;
            }
            input = scan.nextLine();
        }
        System.out.println(bigNum);
    }
}

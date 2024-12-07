package JavaCoding;

import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        boolean valid = num >=100 && num <=200 || num ==0;

     if (!valid){
         System.out.println("invalid");
     }
    }
}

package JavaCoding;

import java.util.Scanner;

public class SumNumbersWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int sum = 0;
        while (n > sum){
            int newnum = Integer.parseInt(scan.nextLine());
            sum += newnum;
        }
        System.out.println(sum);
    }
}

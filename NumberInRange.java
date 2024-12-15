package JavaCoding;

import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    int num = Integer.parseInt(scan.nextLine());

    boolean big = num <= 100;
    boolean min = num >= -100;
    boolean neut = num != 0;
    if (big && min && neut){
        System.out.println("Yes");
    } else{
        System.out.println("No");
    }
    }
}

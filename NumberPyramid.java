package JavaCoding;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int num = 1;

        for (int i = 0; i <= n; i++){
                for (int j = 0; j <= i; j++) {
                    System.out.print(num + " ");
                    ++num;
                    if (num > n) {
                        break;
                    }
                }


            if (num > n) {
                break;
            }

            System.out.println();
        }
    }
}

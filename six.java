package JavaCoding;

import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        int last = num % 10;

        int sec = (num /= 10);
        int second = sec % 10;

        int tre = (num /= 10);
        int thrird = tre % 10;

        for ( int i = 1 ; i <= last; i++){
            for (int j = 1 ; j <= second; j++){
                for (int k = 1; k <= thrird; k++){
                    int sum = i * j * k;
                    System.out.printf("%d * %d * %d = %d;%n",i,j,k,sum);
                }
            }
        }

    }
}

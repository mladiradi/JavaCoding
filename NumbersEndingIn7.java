package JavaCoding;

import java.util.Scanner;

public class NumbersEndingIn7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
//for ( променяме горния int на i ; i <= 1000; i++)
        for (int i = n; i < 1000; ++i) {
            if (i % 10 == 7) {
                System.out.println(i);
            }
        }

    }
}

//for(int i = 7; i <= 997; i += 10 (ще добавя 10 към седем и така винаги числото ще савършва на 7)){
//        System.out.println(i);
//        }
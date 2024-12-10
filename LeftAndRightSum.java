package JavaCoding;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int leftS = 0 ;
        int rightS = 0;

        for (int i = 0; i < n; i++){
            int number = Integer.parseInt(scan.nextLine());
            leftS += number;
        }

        for (int i = 0; i < n; i++){
            int number = Integer.parseInt(scan.nextLine());
            rightS += number;
        }
if( leftS == rightS ){
    System.out.println(" Yes, sum = " + leftS);
}else {
    System.out.println(" No, diff = " + Math.abs(rightS - leftS));
}



    }
}

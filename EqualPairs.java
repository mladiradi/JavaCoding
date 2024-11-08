package JavaCoding;

import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int leftS = 0;
        int rightS = 0;
        int max = 0;
        int min = 0;
        int maxsum = 0;
        int minsum = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scan.nextLine());
            leftS += number;
            if (number > max) {
                max = number;
            } else if (number < min) {
                min = number;
            }
            if (i % 2 != 0 ){
                maxsum =leftS;
            }
        }
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scan.nextLine());
            rightS += number;
            if (number > max) {
                max = number;
            } else if (number < min) {
                min = number;
            }
            if (i % 2 ==0 ){
                minsum =rightS;
            }
        }
        if (n < 2) {
            System.out.println(" Yes, value1=" + (leftS + leftS));
        } else if (leftS == rightS) {
            System.out.println(" Yes, value2=" + leftS);
        } else if (n > 2) {


            if ((leftS+rightS) % n == 0 ) {    //(leftS != rightS)

                System.out.printf("Yes, value3=" + ((leftS + rightS) / n));



            } else if ((leftS+rightS) % n != 0) {
                System.out.println(" No, maxdiff1=" + (max - min));
            }




        } else if (leftS != rightS) {
            System.out.println(" No, maxdiff2=" + ((max - min) - 1));
        }
    }

}
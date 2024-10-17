package JavaCoding;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double sum = 0;
        int cunt = 0;

//        for (int i = 0; i < n; i++ ){
//            int num = Integer.parseInt(scan.nextLine());
//            sum += num ;
//        }
//        System.out.printf("%.2f", (double)(sum / n));

        while (n >0){
            int num = Integer.parseInt(scan.nextLine());
            cunt++;
            sum += num ;
            if (cunt >= n){
                System.out.printf("%.2f", (double)(sum / n));
                break;
            }
        }
    }
}

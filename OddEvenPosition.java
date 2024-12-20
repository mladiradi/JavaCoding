package JavaCoding;

import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double even = 0;
        double odd = 0;
        double maxeven = Integer.MIN_VALUE;
        double mineven = Integer.MAX_VALUE;
        double maxodd = Integer.MIN_VALUE;
        double minodd = Integer.MAX_VALUE;
        String no = "No";

        for (int i = 0; i < n; i++) {
            double number = Double.parseDouble(scan.nextLine());

            if (number % 2 == 0) {
                if (number > maxeven) {
                    maxeven = number;
                } else if (number < mineven) {
                    mineven = number;
                }
                even += number;
            } else {
                if (number > maxodd) {
                    maxodd = number;
                } else if (number < minodd) {
                    minodd = number;
                }
                odd += number;
            }
        }
        System.out.printf("OddSum=%.2f%n", odd);
        if (minodd == Integer.MAX_VALUE){
            System.out.println("No");
        }else{System.out.printf("OddMin=%.2f%n", minodd);}
        System.out.printf("OddMax=%.2f%n", maxodd);
        System.out.printf("EvenSum=%.2f%n", even);
        System.out.printf("EvenMin=%.2f%n", mineven);
        System.out.printf("EvenMax=%.2f%n", maxeven);
    }
}

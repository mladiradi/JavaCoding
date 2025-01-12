package JavaCoding;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int z = Integer.parseInt(scan.nextLine());
        int sum = Integer.parseInt(scan.nextLine());
        int cunt = 0;
        boolean combi = false;
        for (int i = a; i <= z; i++) {
            for (int ii = a; ii <= z; ii++) {
                cunt++;
                if ((i + ii) == sum) {
                    combi = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", cunt, i, ii, sum);
                    break;
                }
            }

            if (combi) {
                break;
            }
        }

            if (!combi) {
                System.out.printf("%d combinations - neither equals %d", cunt, sum);
            }

        }
    }



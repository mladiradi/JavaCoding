package JavaCoding;

import java.util.Scanner;

public class UniquePINCodes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());

        int ai = 0;
        int bi = 0;
        int ci = 0;

        for (int i = 2; i < a; i++) {

            for (int ii = 2; ii <= b  ; ii++) {


                for (int iii = 2; iii < c; iii++) {

                    if (i % 2 == 0) {
                        ai = i;
                    }

                    if (!(b % ii == 0)) {
                        bi = ii;
                    }

                    if (iii % 2 == 0) {
                        ci = iii;
                    }


                        System.out.print(ai);
                        System.out.print(bi);
                        System.out.print(ci);
                        System.out.println();
                    }
                }
            }
        }
    }

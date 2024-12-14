package JavaCoding;

import java.util.Scanner;

public class MultiplyBy2Foreign {

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                while (true) {
                    double y = Double.parseDouble(sc.nextLine());
                    if (y < 0) {
                        System.out.println("Negative number!");
                        break;
                    }
                    System.out.printf("Result: %.2f%n", y * 2);
                    y++;
                }
            }
        }
    
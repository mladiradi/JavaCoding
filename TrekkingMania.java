package JavaCoding;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nGroup = Integer.parseInt(scan.nextLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;
        double sumPeople = 0;

        for (int i = 0; i < nGroup; i++) {
            double groupC = Integer.parseInt(scan.nextLine());
            sumPeople += groupC;
            if (groupC <= 5) {
                p1 += groupC;
            } else if (groupC <= 12) {
                p2 += groupC;
            } else if (groupC <= 25) {
                p3 += groupC;
            } else if (groupC <= 40) {
                p4 += groupC;
            }else{
                p5 +=groupC;
            }
        }

        System.out.printf("%.2f%%%n",(p1 / sumPeople)*100 );
        System.out.printf("%.2f%%%n",(p2 / sumPeople)*100 );
        System.out.printf("%.2f%%%n",(p3 / sumPeople)*100 );
        System.out.printf("%.2f%%%n",(p4 / sumPeople)*100 );
        System.out.printf("%.2f%%%n",(p5 / sumPeople)*100 );


    }
}

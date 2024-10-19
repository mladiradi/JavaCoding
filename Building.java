package JavaCoding;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cuntF = Integer.parseInt(scan.nextLine());
        int cuntR = Integer.parseInt(scan.nextLine());

        for (int f = cuntF; f > 0; f--){
            String type;
            if (f == cuntF){
                type = "L";
            } else if (f % 2 == 1) {
                type = "A";
            }else{
                type = "O";
            }

            for (int r = 0; r < cuntR; r++){
                System.out.printf("%s%d%d ",type,f,r);
            }
            System.out.println();
        }
    }
}

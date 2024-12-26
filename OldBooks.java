package JavaCoding;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nameSB = scan.nextLine();
        int cunt = 0;

        while (true) {
            String name = scan.nextLine();


            if (nameSB.equals(name)) {
                System.out.printf("You checked %d books and found it.", cunt);
                break;
            }
            if (name.equals("No More Books")) {
                System.out.println("The book you search is not here!");
                System.out.printf("You checked %d books.", cunt);
                break;
            }
            cunt++;
        }

    }
}

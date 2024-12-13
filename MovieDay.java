package JavaCoding;

import java.util.Scanner;

public class MovieDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int wholetime = Integer.parseInt(scan.nextLine());
        int scenesnum = Integer.parseInt(scan.nextLine());
        int scenetime = Integer.parseInt(scan.nextLine());

        double pretime = wholetime * 0.15;
        double sumscene = scenesnum * scenetime;
        double total = pretime + sumscene;

        if (wholetime >= total){
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!", wholetime - total);

        }else{
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.",total - wholetime);
        }
    }
}

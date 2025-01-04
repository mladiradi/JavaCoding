package JavaCoding;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    int nrestD = Integer.parseInt(scan.nextLine());

    int wdGame = (365 - nrestD) * 63;
    int rdGame = nrestD * 127;
    int total = wdGame + rdGame;

    double dif1 = 30000 - total;
    double hour1 = dif1 / 60;
    double min =  (hour1 - Math.floor(hour1)) * 60;

    double dif2 = total - 30000;
    double hour2 = dif2 /60;
    double min2 =  (hour2 - Math.floor(hour2)) * 60;


    if (30000 > total){
        System.out.printf("Tom sleeps well%n" +
                "%.0f hours and %.0f minutes less for play%n",Math.floor(hour1),min);
    } else {
        System.out.printf("Tom will run away%n" +
                "%.0f hours and %.0f minutes more for play%n",Math.floor(hour2) , min2);
    }


    }
}

package JavaCoding;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double record = Double.parseDouble(scan.nextLine());
        double distance = Double.parseDouble(scan.nextLine());
        double seconds = Double.parseDouble(scan.nextLine());
        double time = (Math.floor(distance / 15) * 12.5) + (distance * seconds);
        if (record > time){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",time);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.",time - record);
        }
    }
}

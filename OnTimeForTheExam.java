package JavaCoding;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int examHour = Integer.parseInt(scan.nextLine());
        int examMin = Integer.parseInt(scan.nextLine());
        int arrHour = Integer.parseInt(scan.nextLine());
        int arrMin = Integer.parseInt(scan.nextLine());

        int examTimeMin = examHour * 60 + examMin;
        int arrTimeMin = arrHour * 60 + arrMin;

        int diff = examTimeMin - arrTimeMin;
        String output = "";
        if (diff >= 0 && diff <= 30) {
            output = "On time";
        } else if (diff > 30) {
            output = "Early";
        } else {
            output = "Late";
        }
        System.out.printf("%s%n", output);

        String arrPer = diff < 0 ? "after" : "before";
        diff = Math.abs(diff);

        if (diff != 0) {
            if (diff < 60) {
                System.out.printf("%d minutes %s the start", diff, arrPer);
            } else {
                System.out.printf("%d:%02d hours %s the start", diff / 60, diff % 60, arrPer);
            }
        }
    }}

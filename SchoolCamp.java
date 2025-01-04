package JavaCoding;

import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String season = scan.nextLine();
        String type = scan.nextLine();
        int nKids = Integer.parseInt(scan.nextLine());
        int nights = Integer.parseInt(scan.nextLine());

        double indiP = 0.0;
        double mixP = 0.0;
        String sport = "";

        switch (season) {
            case "Winter":
                indiP = 9.60 ;
                mixP = 10;
                break;
            case "Spring":
                indiP = 7.20;
                mixP = 9.50;
                break;
            case "Summer":
                indiP = 15;
                mixP = 20;
                break;
        }

        double sum = "boys".equals(type)
                || "girls".equals(type) ? indiP * nights * nKids : mixP * nights * nKids;

        if (nKids >= 10 && nKids < 20) {
            sum *= 0.95;
        } else if (nKids >= 20 && nKids < 50 ) {
            sum *= 0.85;
        } else if (nKids >= 50) {
            sum *= 0.50;
        }
        if ("Winter".equals(season)){
            switch (type){
                case "girls":
                    sport = "Gymnastics"; break;
                case "boys":
                    sport = "Judo"; break;
                case "mixed":
                    sport = "Ski"; break;
            }
        } else if ("Spring".equals(season)) {
            switch (type) {
                case "girls":
                    sport = "Athletics";
                    break;
                case "boys":
                    sport = "Tennis";
                    break;
                case "mixed":
                    sport = "Cycling";
                    break;
            }
        } else if ("Summer".equals(season)) {
            switch (type) {
                case "girls":
                    sport = "Volleyball";
                    break;
                case "boys":
                    sport = "Football";
                    break;
                case "mixed":
                    sport = "Swimming";
                    break;
            }
        }
        System.out.printf("%s %.2f lv.",sport,sum);
    }
}


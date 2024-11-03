package JavaCoding;

import java.util.Scanner;

public class Darts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nameP = scan.nextLine();

        int score = 301;
        int cunt = 0;
        int fcunt = 0;

        String input = scan.nextLine();
        while (!"Retire".equals(input)) {
            String type = input;
            int points = Integer.parseInt(scan.nextLine());

            if ("Double".equals(type)) {
                points *= 2;
            } else if ("Triple".equals(type)) {
                points *= 3;
            }

            if (points > score) {
                fcunt++;
            } else if (points < score) {
                cunt++;
                score -= points;
            } else if (points == score) {
                cunt++;
                score -= points;
                System.out.printf("%s won the leg with %d shots.", nameP, cunt);
                break;
            }

            input = scan.nextLine();
        }
        
        if ("Retire".equals(input)) {
            System.out.printf("%s retired after %d unsuccessful shots.", nameP, fcunt);

        }
    }
}
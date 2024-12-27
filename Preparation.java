package JavaCoding;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int crashscores = Integer.parseInt(scan.nextLine());
        int cunt = 0;
        double sum = 0.0;
        String lastN = "";
        int cuntscore = 0;

        while (true) {
            String name = scan.nextLine();
            if ("Enough".equals(name)) {
                System.out.printf("Average score: %.2f%n", sum / cunt);
                System.out.printf("Number of problems: %d%n", cunt);
                System.out.printf("Last problem: %s", lastN);
                break;
            }

            int score = Integer.parseInt(scan.nextLine());
            cunt++;
            sum += score;
            lastN = name;
            if (score <= 4) {
                cuntscore++;
                if (crashscores == cuntscore) {
                    System.out.printf("You need a break, %d poor grades.", cuntscore);
                    break;
                }
            }
        }
    }
}


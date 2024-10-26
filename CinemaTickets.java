package JavaCoding;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int standatCunt = 0;
        int studentCunt = 0;
        int kidaCunt = 0;
        int totalT = 0;


        String input = scan.nextLine();
        while (!"Finish".equals(input)) {
            String movieN = input;
            int seats = Integer.parseInt(scan.nextLine());
            int ticketCunt = 0;


            input = scan.nextLine();
//            String input2 = scan.nextLine();
            while (!"End".equals(input)) { //input2
                String ticket = input;
                ticketCunt++;

                switch (ticket) {
                    case "standard":
                        standatCunt++;
                        break;
                    case "kid":
                        kidaCunt++;
                        break;
                    case "student":
                        studentCunt++;
                        break;
                }

                if (ticketCunt >= seats) {
                    break;
                }

                input = scan.nextLine();
//                input2 = scan.nextLine();
            }

            totalT += ticketCunt;
            System.out.printf("%s - %.2f%% full.%n", movieN, 100.0 * ticketCunt / seats);

            input = scan.nextLine();
        }
        System.out.printf("Total tickets: %d%n",totalT);
        System.out.printf("%.2f%% student tickets.%n",100.0 * studentCunt / totalT);
        System.out.printf("%.2f%% standard tickets.%n",100.0 * standatCunt / totalT);
        System.out.printf("%.2f%% kids tickets.%n",100.0 * kidaCunt / totalT);
    }
}

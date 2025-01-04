package JavaCoding;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int projectNum = Integer.parseInt(scanner.nextLine());
        int hoursPerOne = 3;
        int timeToFinish = projectNum * hoursPerOne;
        System.out.println("The architect " +name+ " will need " +timeToFinish+ " hours to complete " + projectNum + " project/s.");
    }
}

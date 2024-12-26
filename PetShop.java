package JavaCoding;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countDog = Integer.parseInt(scanner.nextLine());
        int countCat = Integer.parseInt(scanner.nextLine());
        double priceDog = 2.5;
        double priceCat = 4;
        double dog = countDog * priceDog;
        double cat = countCat * priceCat;
        double total = dog + cat;
        System.out.println(total + " lv.");
    }
}

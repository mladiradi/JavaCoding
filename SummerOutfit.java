package JavaCoding;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int degree = Integer.parseInt(scan.nextLine());
        String dayT = scan.nextLine();
        String shoes = "";
        String clotes = "";

        if ("Morning".equals(dayT)){
            if (degree >= 10 && degree <= 18){
                clotes = "Sweatshirt";
                shoes = "Sneakers";
            } else if (degree > 18 && degree <= 24) {
                clotes = "Shirt";
                shoes = "Moccasins";
            } else if (degree >=25 ) {
                clotes = "T-Shirt";
                shoes = "Sandals";
            } //System.out.printf("It's %d degrees, get your %s and %s.", degree, clotes, shoes);

            }
        if ("Afternoon".equals(dayT)){
            if (degree >= 10 && degree <= 18){
                clotes = "Shirt";
                shoes = "Moccasins";
            } else if (degree > 18 && degree <= 24) {
                clotes = "T-Shirt";
                shoes = "Sandals";
            } else if (degree >=25 ) {
                clotes = "Swim Suit";
                shoes = "Barefoot";
            } //System.out.printf("It's %d degrees, get your %s and %s.", degree, clotes, shoes);

        }
        if ("Evening".equals(dayT)){
            if (degree >= 10 && degree <= 18){
                clotes = "Shirt";
                shoes = "Moccasins";
            } else if (degree > 18 && degree <= 24) {
                clotes = "Shirt";
                shoes = "Moccasins";
            } else if (degree >=25 ) {
                clotes = "Shirt";
                shoes = "Moccasins";
            }

            //System.out.printf("It's %d degrees, get your %s and %s.", degree, clotes, shoes);

        }
            System.out.printf("It's %d degrees, get your %s and %s.", degree, clotes, shoes);
        }
    }


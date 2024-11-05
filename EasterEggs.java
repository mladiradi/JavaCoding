package JavaCoding;

import java.util.Scanner;

public class EasterEggs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int red = 0;
        int orange = 0;
        int blue = 0;
        int green = 0;
        int max = Integer.MIN_VALUE;
        String col = "";

        for (int i = 0; i < n ; i++){
            String color = scan.nextLine();

            switch (color) {

                case "red":
                    red += 1;
                    if (red > max){
                        max = red;
                        col = "red";
                    }
                    break;
                case "orange":
                    orange += 1;
                    if (orange > max){
                        max = orange;
                        col = "orange";
                    }
                    break;
                case "blue":
                    blue += 1;
                    if (blue > max){
                        max = blue;
                        col = "blue";
                    }
                    break;
                case "green":
                    green += 1;
                    if (green > max){
                        max = green;
                        col = "green";
                    }
                    break;

                }
        }
        System.out.printf("Red eggs: %d%n",red);
        System.out.printf("Orange eggs: %d%n",orange);
        System.out.printf("Blue eggs: %d%n", blue);
        System.out.printf("Green eggs: %d%n",green);
        System.out.printf("Max eggs: %d -> %s",max,col);
    }
}

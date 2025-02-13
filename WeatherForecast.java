package JavaCoding;

import java.util.Scanner;

public class WeatherForecast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String data = scan.nextLine();
        if (data.equals("sunny")){
            System.out.println("It's warm outside!");
        } else
            System.out.println("It's cold outside!");

    }
}

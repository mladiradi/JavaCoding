package JavaCoding;

import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        for (int n = 0; n < text.length(); n++){
            System.out.println(text.charAt(n));}

    }
}

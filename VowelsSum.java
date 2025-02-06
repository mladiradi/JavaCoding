package JavaCoding;

import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        int fin = 0;

        for (int n = 0; n < text.length(); n++) {
            char sym = text.charAt(n);
            switch(sym){
                case 'a':
                    fin += 1; break;
                case 'e':
                    fin += 2; break;
                case 'i':
                    fin += 3; break;
                case 'o':
                    fin += 4; break;
                case 'u':
                    fin += 5; break;
            }
        }

        System.out.println(fin);
    }
}

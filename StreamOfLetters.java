package JavaCoding;

import java.util.Scanner;

public class StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String result = "";
        String word = "";

        boolean c = false;
        boolean o = false;
        boolean n = false;
        while (!"End".equals(input)) {
            char symbol = input.charAt(0);
            if (!(symbol >= 65 && symbol <= 90) && !(symbol >= 97 && symbol <= 122)) {
                input = scanner.nextLine();
                continue;
            }
            if (symbol == 'c' && c == false) {
                c = true;
                if (c && o && n) {
                    result += word + " ";
                    word = "";
                    c = false;
                    o = false;
                    n = false;
                }
                input = scanner.nextLine();
                continue;
            } else if (symbol == 'o' && o == false) {
                o = true;
                if (c && o && n) {
                    result += word + " ";
                    word = "";
                    c = false;
                    o = false;
                    n = false;
                }
                input = scanner.nextLine();
                continue;
            } else if (symbol == 'n' && n == false) {
                n = true;
                if (c && o && n) {
                    result += word + " ";
                    word = "";
                    c = false;
                    o = false;
                    n = false;
                }
                input = scanner.nextLine();
                continue;
            }

            word += symbol;

            input = scanner.nextLine();
        }
        System.out.println(result);
    }
}





    



// input = scanner.nextLine();
//         for (int i = 0; i < input.length(); i++) {
//        if (input.charAt(i) == 'g') {
//        continue;
//        }
//
//        System.out.println(input.charAt(i));
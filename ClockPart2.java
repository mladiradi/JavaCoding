package JavaCoding;

public class ClockPart2 {
    public static void main(String[] args) {

        int c = 60;
        int cc = 24;
        int ccc = 60;
        for (int ii = 0; ii < cc; ii++) {

            for (int i = 0; i < c; i++) {

                for (int iii = 0; iii < ccc; iii++)

                System.out.printf("%d : %d : %d%n", ii, i,iii);
            }
        }
    }
}
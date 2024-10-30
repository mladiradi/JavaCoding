package JavaCoding;

public class ClockForLoop {
    public static void main(String[] args) {

        for (int ii = 0; ii <= 23; ii++) {

            for (int i = 0; i <= 59; i++) {
                System.out.printf("%.0f : %.0f%n", ii, i);

            }
        }

    }
}
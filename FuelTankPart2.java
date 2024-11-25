package JavaCoding;

import java.util.Scanner;

public class FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String oil = scan.nextLine();
        double litre = Double.parseDouble(scan.nextLine());
        String card = scan.nextLine();

        double gasoline = litre * 2.22;
        double diesel = litre * 2.33;
        double gas = litre * 0.93;

        double discGasoline = litre * (2.22 - 0.18);
        double discDiesel = litre * (2.33 - 0.12);
        double discGas = litre * (0.93 - 0.08);



        if (oil.equals("Gasoline")) {
            if (card.equals("Yes")) {
                if (litre <= 20) {
                    System.out.printf("%.2f lv.", discGasoline);
                } else if (litre > 25) {
                    System.out.printf("%.2f lv.", discGasoline - (discGasoline * 0.1));
                } else {
                    System.out.printf("%.2f lv.", discGasoline - (discGasoline * 0.08));
                }

            } if (card.equals("No")){
                if (litre <= 20) {
                    System.out.printf("%.2f lv.", gasoline);
                } else if (litre > 25) {
                    System.out.printf("%.2f lv.", gasoline - (gasoline * 0.1));
                } else {
                    System.out.printf("%.2f lv.",  gasoline - (gasoline * 0.08));
                }

            }
        }

        if (oil.equals("Diesel")) {
            if (card.equals("Yes")) {
                if (litre <= 20) {
                    System.out.printf("%.2f lv.", discDiesel);
                } else if (litre > 25) {
                    System.out.printf("%.2f lv.", discDiesel - (discDiesel * 0.1));
                } else {
                    System.out.printf("%.2f lv.", discDiesel - (discDiesel * 0.08));
                }

            } if (card.equals("No")){
                if (litre <= 20) {
                    System.out.printf("%.2f lv.", diesel);
                } else if (litre > 25) {
                    System.out.printf("%.2f lv.", diesel - (diesel * 0.1));
                } else {
                    System.out.printf("%.2f lv.",  diesel - (diesel * 0.08));
                }

            }
        }
        if (oil.equals("Gas")) {
            if (card.equals("Yes")) {
                if (litre <= 20) {
                    System.out.printf("%.2f lv.", discGas);
                } else if (litre > 25) {
                    System.out.printf("%.2f lv.", discGas - (discGas * 0.1));
                } else {
                    System.out.printf("%.2f lv.", discGas - (discGas * 0.08));
                }

            } if (card.equals("No")){
                if (litre <= 20) {
                    System.out.printf("%.2f lv.", gas);
                } else if (litre > 25) {
                    System.out.printf("%.2f lv.", gas - (gas * 0.1));
                } else {
                    System.out.printf("%.2f lv.",  gas - (gas * 0.08));
                }

            }
        }
    }

}
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // First task
        System.out.print("First task\nInput a side of a square: ");
        double SideOfSquare = in.nextDouble();
        System.out.println("P = " + P(SideOfSquare));
        System.out.println("S = " + S(SideOfSquare));

        //Second task
        System.out.print("\nSecond task\nInput x = ");
        double x = in.nextDouble();

        System.out.print("Input a = ");
        double a = in.nextDouble();
        double PriceForKg = a/x;
        System.out.print("\nPrice for " + x + " kg of sweets - " + a + " rub\nPrice for 1 kg - " + PriceForKg + "\n");

        System.out.print("\nInput y = ");
        double y = in.nextDouble();

        System.out.print("\nPrice for " + y + " kg of sweets - " + (PriceForKg*y) + " rub");

        System.out.print("\nInput k = ");
        double k = in.nextDouble();
        System.out.print("For " + k + " rub you can buy " + (k/PriceForKg) + " kg of sweets");



    }

    public static double P(double SideOfSquare) {
        return 4*SideOfSquare;
    }

    public static double S(double SideOfSquare) {
        return SideOfSquare*SideOfSquare;
    }
}

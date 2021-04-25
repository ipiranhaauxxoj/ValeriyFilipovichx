package com.company;

public class Main {

    public static void main(String[] args) {

        int iIntToStr = 35;
        String str_one = Integer.toString(iIntToStr);
        System.out.println(str_one);

        double  iDoubleToString = 32.4e10;
        String str_two = Double.toString(iDoubleToString);
        System.out.println(str_two);

        long  iLongToString = 3422222;
        String str_three = Long.toString(iLongToString);
        System.out.println(str_three);

        float  iFloatToString = 3.46f;
        String str_four = Float.toString(iFloatToString);
        System.out.println(str_four);

    }
}

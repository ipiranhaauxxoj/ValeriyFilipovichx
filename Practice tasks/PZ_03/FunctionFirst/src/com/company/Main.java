package com.company;
public class Main {

    public static void func(double x){
        double a = 4.6;
        double b = 3.2;
        double y;
        if(x >= 2) {
            y = Math.sqrt(1+x*Math.sqrt(a*x));
        } else
        {
            y = Math.sin(b*x)+3;
        }
        System.out.println("y = " + y);
    }

    public static void main(String[] args) {
        func(3.78);
        func(1.54);
    }
}

package com.company;
public class Main {

    public static void func(double x){
        double a = 1.8;
        double b = 3.3;
        double y = 0;
        if(x <= 3) {
           y = Math.pow(a*x+1, 4);
        }
        if (x > 3 && x <= 5) {
            y = 1/(2*x*x+b*Math.log(x));
        }
        if (x > 5) {
            y = a*Math.pow(Math.cos(b+x), 2);
        }
        System.out.println("y = " + y);
    }

    public static void main(String[] args) {
        func(2.46);
        func(4.3);
        func(6.82);
    }
}

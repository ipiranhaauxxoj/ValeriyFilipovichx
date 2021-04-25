package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Пример №1\n" + 1e20f*1e20f +"  " + -1e200*1e200);

        System.out.println("\nПример №2");
        System.out.println(1e-40f/1e10f);  // underflow для float
        System.out.println(-1e-300/1e100); // underflow для double
        float f=1e-6f; System.out.println(f);
        f+=0.002f;     System.out.println(f);
        f+=3;          System.out.println(f);
        f+=4000;       System.out.println(f);

        System.out.println("\nПример №3");
        double d = 1e-305 * Math.PI;  System.out.println(d);
        for (int i = 0; i < 4; i++)   System.out.println(d /= 100000);

    }
}

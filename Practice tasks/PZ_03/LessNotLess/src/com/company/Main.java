package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        String res = num<100 ? "less" : "not less";
        System.out.println("Result: " + res);
        in.close();
    }
}

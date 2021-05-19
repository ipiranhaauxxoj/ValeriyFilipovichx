package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input: ");
        int num = in.nextInt();
        String res = "";

        if (num >= 91 && num <= 100)
            res = "A";
        else if (num >= 81 && num <= 90)
                res = "B";
             else if (num >= 71 && num <= 80)
                    res = "C";
                 else if (num >= 61 && num <= 70)
                        res = "D";
                      else if (num >= 51 && num <= 60)
                            res = "E";
                            else if (num <= 50)
                                res = "F";
        in.close();
        System.out.print("Output: " + res);
    }
}

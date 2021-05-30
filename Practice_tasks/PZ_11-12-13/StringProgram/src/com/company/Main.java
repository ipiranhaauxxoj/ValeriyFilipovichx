package com.company;

public class Main {

    public static void main(String[] args) {
        Main t = new Main();
        String s1 = "Hello world !!!";
        String s2 = new String("Hello world !!!");
        System.out.println("String`s equally = " +
                (s1.equals(s2)));
        System.out.println(
                "Strings are the same = " + (s1==s2));
    }
}

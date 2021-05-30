package com.company;

public class Main {

    public static void main(String[] args) {
        Main t = new Main();
        String s = "prefix !";
        System.out.println(s);
        s = s.trim();
        System.out.println(s);
        s = s.concat(" suffix");
        System.out.println(s);
    }
}

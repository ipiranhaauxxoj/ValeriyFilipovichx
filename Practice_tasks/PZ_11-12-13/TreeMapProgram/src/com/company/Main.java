package com.company;

import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Main t = new Main();
        TreeMap tm = new TreeMap();
        tm.put("key","String1");
        System.out.println(tm.get("key"));
        tm.put("key","String2");
        System.out.println(tm.get("key"));
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abc");
        String str = sb.append("e").insert(4,
                "f").insert(3,"d").toString();
        System.out.println(str);
    }
}

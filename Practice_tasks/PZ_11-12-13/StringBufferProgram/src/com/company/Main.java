package com.company;

public class Main {

    public static void main(String[] args) {
        Main t = new Main();
        String s = new String("ssssss");
        StringBuffer sb =
                new StringBuffer("bbbbbb");
        s.concat("-aaa");
        sb.append("-aaa");
        System.out.println(s);
        System.out.println(sb);
    }
}

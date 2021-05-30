package com.company;

public class Main {

    public static void main(String[] args) {
        Main t = new Main();
        StringBuffer sb = new StringBuffer("aaa");
        System.out.println("Before = " + sb);
        t.doTest(sb);
        System.out.println("After = " + sb);
    }
    void doTest(StringBuffer theSb){
        theSb.append("-bbb");
    }
    
}

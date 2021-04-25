package com.company;
public class Main {
    public static void main(String[] args) {

        int a=5; int b=a;
        a=3;
        System.out.println("\nПример №1\n" + b);

        byte x=5;
        byte y1=x++; // на момент начала исполнения x равен 5
        byte y2=x--; // на момент начала исполнения x равен 6
        byte y3=++x; // на момент начала исполнения x равен 5
        byte y4=--x; // на момент начала исполнения x равен 6
        System.out.println("\nПример №2\n"
                + y1 + " " + y2 + " " + y3 + " " + y4);

        System.out.println("\nПример №3");
        byte xb=-128;  System.out.println(-xb);
        byte y=127;    System.out.println(++y);

    }
}

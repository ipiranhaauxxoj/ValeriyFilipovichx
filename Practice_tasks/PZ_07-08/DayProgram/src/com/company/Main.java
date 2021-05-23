package com.company;

enum Day{

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}


public class Main {

    public static void main(String[] args) {
        Day current = Day.MONDAY;
        System.out.println(current);    // MONDAY
    }
}

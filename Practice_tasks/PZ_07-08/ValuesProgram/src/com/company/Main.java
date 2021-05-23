package com.company;

enum Type
{
    SCIENCE,
    BELLETRE,
    PHANTASY,
    SCIENCE_FICTION
}


public class Main {

    public static void main(String[] args) {
        Type[] types = Type.values();
        for (Type s : types) { System.out.println(s); }
    }
}

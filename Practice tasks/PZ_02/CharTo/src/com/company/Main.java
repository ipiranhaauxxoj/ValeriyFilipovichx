package com.company;

public class Main {

    public static void main(String[] args) {

        char ch = 'S'; //char to String
        // c использованием класса Character
        String charToString = Character.toString(ch);
        System.out.println(charToString);
        // с использованием операции добавления класса String
        String str = "" + ch;
        System.out.println(str);
        //с использованием массива
        String fromChar = new String(new char[] { ch });
        System.out.println(fromChar);
        // с использованием метода valueOf класса String
        String valueOfchar = String.valueOf(ch);
        System.out.println(valueOfchar);
        char ch_two = '9'; //char to int
        // c использованием метода getNumericValue класса Character
        int i1 = Character.getNumericValue(ch_two);
        System.out.println(i1);
        // c использованием метода digit класса Character
        int i2 = Character.digit(ch_two,10);
        System.out.println(i2);

    }
}

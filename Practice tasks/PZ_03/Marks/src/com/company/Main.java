package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input: ");
        int num = in.nextInt();
        String res = "";
        switch (num) {
            case 2: res = "неудовлетворительно"; break;
            case 3: res = "удовлетворительно"; break;
            case 4: res = "хорошо"; break;
            case 5: res = "отлично"; break;
            default: res = "Ошибка! Проверьте введённые данные!";
        }
        in.close();
        System.out.print("Output: " + res);
    }
}

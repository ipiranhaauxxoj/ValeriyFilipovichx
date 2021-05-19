package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input: ");
        String str = in.next();
        str = str.toLowerCase();
        String res = "";
        switch (str) {
            case "воскресенье": res += 0; break;
            case "понедельник": res += 1; break;
            case "вторник": res += 2; break;
            case "среда" : res += 3; break;
            case "четверг": res += 4; break;
            case "пятница": res += 5; break;
            case "суббота": res += 6; break;
            default: res += "Ошибка! Проверьте введённые данные!";
        }
        in.close();
        System.out.print("Output: " + res);


    }
}

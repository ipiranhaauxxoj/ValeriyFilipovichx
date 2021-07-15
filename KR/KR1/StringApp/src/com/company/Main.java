package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {

    private static Random sRandom = new Random();
    private static char[] sAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
    private static int sLength = sAlphabet.length;

    public static void main(String[] args) {
        //First Task
        System.out.println("First Task");
        int passLength = (int)(Math.random()*15)+5;
        int charCapCount = (int)(Math.random()*(passLength+1))+2;
        int numCount = 5 >= 5 ? (int)(Math.random()*(6)):(int)(Math.random()*(passLength-charCapCount));

        int charCount = passLength - charCapCount - numCount;
        ArrayList<Character> password = new ArrayList<Character>();
        Random r = new Random();
        password.add('_');
        for (int i = 0; i < charCapCount; i++)
        {
            password.add((char)((int)(Math.random()*25)+65));
        }
        for (int i = 0; i < numCount; i++)
        {
            password.add((char)((int)(Math.random()*10)+48));
        }
        for (int i = 0; i < charCount; i++)
        {
            password.add((char)((int)(Math.random()*26)+97));
        }
        Collections.shuffle(password);
        String str = password.toString().replaceAll(", |\\[|\\]", "");
        while (str.matches("(.*)\\d{2}(.*)"))
        {
            Collections.shuffle(password);
            str = password.toString().replaceAll(", |\\[|\\]", "");
        }
        System.out.println(str);
        //Second Task
        System.out.println("\nSecond Task");


        for (int i = 0; i < 7; i++)
        {
            for (int j = 0; j < 7; j++)
                System.out.print(sAlphabet[sRandom.nextInt(sLength)] + " ");
            System.out.print("\n");
        }


    }
}

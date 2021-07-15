package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        //FirstTask
        System.out.println("First Task");
        for(int i=10102; i <=99998; i+=2) {
            if((i / 100) % 2 == 1)
                if((i % 10
                        + (i / 10) % 10
                        + (i / 100) % 10
                        + (i / 1000) % 10
                        + (i / 10000)) % 4 == 0)
                System.out.println(i);
        }
        // SecondTask
        System.out.println("Second Task");
        Scanner in = new Scanner(System.in);
        System.out.print("Input a n = ");
        int n = in.nextInt();

        for(int i = n; i > 0;)
        {
            System.out.println("\nСколько брать (1, 2 или 3)?");
            int user = in.nextInt();
            i = i - user;
            if (i < 1)
            {
                System.out.println("Победил пользователь");
            }
            else
            {
                if (i > 3) {
                    int computer = 1 + (int) (Math.random() * 3);
                    i = i - computer;
                    System.out.println("Компьютер берёт:" + computer);
                }
                else
                {
                    i = 0;
                    System.out.println("Победил компьютер");
                }
            }
        }
    }
}

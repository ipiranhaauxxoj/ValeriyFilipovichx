package com.company;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.text.DateFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //FirstTask
        Scanner in = new Scanner(System.in);
        System.out.print("First Task\nInput date (dd.MM.yyyy): ");
        try {
            String dateString = in.nextLine();
            DateFormat date = new SimpleDateFormat("dd.MM.yyyy");
            date.setLenient(false);
            date.parse(dateString);
            System.out.println("Yes");
        }
        catch(Exception e) {
            System.out.print("Error! Incorrect date!\n");
        }

        //SecondTask
        int sum = 0;
        System.out.print("\nSecond Task\nInput x = ");
        int x = in.nextInt();
        System.out.print("Input y = ");
        int y = in.nextInt();
        System.out.print("Input z = ");
        int z = in.nextInt();

        if(x%5 == 0) sum+=x;
        if(y%5 == 0) sum+=y;
        if(z%5 == 0) sum+=z;

        if(sum != 0) System.out.print("Sum = " + sum);
        else System.out.print("Error!");

    }
}

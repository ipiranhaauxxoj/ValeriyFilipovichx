package com.company;
import java.io.*;
import java.lang.*;
public class Main {

    public static void main(String[] args) {
        System.out.println("Study Java");
        try {
            PrintStream print = new PrintStream(new
                    FileOutputStream("c:\\1\\file2.txt"));
            System.setOut(print);
            System.out.println("Study well");
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

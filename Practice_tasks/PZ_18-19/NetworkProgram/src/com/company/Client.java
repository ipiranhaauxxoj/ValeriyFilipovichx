package com.company;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.*;

public class Client {
    public static void main(String[] args) throws Exception {

        System.out.println("\n---Client---");
        Socket socket = null;
        try {
            socket = new Socket("localhost", 3456);
            BufferedReader dis = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String msg = dis.readLine();
            System.out.println(msg);
        }
        catch (UnknownHostException e) {System.out.println("Ошибка!");}

    }
}

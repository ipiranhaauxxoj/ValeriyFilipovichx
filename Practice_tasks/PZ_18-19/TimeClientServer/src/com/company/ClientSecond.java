package com.company;

import java.io.*;
import java.net.*;

public class ClientSecond {
    public static void main(String[] args) {
        Socket socket = null;
        try {
            socket = new Socket("localhost", 3457);
            BufferedReader dis = new BufferedReader(new
                    InputStreamReader(socket.getInputStream()));
            String msg = dis.readLine();
            System.out.println(msg);
        } catch (IOException e) {System.out.println("Ошибка: " + e); }
    }
}

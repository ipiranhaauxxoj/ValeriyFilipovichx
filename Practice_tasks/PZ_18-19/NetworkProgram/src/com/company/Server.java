package com.company;

import java.io.PrintStream;
import java.net.*;

public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("\n---Server---");
        Socket s = null;
        try {
            ServerSocket server = new ServerSocket(3456);
            s = server.accept();
            PrintStream ps = new PrintStream(s.getOutputStream());
            ps.println("Привет!");
            ps.flush();
            s.close();
        }
        catch (UnknownHostException e) {System.out.println("Ошибка!");}

    }
}

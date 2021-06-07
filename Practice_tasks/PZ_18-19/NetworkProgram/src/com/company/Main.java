package com.company;

import java.net.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        // First
        System.out.println("---First---");
        InetAddress myIP = null;
        try {
            myIP = InetAddress.getLocalHost();
        }
        catch (UnknownHostException e) {}
            System.out.println(myIP);

        //Second
        System.out.println("\n---Second---");
        InetAddress bsu = null;
        try {
            bsu = InetAddress.getByName("www.sutkt.ru");
        }
        catch (UnknownHostException e) {}
        System.out.println(bsu);

        //Third
        System.out.println("\n---Third---");
        URL aURL = new URL("http://java.sun.com:80/docs/books/tutorial" + "/index.html?name=networking#DOWNLOADING");
        System.out.println("protocol = " +  aURL.getProtocol());
        System.out.println("authority = " +  aURL.getAuthority());
        System.out.println("host = " +  aURL.getHost());
        System.out.println("port = " +  aURL.getPort());
        System.out.println("path = " +  aURL.getPath());
        System.out.println("query = " +  aURL.getQuery());
        System.out.println("filename = " +  aURL.getFile());
        System.out.println("ref = " +  aURL.getRef());



    }
}

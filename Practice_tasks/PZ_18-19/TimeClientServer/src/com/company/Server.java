package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import java.io.*;
import java.net.*;

class FirstClient extends TimerTask {
    private static Socket socketFirst = null;
    public void run() {
        try {
            ServerSocket server = new ServerSocket(3456);
            socketFirst = server.accept();
            PrintStream ps = new PrintStream(socketFirst.getOutputStream());
            ps.println("Сообщение для первого клиента!");
            ps.flush();
            socketFirst.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}

class SecondClient extends TimerTask {
    private static Socket socketSecond = null;
    public void run() {
        try {
            ServerSocket server = new ServerSocket(3457);
            socketSecond = server.accept();
            PrintStream ps = new PrintStream(socketSecond.getOutputStream());
            ps.println("Сообщение для второго клиента!");
            ps.flush();
            socketSecond.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}

public class Server {

    public static void main(String args[]) {

        Timer timerFirst = new Timer();
        Calendar dateFirst = Calendar.getInstance();
        dateFirst.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
        dateFirst.set(Calendar.HOUR, 10);
        dateFirst.set(Calendar.MINUTE, 0);
        dateFirst.set(Calendar.SECOND, 0);
        dateFirst.set(Calendar.MILLISECOND, 0);
        timerFirst.schedule(new FirstClient(), dateFirst.getTime(), 1000 * 60 * 60 * 24 * 7);

        Timer timerSecond = new Timer();
        Calendar dateSecond = Calendar.getInstance();
        dateSecond.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        dateSecond.set(Calendar.HOUR, 9);
        dateSecond.set(Calendar.MINUTE, 0);
        dateSecond.set(Calendar.SECOND, 0);
        dateSecond.set(Calendar.MILLISECOND, 0);
        timerSecond.schedule(new SecondClient(), dateSecond.getTime(), 1000 * 60 * 60 * 24 * 7);

        JFrame frame = new JFrame("Программа");
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(350,100);

        final JLabel labelFirst = new JLabel("  Первый клиент получит сообщение в среду в 10:00  ");
        final JLabel labelSecond = new JLabel("  Второй клиент получит сообщение в субботу в 9:00  ");

        frame.add(labelFirst, BorderLayout.NORTH);
        frame.add(labelSecond, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}

package com.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,2002);
        cal.set(Calendar.MONTH,Calendar.AUGUST);
        cal.set(Calendar.DAY_OF_MONTH,31);
        cal.set(Calendar.HOUR_OF_DAY,19);
        cal.set(Calendar.MINUTE,30);
        cal.set(Calendar.SECOND,00);
        System.out.println("Current date: " + sdf.format(cal.getTime()));
        cal.roll(Calendar.SECOND,75);
        System.out.println("Rule 1: " + sdf.format(cal.getTime()));
        cal.roll(Calendar.MONTH,1);
        System.out.println("Rule 2: " + sdf.format(cal.getTime()));
    }
}

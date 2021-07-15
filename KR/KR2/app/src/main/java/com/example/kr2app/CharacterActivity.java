package com.example.kr2app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Random;

public class CharacterActivity extends AppCompatActivity {
    private static Random sRandom = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_second);
        int passLength = (int)(Math.random()*7)+3;
        int charCapCount = (int)(Math.random()*(passLength+1))+2;
        int numCount = 5 >= 5 ? (int)(Math.random()*(6)):(int)(Math.random()*(passLength-charCapCount));

        int charCount = passLength - charCapCount - numCount;
        ArrayList<Character> password = new ArrayList<Character>();
        Random r = new Random();
        password.add('!');
        password.add('!');
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
        System.out.println("Случайный набор символов: " + str);


        TextView textView = new TextView(this);
        textView.setTextSize(20);
        textView.setPadding(16, 16, 16, 16);
        textView.setText("Случайный набор символов: " + str);
        setContentView(textView);
        textView.append("\n\nАлфавит:\n");

        int d = 0;
        for (char i = 'a'; i <= 'z'; i++)
        {
            if(d==5) {
                textView.append("\n");
                d = 0;
            }
            textView.append(i + " ");
            d++;
        }
    }
}
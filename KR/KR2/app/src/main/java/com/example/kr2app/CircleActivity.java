package com.example.kr2app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.stream.IntStream;
import android.widget.ScrollView;

public class CircleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_second);

        ScrollView scrollView = new ScrollView(this);

        TextView textView = new TextView(this);
        textView.setText("Числа от 1000 до 9999 такие, что все цифры различны\n\n");
        textView.setLayoutParams(new ViewGroup.LayoutParams
                (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        textView.setTextSize(14);
        scrollView.addView(textView);
        setContentView(scrollView);

        IntStream.rangeClosed(1000, 9999).
                mapToObj(String::valueOf).
                filter(s -> s.chars().distinct().count() == s.length()).
                forEach(name -> textView.append(name + " "));

        textView.append("\n\nТрехзначные числа, равные сумме кубов своих цифр\n");
        int a, b, c;
        for(a = 1; a <= 9; a++)
            for(b = 0; b <= 9; b++)
                for(c = 0; c <= 9; c++) {
                    if(a*a*a+b*b*b+c*c*c == a*100+b*10+c)
                        textView.append("\n" + a + b + c);
                }
    }
}
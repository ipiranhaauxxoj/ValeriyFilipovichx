package com.example.kr2app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Date;

public class ArithmeticActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arithmetic);
    }

    public void onClickButtonNum(View view) {
        System.out.println("Нажата!");
        TextView textView = findViewById(R.id.textView);

        try {
            EditText FirstNum = findViewById(R.id.FirstNum);
            int FirstNumValue = Integer.parseInt(FirstNum.getText().toString());

            EditText SecondNum = findViewById(R.id.SecondNum);
            int SecondNumValue = Integer.parseInt(SecondNum.getText().toString());

            EditText ThirdNum = findViewById(R.id.ThirdNum);
            int ThirdNumValue = Integer.parseInt(ThirdNum.getText().toString());
            textView.setTextSize(20);
            textView.setText("Первое число: " + (FirstNumValue*2) + "  Второе число: "+ (SecondNumValue-3) + "\nТретье число: " + (ThirdNumValue*ThirdNumValue)+
                            "  Сумма чисел: " + ( (FirstNumValue*2)+ (SecondNumValue-3) + (ThirdNumValue*ThirdNumValue) ));

        } catch (NumberFormatException e) {
            System.out.println("Неправильный формат строки!");
            textView.setText("Неправильный формат строки!");
        }
    }

    public void onClickGradusButtonNum(View view) {
        TextView textView = findViewById(R.id.textView);
        try {
            EditText GradusNum = findViewById(R.id.GradusNum);
            int GradusNumValue = Integer.parseInt(GradusNum.getText().toString());

            textView.setTextSize(20);
            textView.setText("Фаренгейт: " + (GradusNumValue*1.8+32));

        } catch (NumberFormatException e) {
            System.out.println("Неправильный формат градусов!");
            textView.setText("Неправильный формат градусов!");
        }

    }
}
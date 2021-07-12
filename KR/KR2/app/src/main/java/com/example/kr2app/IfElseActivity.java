package com.example.kr2app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class IfElseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_if_else);
    }

    public void onClickIfElseActivity(View view) {
        System.out.println("Нажата!");
        TextView textView = findViewById(R.id.textView);
        int i = 0;
        try {
            EditText FirstNum = findViewById(R.id.FirstNum);
            int FirstNumValue = Integer.parseInt(FirstNum.getText().toString());

            EditText SecondNum = findViewById(R.id.SecondNum);
            int SecondNumValue = Integer.parseInt(SecondNum.getText().toString());

            EditText ThirdNum = findViewById(R.id.ThirdNum);
            int ThirdNumValue = Integer.parseInt(ThirdNum.getText().toString());


            if(FirstNumValue > 0) i++;
            if(SecondNumValue > 0) i++;
            if(ThirdNumValue > 0) i++;

            textView.setTextSize(20);
            textView.setText("Количество положительных чисел: " + i);

        } catch (NumberFormatException e) {
            System.out.println("Неправильный формат строки!");
            textView.setText("Неправильный формат строки!");
        }
    }

    public void onClickIfElseButtonNum(View view) {
        TextView textView = findViewById(R.id.textView);
        try {

            EditText FirstNumTask = findViewById(R.id.FirstNumTask);
            int FirstNumTaskValue = Integer.parseInt(FirstNumTask.getText().toString());

            EditText SecondNumTask = findViewById(R.id.SecondNumTask);
            int SecondNumTaskValue = Integer.parseInt(SecondNumTask.getText().toString());

            int result;
            if((FirstNumTaskValue != 10) && (SecondNumTaskValue != 10) && (FirstNumTaskValue % 2 == 0))
                result = FirstNumTaskValue + SecondNumTaskValue;
            else {
                result = FirstNumTaskValue * SecondNumTaskValue;
            }

            textView.setTextSize(20);
            textView.setText("Ответ: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Неправильный формат градусов!");
            textView.setText("Неправильный формат градусов!");
        }

    }
}
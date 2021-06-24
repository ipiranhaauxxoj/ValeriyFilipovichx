package com.example.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static final String AGE_KEY = "AGE";
    static final String ACCESS_MESSAGE="ACCESS_MESSAGE";
    private static  final int REQUEST_ACCESS_TYPE=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view) {
        // получаем введенный возраст
        EditText ageBox = (EditText) findViewById(R.id.age);
        String age = ageBox.getText().toString();

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(AGE_KEY, age);
        startActivityForResult(intent, REQUEST_ACCESS_TYPE);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data){
        TextView textView = (TextView) findViewById(R.id.textView);
        if(requestCode==REQUEST_ACCESS_TYPE){
            if(resultCode==RESULT_OK){
                String accessMessage = data.getStringExtra(ACCESS_MESSAGE);
                textView.setText(accessMessage);
            }
            else{
                textView.setText("Ошибка доступа");
            }
        }
        else{
            super.onActivityResult(requestCode, resultCode, data);
        }
    }
}
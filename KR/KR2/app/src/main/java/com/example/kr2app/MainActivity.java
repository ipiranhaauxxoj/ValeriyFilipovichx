package com.example.kr2app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickScreenActivity(View view) {
        Intent intent = new Intent(this, ScreenActivity.class);
        startActivity(intent);
    }

    public void onClickArithmeticActivity(View view) {
        Intent intent = new Intent(this, ArithmeticActivity.class);
        startActivity(intent);
    }

    public void onClickIfElseActivity(View view) {
        Intent intent = new Intent(this, IfElseActivity.class);
        startActivity(intent);
    }

    public void onClickCircleActivity(View view) {
        Intent intent = new Intent(this, CircleActivity.class);
        startActivity(intent);
    }

    public void onClickCharacterActivity(View view) {
        Intent intent = new Intent(this, CharacterActivity.class);
        startActivity(intent);
    }
}
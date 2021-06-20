package com.example.helloandroidworld;

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
    public void ImageButtonClick(View view) {
        Intent intent = new Intent(this, ImageActivity.class);
        startActivity(intent);
    }

    public void AnimationButtonClick(View view) {
        Intent intent = new Intent(this, AnimationActivity.class);
        startActivity(intent);
    }
}
package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.graphics.Color;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv_hello = findViewById(R.id.tv_hello);
        tv_hello.setText("today is hot!");
        tv_hello.setTextColor(Color.RED);
        tv_hello.setTextSize(30);
    }
}

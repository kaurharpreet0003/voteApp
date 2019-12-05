package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView v1;
    TextView v2;
    TextView v3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String vote1 = intent.getExtras().getString("vote1");
        String vote2 = intent.getExtras().getString("vote2");
        String vote3 = intent.getExtras().getString("vote3");

        v1 = findViewById(R.id.v1);
        v2 = findViewById(R.id.v2);
        v3 = findViewById(R.id.v3);

        v1.setText(vote1);
        v2.setText(vote2);
        v3.setText(vote3);

    }
}

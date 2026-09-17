package com.example.studymateai;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class JavaActivity extends AppCompatActivity {

    Button btnIntro, btnVariables, btnDataTypes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);

        btnIntro = findViewById(R.id.btnIntro);
        btnVariables = findViewById(R.id.btnVariables);
        btnDataTypes = findViewById(R.id.btnDataTypes);

        // Introduction
        btnIntro.setOnClickListener(v -> {
            Intent intent = new Intent(JavaActivity.this, IntroductionActivity.class);
            startActivity(intent);
        });

        // Variables
        btnVariables.setOnClickListener(v -> {
            Intent intent = new Intent(JavaActivity.this, VariablesActivity.class);
            startActivity(intent);
        });

        // Data Types
        btnDataTypes.setOnClickListener(v -> {
            Intent intent = new Intent(JavaActivity.this, DataTypesActivity.class);
            startActivity(intent);
        });
    }
}
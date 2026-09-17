package com.example.studymateai;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class NotesActivity extends AppCompatActivity {

    Button btnJava, btnPython, btnC, btnCpp, btnHtml, btnAndroid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_notesactivity);

        btnJava = findViewById(R.id.btnJava);
        btnPython = findViewById(R.id.btnPython);
        btnC = findViewById(R.id.btnC);
        btnCpp = findViewById(R.id.btnCpp);
        btnHtml = findViewById(R.id.btnHtml);
        btnAndroid = findViewById(R.id.btnAndroid);

        // Java Button
        btnJava.setOnClickListener(v -> {
            Intent intent = new Intent(NotesActivity.this, JavaActivity.class);
            startActivity(intent);
        });

        // Python Button
        btnPython.setOnClickListener(v -> {
            // આગળ PythonActivity બનાવશું
        });

        // C Button
        btnC.setOnClickListener(v -> {
            // આગળ CActivity બનાવશું
        });

        // C++ Button
        btnCpp.setOnClickListener(v -> {
            // આગળ CppActivity બનાવશું
        });

        // HTML Button
        btnHtml.setOnClickListener(v -> {
            // આગળ HtmlActivity બનાવશું
        });

        // Android Button
        btnAndroid.setOnClickListener(v -> {
            // આગળ AndroidActivity બનાવશું
        });
    }
}
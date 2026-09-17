package com.example.studymateai;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeActivity extends AppCompatActivity {

    Button notes, ai, quiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);

        notes = findViewById(R.id.button);
        ai = findViewById(R.id.button2);
        quiz = findViewById(R.id.button3);

        // Notes Button
        notes.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, NotesActivity.class);
            startActivity(intent);
        });

        // AI Chat Button
        ai.setOnClickListener(v -> {
            Toast.makeText(HomeActivity.this, "AI Chat Clicked", Toast.LENGTH_SHORT).show();
        });

        // Quiz Button
        quiz.setOnClickListener(v -> {
            Toast.makeText(HomeActivity.this, "Quiz Clicked", Toast.LENGTH_SHORT).show();
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
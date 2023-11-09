package com.example.examen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class activity_link1 extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link1);

        Button btRegresar = findViewById(R.id.btLink1Regresar);
        btRegresar.setOnClickListener(v -> {
            Intent intent = new Intent (v.getContext(), MenuActivity.class);
            startActivity(intent);
        });

    }
}
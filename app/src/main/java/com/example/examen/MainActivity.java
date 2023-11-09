package com.example.examen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bting = findViewById(R.id.btnI);
        bting.setOnClickListener(v -> {
            Intent intent = new Intent (v.getContext(), MenuActivity.class);
            startActivity(intent);
        });


    }

}
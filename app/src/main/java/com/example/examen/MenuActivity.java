package com.example.examen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button btMainLink1 = findViewById(R.id.btMenuLink1);
        btMainLink1.setOnClickListener(v -> {
            Intent intent = new Intent (v.getContext(), activity_link1.class);
            startActivity(intent);
        });

        Button btMainLink2 = findViewById(R.id.btMenuLink2);
        btMainLink2.setOnClickListener(v -> {
            Intent intent = new Intent (v.getContext(), activity_link2.class);
            startActivity(intent);
        });

        Button btMainLink3 = findViewById(R.id.btMenuLink3);
        btMainLink3.setOnClickListener(v -> {
            Intent intent = new Intent (v.getContext(), activity_link3.class);
            startActivity(intent);
        });
    }

}

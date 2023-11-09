package com.example.examen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class activity_link3 extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link3);

        Button btRegresar = findViewById(R.id.btLink3Regresar);
        btRegresar.setOnClickListener(v -> {
            Intent intent = new Intent (v.getContext(), MenuActivity.class);
            startActivity(intent);
        });
    }
}

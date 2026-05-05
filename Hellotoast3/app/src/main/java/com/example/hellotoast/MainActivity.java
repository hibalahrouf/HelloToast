package com.example.hellotoast;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int number = 0; // compteur
    TextView txtNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNumber = findViewById(R.id.txt_number);

        Button btnMsg = findViewById(R.id.btn_msg);
        Button btnAdd = findViewById(R.id.btn_add);

        btnMsg.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "Hello there!", Toast.LENGTH_SHORT).show();
        });

        btnAdd.setOnClickListener(v -> {
            number = number + 1;
            txtNumber.setText("" + number);
        });
    }
}
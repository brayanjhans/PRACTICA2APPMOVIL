package com.example.practica2;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {
    private TextView textViewNumber1;
    private TextView textViewNumber2;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        textViewNumber1 = findViewById(R.id.textViewNumber1);
        textViewNumber2 = findViewById(R.id.textViewNumber2);
        textViewResult = findViewById(R.id.textViewResult);

        Intent intent = getIntent();
        if (intent != null) {
            int number1 = intent.getIntExtra("number1", 0);
            int number2 = intent.getIntExtra("number2", 0);
            textViewNumber1.setText("Número 1: " + number1);
            textViewNumber2.setText("Número 2: " + number2);

            if (number1 > number2) {
                textViewResult.setText("El número 1 es mayor");
            } else if (number1 < number2) {
                textViewResult.setText("El número 2 es mayor");
            } else {
                textViewResult.setText("Ambos números son iguales");
            }
        }
    }

}

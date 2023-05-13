package com.example.practica2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Calendar;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    private EditText editTextName;
    private EditText editTextAge;
    private TextView textViewData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mi_linear);

        editTextName = findViewById(R.id.editTextName);
        editTextAge = findViewById(R.id.editTextAge);
        textViewData = findViewById(R.id.textViewData);

        findViewById(R.id.buttonShow).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString();
                int age = Integer.parseInt(editTextAge.getText().toString());
                int yearOfBirth = Calendar.getInstance().get(Calendar.YEAR) - age;
                String data = textViewData.getText().toString();
                textViewData.setText(data + "\n" + name + " NACIO EN EL AÑO " + yearOfBirth);
                editTextName.setText("");
                editTextAge.setText("");
            }
        });
    }

   /* @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.entrada_datos);
        editTextNumber1 = findViewById(R.id.editTextNumber1);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
    }

    public void submitNumbers(View view) {
        int number1 = Integer.parseInt(editTextNumber1.getText().toString());
        int number2 = Integer.parseInt(editTextNumber2.getText().toString());

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("number1", number1);
        intent.putExtra("number2", number2);
        startActivity(intent);
    }

    */
}

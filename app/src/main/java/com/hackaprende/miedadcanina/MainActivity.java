package com.hackaprende.miedadcanina;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText ageEdit = findViewById(R.id.age_edit);
        TextView resultText = findViewById(R.id.result_text);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(v -> {
            String age = ageEdit.getText().toString();
            if (!age.isEmpty()) {
                int ageInt = Integer.parseInt(age);

                int result = ageInt * 7;
                String resultString = "Si fueras perro, tu edad sería " + result + " años";
                resultText.setText(resultString);
            } else {
                Log.d("MainActivity", "Age field is empty");
                Toast.makeText(this, "Debes insertar una edad", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
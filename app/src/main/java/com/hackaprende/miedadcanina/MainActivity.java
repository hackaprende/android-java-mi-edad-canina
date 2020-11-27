package com.hackaprende.miedadcanina;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.hackaprende.miedadcanina.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.button.setOnClickListener(v -> {
            String age = binding.ageEdit.getText().toString();
            if (!age.isEmpty()) {
                int ageInt = Integer.parseInt(age);

                int result = ageInt * 7;
                String resultString = getString(R.string.result_format, result);
                binding.resultText.setText(resultString);
            } else {
                Log.d("MainActivity", "Age field is empty");
                Toast.makeText(this, getString(R.string.you_have_to_insert_an_age), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
package com.app.junior.calcualtionapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText editTextInches;
    private Button buttonCalculate;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findElements();
        buttonCalculate.setOnClickListener(view -> {
            calculateMeters();
        });


    }

    private void calculateMeters() {

        if (editTextInches.getText() == null || editTextInches.getText().toString().isEmpty()){
            Toast.makeText(MainActivity.this,"You need insert number for calculate!", Toast.LENGTH_LONG).show();
        }
        else {

                Double inches = Double.parseDouble(editTextInches.getText().toString());
                Double meters = calculate(inches);

                displayResult(inches, meters);

        }

    }






    private void findElements() {
        editTextInches = findViewById(R.id.editText_inches);
        buttonCalculate = findViewById(R.id.button_calculate);
        textViewResult = findViewById(R.id.textView_result);
    }

    private Double calculate(double inches) {
        double meters = inches * 0.0254;
        return meters;
    }

    private void displayResult(Double inches, Double meters) {
        DecimalFormat df = new DecimalFormat("0.00");
        String textMeters = df.format(meters);
        String textInches = df.format(inches);
        textViewResult.setText("Inches: " + textInches + " transform to meters is: " + textMeters);
    }
}
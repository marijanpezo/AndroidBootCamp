package com.app.bmi.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    //Class Variables; also are called 'fields'
    private TextView resultText;
    private Button calculateButton;
    private RadioButton radioButtonMale;
    private RadioButton radioButtonFemale;
    private EditText ageEditText;
    private EditText feetEditText;
    private EditText inchesEditText;
    private EditText weightEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
        setupButtonClickListener();

    }

    private void findViews(){
        resultText = findViewById(R.id.text_view_result);
        radioButtonMale = findViewById(R.id.radio_button_male);
        radioButtonFemale = findViewById(R.id.radio_button_female);
        ageEditText = findViewById(R.id.edit_text_age);
        feetEditText = findViewById(R.id.edit_text_feet);
        inchesEditText = findViewById(R.id.edit_text_inches);
        weightEditText = findViewById(R.id.edit_text_weight);
        calculateButton = findViewById(R.id.button_calculate);
    }

    private void setupButtonClickListener() {
        calculateButton.setOnClickListener(view -> {
            double bmiResult = calculateBmi();

            String ageText = ageEditText.getText().toString();
            int age = Integer.parseInt(ageText);

            if(age >= 18) {
                displayResult(bmiResult);
            }
            else {
                displayGuidance(bmiResult);
            }
        });
    }



    private double calculateBmi() {
        String feetText = feetEditText.getText().toString();
        String inchesText = inchesEditText.getText().toString();
        String weightText = weightEditText.getText().toString();

        int feet = Integer.parseInt(feetText);
        int inches = Integer.parseInt(inchesText);
        int weight = Integer.parseInt(weightText);

        int totalInches = (feet * 12) + inches;

        double heightInMeters = totalInches * 0.0254;

        double bmi = weight / (heightInMeters * heightInMeters);
        return bmi;
    }

    private void displayResult(double bmi) {
        DecimalFormat df = new DecimalFormat("0.00");

        String bmiTextResult = df.format(bmi);

        String fullResultString;
        if( bmi < 18.5 ) {
            fullResultString = bmiTextResult + " - You are underweight";
        }
        else if (bmi > 25) {
            fullResultString = bmiTextResult + " - You are overweight";
        } else {
            fullResultString = bmiTextResult + " - You are healthy weight";
        }

        resultText.setText(fullResultString);
    }

    private void displayGuidance(double bmi) {
        DecimalFormat df = new DecimalFormat("0.00");
        String bmiTextResult = df.format(bmi);

        String fullResultString;
        if (radioButtonMale.isChecked()){
            fullResultString = bmiTextResult + " - As you are under 18, please consult doctor for healthy range for boys.";
        } else if (radioButtonFemale.isChecked()){
            fullResultString = bmiTextResult + " - As you are under 18, please consult doctor for healthy range for girls.";
        } else {
            fullResultString = bmiTextResult + " - As you are under 18, please consult doctor for healthy range.";
        }

        resultText.setText(fullResultString);
    }
}

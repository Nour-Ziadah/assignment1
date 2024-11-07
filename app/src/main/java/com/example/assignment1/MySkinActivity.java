package com.example.assignment1;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MySkinActivity extends AppCompatActivity {

    private TextView txtViewResult;
    private Button btnSubmit;
    private RadioGroup radioGroupQuestion1, radioGroupQuestion3;
    private CheckBox checkAcne, checkDryness, checkOiliness, checkSensitivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_my_skin);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        txtViewResult = findViewById(R.id.txtViewResult);
        btnSubmit = findViewById(R.id.btnSubmit);
        radioGroupQuestion1 = findViewById(R.id.radioGroupQuestion1);
        radioGroupQuestion3 = findViewById(R.id.radioGroupQuestion3);
        checkAcne = findViewById(R.id.checkAcne);
        checkDryness = findViewById(R.id.checkDryness);
        checkOiliness = findViewById(R.id.checkOiliness);
        checkSensitivity = findViewById(R.id.checkSensitivity);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                analyzeSkinType();
            }
        });
    }

    private void analyzeSkinType() {
        String skinTypeResult = "";

        int selectedIdQ1 = radioGroupQuestion1.getCheckedRadioButtonId();
        if (selectedIdQ1 != -1) {
            RadioButton selectedRadioButtonQ1 = findViewById(selectedIdQ1);
            String skinFeel = selectedRadioButtonQ1.getText().toString();

            if (skinFeel.equals("Dry and tight")) {
                skinTypeResult = "Dry Skin";
            } else if (skinFeel.equals("Oily and shiny")) {
                skinTypeResult = "Oily Skin";
            } else if (skinFeel.equals("Feels balanced")) {
                skinTypeResult = "Normal Skin";
            }
        }

        int selectedIdQ3 = radioGroupQuestion3.getCheckedRadioButtonId();
        if (selectedIdQ3 != -1) {
            RadioButton selectedRadioButtonQ3 = findViewById(selectedIdQ3);
            String oilFrequency = selectedRadioButtonQ3.getText().toString();

            if (oilFrequency.equals("Frequently") && skinTypeResult.equals("Normal Skin")) {
                skinTypeResult = "Combination Skin";
            } else if (oilFrequency.equals("Sometimes") && skinTypeResult.equals("Dry Skin")) {
                skinTypeResult = "Dry Skin with Occasional Oiliness";
            }
        }

        boolean hasAcne = checkAcne.isChecked();
        boolean hasDryness = checkDryness.isChecked();
        boolean hasOiliness = checkOiliness.isChecked();
        boolean hasSensitivity = checkSensitivity.isChecked();

        if (hasOiliness && hasDryness) {
            skinTypeResult = "Combination Skin";
        } else if (hasSensitivity && hasDryness) {
            skinTypeResult = "Sensitive and Dry Skin";
        } else if (hasSensitivity && hasOiliness) {
            skinTypeResult = "Sensitive and Oily Skin";
        } else if (hasAcne && skinTypeResult.equals("Oily Skin")) {
            skinTypeResult = "Oily and Acne-Prone Skin";
        } else if (hasDryness && skinTypeResult.equals("Dry Skin")) {
            skinTypeResult = "Dry and Dehydrated Skin";
        } else if (skinTypeResult.isEmpty()) {
            skinTypeResult = "Unclear Skin Type";
        }

        txtViewResult.setText("Your skin type is: " + skinTypeResult);
        txtViewResult.setVisibility(View.VISIBLE);
    }
}
package com.example.assignment1;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

public class RecommendationsActivity extends AppCompatActivity {
    private Spinner spinnerSkinType;
    private Button btnGetRecommendations;
    private TextView txtCleanser, txtMoisturizer, txtSunscreen;
    private LinearLayout layoutRecommendations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_recommendations);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        spinnerSkinType = findViewById(R.id.spinnerSkinType);
        btnGetRecommendations = findViewById(R.id.btnGetRecommendations);
        txtCleanser = findViewById(R.id.txtCleanserRecommendation);
        txtMoisturizer = findViewById(R.id.txtMoisturizerRecommendation);
        txtSunscreen = findViewById(R.id.txtSunscreenRecommendation);
        layoutRecommendations = findViewById(R.id.recommendationsLayout);

        String[] skinTypes = {"Dry Skin", "Oily Skin", "Combination Skin"};
        ArrayAdapter<String> skinTypeAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, skinTypes);
        skinTypeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerSkinType.setAdapter(skinTypeAdapter);


        btnGetRecommendations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selectedSkinType = spinnerSkinType.getSelectedItem().toString();
                ProductMockupDA productMockupDA = new ProductMockupDA();
                List<Product> recommendations = null;
                if (selectedSkinType.equals("Oily Skin")) {
                    recommendations = productMockupDA.getRecommendedProductsForOily();
                } else if (selectedSkinType.equals("Dry Skin")) {
                    recommendations = productMockupDA.getRecommendedProductsForDry();
                } else if (selectedSkinType.equals("Combination Skin")) {
                    recommendations = productMockupDA.getRecommendedProductsForCombination();
                }

                if (recommendations != null && !recommendations.isEmpty()) {

                    Product cleanser = recommendations.get(0);
                    Product moisturizer = recommendations.get(1);
                    Product sunscreen = recommendations.get(2);

                    txtCleanser.setText("Cleanser: " + cleanser.getName());
                    txtMoisturizer.setText("Moisturizer: " + moisturizer.getName());
                    txtSunscreen.setText("Sunscreen: " + sunscreen.getName());

                    layoutRecommendations.setVisibility(View.VISIBLE);
                    txtCleanser.setVisibility(View.VISIBLE);
                    txtMoisturizer.setVisibility(View.VISIBLE);
                    txtSunscreen.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(RecommendationsActivity.this, "No recommendations available", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

 }

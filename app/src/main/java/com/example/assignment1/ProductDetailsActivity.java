package com.example.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ProductDetailsActivity extends AppCompatActivity {

    private TextView txtProductName, txtProductDescription, txtProductPrice, txtProductBrand;
    private ImageView imgProduct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_product_details);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        txtProductName = findViewById(R.id.txtProductName);
        txtProductDescription = findViewById(R.id.txtProductDescription);
        txtProductPrice = findViewById(R.id.txtProductPrice);
        txtProductBrand = findViewById(R.id.txtProductBrand);
        imgProduct = findViewById(R.id.imgProduct);

        Intent intent = getIntent();
        String name = intent.getStringExtra("productName");
        double price = intent.getDoubleExtra("productPrice", 0.0);
        String brand = intent.getStringExtra("productBrand");
        String description = intent.getStringExtra("productDescription");
        int imageId = intent.getIntExtra("productImage", R.drawable.applogo);


        txtProductName.setText(name);
        txtProductDescription.setText("Description: " + description);
        txtProductPrice.setText(String.format("$%.2f", price));
        txtProductBrand.setText("Brand: " + brand);
        imgProduct.setImageResource(imageId);
    }
}
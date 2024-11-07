package com.example.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class ProductsActivity extends AppCompatActivity {

    private ProductMockupDA productMockupDA;
    private Spinner spinnerSkinType, spinnerCategory;
    private ListView lstProducts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_products);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        spinnerSkinType = findViewById(R.id.spinnerSkinType);
        spinnerCategory = findViewById(R.id.spinnerCategory);
        lstProducts = findViewById(R.id.lstProducts);

        productMockupDA = new ProductMockupDA();

        setUpSpinners();

        setUpListView("All", "All");

        lstProducts.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Product selectedProduct = (Product) parent.getItemAtPosition(position);

                Intent intent = new Intent(ProductsActivity.this, ProductDetailsActivity.class);
                intent.putExtra("productName", selectedProduct.getName());
                intent.putExtra("productPrice", selectedProduct.getPrice());
                intent.putExtra("productDescription", selectedProduct.getDescription());
                intent.putExtra("productCategory", selectedProduct.getCategory());
                intent.putExtra("productSkinType", selectedProduct.getSkinType());
                intent.putExtra("productImage", selectedProduct.getImageID());
                intent.putExtra("productBrand", selectedProduct.getBrand());


                startActivity(intent);
            }
        });


    }

    private void setUpSpinners() {
        ArrayAdapter<String> skinTypeAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, productMockupDA.getSkinTypes());
        skinTypeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerSkinType.setAdapter(skinTypeAdapter);

        ArrayAdapter<String> categoryAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, productMockupDA.getProductCategories());
        categoryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCategory.setAdapter(categoryAdapter);

        spinnerSkinType.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedSkinType = (String) parentView.getItemAtPosition(position);
                String selectedCategory = (String) spinnerCategory.getSelectedItem();
                setUpListView(selectedSkinType, selectedCategory);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {

            }
        });

        spinnerCategory.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedCategory = (String) parentView.getItemAtPosition(position);
                String selectedSkinType = (String) spinnerSkinType.getSelectedItem();
                setUpListView(selectedSkinType, selectedCategory);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {

            }
        });
    }

    private void setUpListView(String skinType, String category) {
        List<Product> filteredProducts = productMockupDA.getFilteredProducts(skinType, category);
        List<String> productNames = new ArrayList<>();
        for (Product product : filteredProducts) {
            productNames.add(product.getName());
        }
        ArrayAdapter<Product> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, filteredProducts);
        lstProducts.setAdapter(adapter);
    }
}
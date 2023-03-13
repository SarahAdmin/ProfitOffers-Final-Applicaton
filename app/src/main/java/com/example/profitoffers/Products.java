package com.example.profitoffers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class Products extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);
    }
    public void BackHome2 (View view) {
        Intent mainHomeIntent = new Intent(this, Home.class);
        startActivity(mainHomeIntent);
    }
    public void productNine(View view) {
        Intent proIntent9 = new Intent(this, Product9.class);
        startActivity(proIntent9);
    }
    public void productTen(View view) {
        Intent proIntent10 = new Intent(this, Product10.class);
        startActivity(proIntent10);
    }
    public void productEleven(View view) {
        Intent proIntent11 = new Intent(this, Product11.class);
        startActivity(proIntent11);
    }
    public void productTwelve(View view) {
        Intent proIntent12 = new Intent(this, Product12.class);
        startActivity(proIntent12);
    }
}
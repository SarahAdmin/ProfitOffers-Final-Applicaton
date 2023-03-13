package com.example.profitoffers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;


public class FeaturedProducts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_featured_products);
    }


    public void BackHomePage (View view) {
        Intent homeIntent2 = new Intent(this,Home.class);
        startActivity(homeIntent2);
    }
    public void productOne(View view) {
        Intent proIntent1 = new Intent(this, Product1.class);
        startActivity(proIntent1);
    }
    public void productTwo(View view) {
        Intent proIntent2 = new Intent(this, Product2.class);
        startActivity(proIntent2);
    }
    public void productThree(View view) {
        Intent proIntent3 = new Intent(this, Product3.class);
        startActivity(proIntent3);
    }
    public void productFour(View view) {
        Intent proIntent4 = new Intent(this, Product4.class);
        startActivity(proIntent4);
    }
}
package com.example.profitoffers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
public class Promotions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promotions);
    }

    public void GoBackHome (View view) {
        Intent homeIntent3 = new Intent(this, Home.class);
        startActivity(homeIntent3);
    }

    public void productFive(View view ) {
        Intent proIntent5 = new Intent(this, Product5.class);
        startActivity(proIntent5);
    }

    public void productSix(View view) {
        Intent proIntent6 = new Intent(this, Product6.class);
        startActivity(proIntent6);
    }
    public void productSeven(View view) {
        Intent proIntent7 = new Intent(this, Product7.class);
        startActivity(proIntent7);
    }
    public void productEight(View view) {
        Intent proIntent8 = new Intent(this,Product8.class);
        startActivity(proIntent8);
    }
}
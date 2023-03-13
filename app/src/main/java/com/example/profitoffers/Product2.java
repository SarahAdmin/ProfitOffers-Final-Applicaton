package com.example.profitoffers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;

public class Product2 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner quantity2;
    Integer ItemQuan[] = {1,2,3,4,5,6,7,8,9,10};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product2);
        quantity2 = findViewById(R.id.pro2_spinner);
        quantity2.setOnItemSelectedListener(this);
        ArrayAdapter QuanTwo = new ArrayAdapter(this, android.R.layout.simple_spinner_item,ItemQuan);
        QuanTwo.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        quantity2.setAdapter(QuanTwo);
    }

    public void GoBack2(View view) {
        Intent productIntent1 = new Intent(this, FeaturedProducts.class);
        startActivity(productIntent1);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
package com.example.profitoffers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;

public class Product3 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner spinnerThree;
    Integer ItemQuan[] = {0,1,2,3,4,5,6,7,8,9,10};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product3);
        spinnerThree = findViewById(R.id.pro3_spinner);
        spinnerThree.setOnItemSelectedListener(this);
        ArrayAdapter QuanThree = new ArrayAdapter(this, android.R.layout.simple_spinner_item, ItemQuan);
        QuanThree.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerThree.setAdapter(QuanThree);
    }

    public void GoBack3(View view ) {
        Intent productIntent8 = new Intent(this,FeaturedProducts.class);
        startActivity(productIntent8);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
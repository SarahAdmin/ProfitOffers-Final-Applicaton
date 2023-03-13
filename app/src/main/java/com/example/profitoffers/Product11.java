package com.example.profitoffers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Spinner;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

public class Product11 extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    Spinner spinnerEleven;
    Integer QuanItem[] = {0,1,2,3,4,5,6,7,8,9,10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product11);
        spinnerEleven = findViewById(R.id.pro11_spinner);
        spinnerEleven.setOnItemSelectedListener(this);
        ArrayAdapter QuanEleven = new ArrayAdapter(this, android.R.layout.simple_spinner_item, QuanItem);
        QuanEleven.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerEleven.setAdapter(QuanEleven);

    }
    public void GoBackProducts(View view) {
        Intent itemThree = new Intent(this, Products.class);
        startActivity(itemThree);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
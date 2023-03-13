package com.example.profitoffers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Spinner;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

public class Product9 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner spinnerNine;
    Integer QuanItem[]  = {0,1,2,3,4,5,6,7,8,9,10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product9);
        spinnerNine = findViewById(R.id.pro9_spinner);
        spinnerNine.setOnItemSelectedListener(this);
        ArrayAdapter QuanNine = new ArrayAdapter(this, android.R.layout.simple_spinner_item,QuanItem);
        QuanNine.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerNine.setAdapter(QuanNine);
    }

    public void GoBackProducts(View view) {
        Intent itemOne = new Intent(this, Products.class);
        startActivity(itemOne);
    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
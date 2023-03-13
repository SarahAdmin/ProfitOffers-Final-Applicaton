package com.example.profitoffers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Spinner;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

public class Product10 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner spinnerTen;
    Integer QuanItem[] = {0,1,2,3,4,5,6,7,8,9,10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product10);
        spinnerTen = findViewById(R.id.pro10_spinner);
        spinnerTen.setOnItemSelectedListener(this);
        ArrayAdapter QuanTen = new ArrayAdapter(this, android.R.layout.simple_spinner_item,QuanItem);
        QuanTen.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerTen.setAdapter(QuanTen);
    }

    public void GoBackProducts (View view) {
        Intent itemTwo = new Intent(this, Products.class);
        startActivity(itemTwo);
    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
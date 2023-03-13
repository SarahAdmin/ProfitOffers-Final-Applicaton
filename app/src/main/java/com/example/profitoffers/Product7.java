package com.example.profitoffers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Spinner;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

public class Product7 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinnerSeven;
    Integer QuanItem[] = {0,1,2,3,4,5,6,7,8,9,10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product7);
        spinnerSeven = findViewById(R.id.pro7_spinner);
        spinnerSeven.setOnItemSelectedListener(this);
        ArrayAdapter QuanSeven = new ArrayAdapter(this, android.R.layout.simple_spinner_item, QuanItem);
        QuanSeven.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerSeven.setAdapter(QuanSeven);
    }
    public void GoBackPromotions(View view) {
        Intent proReturn3 = new Intent(this, Promotions.class);
        startActivity(proReturn3);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
package com.example.profitoffers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Spinner;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

public class Product6 extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    Spinner spinnerSix;
    Integer QuanItem[] = {0,1,2,3,4,5,6,7,8,9,10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product6);
        spinnerSix = findViewById(R.id.pro6_spinner);
        spinnerSix.setOnItemSelectedListener(this);
        ArrayAdapter QuanSix = new ArrayAdapter(this,android.R.layout.simple_spinner_item,QuanItem);
        QuanSix.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerSix.setAdapter(QuanSix);
    }
    public void GoBackPromotions(View view) {
        Intent proReturn2 = new Intent(this, Promotions.class);
        startActivity(proReturn2);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
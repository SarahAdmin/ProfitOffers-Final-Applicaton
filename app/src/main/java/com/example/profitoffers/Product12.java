package com.example.profitoffers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Spinner;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

public class Product12 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner spinnerTwelve;
    Integer QuanItem[] = {0,1,2,3,4,5,6,7,8,9,10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product12);
        spinnerTwelve = findViewById(R.id.pro12_spinner);
        spinnerTwelve.setOnItemSelectedListener(this);
        ArrayAdapter QuanTwelve = new ArrayAdapter(this,android.R.layout.simple_spinner_item,QuanItem);
        QuanTwelve.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerTwelve.setAdapter(QuanTwelve);

    }

    public void GoBackProducts(View view ) {
        Intent itemFour = new Intent(this, Products.class);
        startActivity(itemFour);
    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
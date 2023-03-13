package com.example.profitoffers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
public class Product4 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner spinnerFour;
    Integer QuanItem[] = {0,1,2,3,4,5,6,7,8,9,10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product4);
        spinnerFour = findViewById(R.id.pro4_spinner);
        spinnerFour.setOnItemSelectedListener(this);
        ArrayAdapter QuanFour = new ArrayAdapter(this,android.R.layout.simple_spinner_item, QuanItem);
        QuanFour.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerFour.setAdapter(QuanFour);
    }
    public void GoBack4(View view) {
        Intent productIntent4 = new Intent(this,FeaturedProducts.class);
        startActivity(productIntent4);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
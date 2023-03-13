package com.example.profitoffers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;

public class Product1 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner quantity1;
    Integer ItemQuan[] = {1,2,3,4,5,6,7,8,9,10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product1);
        quantity1 = findViewById(R.id.pro1_spinner);
        quantity1.setOnItemSelectedListener(this);
        ArrayAdapter itemOne = new ArrayAdapter(this,android.R.layout.simple_spinner_item,ItemQuan);
        itemOne.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        quantity1.setAdapter(itemOne);
    }
    public void GoBackHome(View view) {
        Intent homeIntent5 = new Intent(this,FeaturedProducts.class);
        startActivity(homeIntent5);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
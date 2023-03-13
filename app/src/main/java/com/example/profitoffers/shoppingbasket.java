package com.example.profitoffers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class shoppingbasket extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoppingbasket);
    }
    public void backToHomePage(View view) {
        Intent homePageIntent = new Intent(this,Home.class);
        startActivity(homePageIntent);
    }
    public void CheckOutPage (View view) {
        Intent checkoutIntent = new Intent(this,PaymentDetails.class);
        startActivity(checkoutIntent);
    }
}
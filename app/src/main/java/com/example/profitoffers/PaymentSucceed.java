package com.example.profitoffers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class PaymentSucceed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_succeed);
    }

    public void HomePage(View view) {
        Intent homeIntentOne = new Intent(this, Home.class);
        startActivity(homeIntentOne);
    }
}
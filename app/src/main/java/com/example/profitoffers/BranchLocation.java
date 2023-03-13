package com.example.profitoffers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class BranchLocation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branch_location);
    }
    public void GoBacktoHomePage (View view) {
        Intent homeIntent = new Intent(this, Home.class);
        startActivity(homeIntent);
    }
}
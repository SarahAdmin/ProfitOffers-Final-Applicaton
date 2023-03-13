package com.example.profitoffers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;


public class ChooseACard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_acard);
    }
    public void AttachYourProof(View view) {
        Intent proofIntent = new Intent(this,ProofAddress.class);
        startActivity(proofIntent);
    }
    public void backToRegister(View view) {
        Intent backRegIntent = new Intent(this, Register.class);
        startActivity(backRegIntent);
    }
}
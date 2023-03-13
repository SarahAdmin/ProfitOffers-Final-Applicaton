package com.example.profitoffers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class TermsandConditions extends AppCompatActivity {
    CheckBox acceptTermsAndConditions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_termsand_conditions);
        acceptTermsAndConditions  = (CheckBox) findViewById(R.id.acceptedCheckbox);
        acceptTermsAndConditions.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton checkButtonView, boolean isChecked) {
                if (checkButtonView.isChecked()) {
                    acceptTermsAndConditions.setText("I Accepted Terms and Conditions");
                } else {
                    acceptTermsAndConditions.setText("Accept Terms and Conditions");
                }
            }
        });
    }
    public void RegisterContinue(View view) {
        Intent registerIntent = new Intent(this, Register.class);
        startActivity(registerIntent);
    }
}
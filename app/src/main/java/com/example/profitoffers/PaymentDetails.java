package com.example.profitoffers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Toast;
import android.util.Patterns;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;


public class PaymentDetails extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Integer monthArray[] = {0,1,2,3,4,5,6,7,8,9,10,11,12};
    Integer yearArray[] = {2023,2024,2025,2026,2027,2028,2029,2030,2031, 2032};
    EditText cardholder_name;
    EditText card_no;
    EditText cvv;
    ImageView masterCardLogo;
    ImageView visaLogo;
    ImageView amexLogo;
    ImageView stripeLogo;
    Spinner month;
    Spinner year;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_details);
        cardholder_name = findViewById(R.id.cardholder_name_input);
        card_no = findViewById(R.id.card_number_input);
        month = findViewById(R.id.month_spinner);
        month.setOnItemSelectedListener(this);
        ArrayAdapter ExpiryMonth = new ArrayAdapter(this, android.R.layout.simple_spinner_item, monthArray);
        ExpiryMonth.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        month.setAdapter(ExpiryMonth);
        year = findViewById(R.id.year_spinner);
        year.setOnItemSelectedListener(this);
        ArrayAdapter ExpiryYear = new ArrayAdapter(this, android.R.layout.simple_spinner_item, yearArray);
        ExpiryYear.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        year.setAdapter(ExpiryYear);
        cvv = findViewById(R.id.cvv_input);
        masterCardLogo = findViewById(R.id.mastercard_image);
        visaLogo = findViewById(R.id.visa_image);
        amexLogo = findViewById(R.id.amex_image);
        stripeLogo = findViewById(R.id.stripe_image);

    }
    boolean isEmpty(EditText detailText) {
        CharSequence str = detailText.getText().toString();
        return TextUtils.isEmpty(str);
    }

    void PayInfoChecked() {
        if(isEmpty(cardholder_name)) {
            cardholder_name.setError("Enter your cardholder name.");
        }
        if(isEmpty(card_no)) {
            card_no.setError("Enter your card number in 16 digits");
        }
        if(isEmpty(cvv)) {
            cvv.setError("Enter your CVV in 3 digits on back of your card");
        }
    }


    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Integer month [] = {1,2,3,4,5,6,7,8,9,10,11,12};
        Integer year[] = {2023,2024, 2025, 2026, 2027, 2028, 2029, 2030, 2031, 2032};
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void GoBacktoAttachFile (View view) {
        Intent AttachOne = new Intent(this, ProofAddress.class);
        startActivity(AttachOne);
        Toast.makeText(this, "Page Succeed!", Toast.LENGTH_LONG).show();
    }
    public void PaymentFinished (View view) {
        Intent payIntentTwo = new Intent(this, PaymentSucceed.class);
        startActivity(payIntentTwo);
        Toast.makeText(this, "Payment Succeed!", Toast.LENGTH_LONG).show();
    }
}